package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Repository;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.Executors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Model.ModelUserdetails;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Persistence.UserDAO;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Persistence.UserDatabase;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.ApiCall;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.ApiInterface;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.LoginRequest;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.LoginResponse;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.UserDetails;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.RetrofitClient;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Util.helper.Utils;

public class LoginRepository {
    private Context mContext;
    private static final String TAG = LoginRepository.class.getSimpleName();
    private static LoginRepository loginRepository = null;
    private UserDAO userDAO;

    public static LoginRepository getInstance(Context context) {
        if (loginRepository == null)
            loginRepository = new LoginRepository(context);
        return loginRepository;
    }

    public LoginRepository(Context context) {
        userDAO = UserDatabase.getInstance(context).getUserDAO();
        this.mContext = context;
    }

    public LiveData<LoginResponse> login(LoginRequest loginRequest) {
        final MutableLiveData<LoginResponse> liveData = new MutableLiveData<>();
        Gson gson = new GsonBuilder().create();
        Log.e("Json", gson.toJson(loginRequest));
        Utils.show(mContext);
        Utils.log(TAG, gson.toJson(loginRequest));
        ApiCall.PostMethod(loginRequest, new ApiCall.ApiResponseHandler() {
            @Override
            public void setResponseSuccess(final LoginResponse response) {
                Utils.dismiss();
                Utils.log(TAG, "Api_response: " + response);
                if (response != null) {
                    if (response.getUserDetails() != null) {
                        Executors.newSingleThreadExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                ModelUserdetails modelUserdetails = response.getUserDetails();
                                long rowid = userDAO.insertUser(modelUserdetails);
                                if (rowid == -1) {
                                    Log.d(TAG, "saveCallResult: CONFLICT... This recipe is already in the cache");
                                    // if the recipe already exists... I don't want to set the ingredients or timestamp b/c
                                    // they will be erased
                                    userDAO.updateUsers(modelUserdetails.getUserID(),modelUserdetails.getUsertypeID(),
                                            modelUserdetails.getUserName(),modelUserdetails.getPassword(),
                                            modelUserdetails.getEmail());
                                }
                            }
                        });
                    }
                    liveData.setValue(response);
                }
            }

            @Override
            public void setResponseError(String error) {
                Utils.dismiss();
                Utils.log(TAG, "Api_response: " + error);
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setStatusmessage(error);
                loginResponse.setStatuscode(1);
                liveData.setValue(loginResponse);
            }
        });

        return liveData;
    }
}

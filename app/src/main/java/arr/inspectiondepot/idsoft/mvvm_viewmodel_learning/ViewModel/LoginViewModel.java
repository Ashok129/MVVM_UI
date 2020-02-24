package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Repository.LoginRepository;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.LoginRequest;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.LoginResponse;

public class LoginViewModel extends AndroidViewModel {

    LoginRepository loginRepository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        loginRepository = LoginRepository.getInstance(application);
    }

    public LiveData<LoginResponse> login(LoginRequest loginRequest) {
        return loginRepository.login(loginRequest);
    }
}

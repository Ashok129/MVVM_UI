package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request;

import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.LoginResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiCall {


    private static final int MY_SOCKET_TIMEOUT_MS = 50000;
    private static String TAG = ApiCall.class.getSimpleName();


    public static void PostMethod(LoginRequest loginRequest, final ApiResponseHandler volleyCallback) {

        ApiInterface apiInterface = RetrofitClient.getClient_localAPI().create(ApiInterface.class);

        Call<LoginResponse> call = apiInterface.ValidateUser(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                LoginResponse loginresponse = response.body();
                if (loginresponse != null) {
                    if (loginresponse.getStatuscode() == 0) {
                        volleyCallback.setResponseSuccess(loginresponse);
                    } else {
                        volleyCallback.setResponseError(loginresponse.getStatusmessage());
                    }
                } else {
                    volleyCallback.setResponseError("Error");
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                volleyCallback.setResponseError(t.getMessage().toString());
            }
        });

    }

    public interface ApiResponseHandler {

        public void setResponseSuccess(LoginResponse response);

        public void setResponseError(String error);

    }

}

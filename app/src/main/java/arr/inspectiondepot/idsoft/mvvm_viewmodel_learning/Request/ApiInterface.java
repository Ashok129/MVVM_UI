package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request;

import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("api/UserDetails/ValidateUser")
    Call<LoginResponse> ValidateUser(@Body LoginRequest loginRequest);
}

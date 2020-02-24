package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    public static String baseUrl_local = "YOUR BASE URL";
    private static Retrofit retrofit_local = null;

    public static final String NAMESPACE = "http://tempuri.org/";

    public static Retrofit getClient_localAPI() {
        if (retrofit_local == null) {
            retrofit_local = new Retrofit.Builder()
                    .baseUrl(baseUrl_local)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit_local;
    }
}

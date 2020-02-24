package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.LoginRequest;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.R;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response.LoginResponse;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.ViewModel.LoginViewModel;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button _Signin;
    EditText _txt_email,_txt_psw;
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_activity);

        initViews();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void initViews() {
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        _Signin = (Button) findViewById(R.id.btn_signIn);
        _txt_email = (EditText) findViewById(R.id.txt_email);
        _txt_psw = (EditText) findViewById(R.id.txt_psw);

        _Signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == _Signin) {
            LoginRequest loginRequest = validateUser();
            if (loginRequest != null) {
                if (isInternetConnection()) {
                    LoginApi(loginRequest);
                } else {
                    Toast.makeText(this, "Please Check Internet Connection", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private LoginRequest validateUser() {
        LoginRequest loginRequest = new LoginRequest();
        boolean flag = false;
        String username = _txt_email.getText().toString();
        String password = _txt_psw.getText().toString();

        if (username.toString().isEmpty()) {
            _txt_email.setError("Please enter the username");
            _txt_email.requestFocus();
            flag = true;
        }

        if (password.toString().isEmpty()) {
            _txt_psw.setError("Please enter the password");
            _txt_psw.requestFocus();
            flag = true;
        }

        if (flag)
            return null;

        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        return loginRequest;
    }

    private void LoginApi(LoginRequest loginRequest) {
        loginViewModel.login(loginRequest).observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                if (loginResponse != null) {
                    if (loginResponse.getStatuscode() == 0) {
                        Toast.makeText(LoginActivity.this,"Success",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(LoginActivity.this,loginResponse.getStatusmessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public boolean isInternetConnection() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

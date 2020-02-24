package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserDetails implements Serializable
{

    @SerializedName("UserID")
    @Expose
    private Integer userID;
    @SerializedName("UsertypeID")
    @Expose
    private Integer usertypeID;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("Email")
    @Expose
    private String email;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getUsertypeID() {
        return usertypeID;
    }

    public void setUsertypeID(Integer usertypeID) {
        this.usertypeID = usertypeID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

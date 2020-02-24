package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Model.ModelUserdetails;

public class LoginResponse implements Serializable
{

    @SerializedName("statuscode")
    @Expose
    private Integer statuscode;
    @SerializedName("statusmessage")
    @Expose
    private String statusmessage;
    @SerializedName("userDetails")
    @Expose
    private ModelUserdetails userDetails;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("licence")
    @Expose
    private List<Licence> licence = null;

    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatusmessage() {
        return statusmessage;
    }

    public void setStatusmessage(String statusmessage) {
        this.statusmessage = statusmessage;
    }

    public ModelUserdetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(ModelUserdetails userDetails) {
        this.userDetails = userDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Licence> getLicence() {
        return licence;
    }

    public void setLicence(List<Licence> licence) {
        this.licence = licence;
    }

}

package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Licence implements Serializable
{

    @SerializedName("UserLicence_No")
    @Expose
    private String userLicenceNo;
    @SerializedName("UserLicence_Type_Id")
    @Expose
    private String userLicenceTypeId;
    @SerializedName("UserLicence_Type_Value")
    @Expose
    private String userLicenceTypeValue;
    @SerializedName("UserLicence_Photo")
    @Expose
    private String userLicencePhoto;
    @SerializedName("UserLicence_Comments")
    @Expose
    private String userLicenceComments;
    @SerializedName("UserLicence_Issued_Date")
    @Expose
    private String userLicenceIssuedDate;
    @SerializedName("UserLicence_Expire_Date")
    @Expose
    private String userLicenceExpireDate;

    public String getUserLicenceNo() {
        return userLicenceNo;
    }

    public void setUserLicenceNo(String userLicenceNo) {
        this.userLicenceNo = userLicenceNo;
    }

    public String getUserLicenceTypeId() {
        return userLicenceTypeId;
    }

    public void setUserLicenceTypeId(String userLicenceTypeId) {
        this.userLicenceTypeId = userLicenceTypeId;
    }

    public String getUserLicenceTypeValue() {
        return userLicenceTypeValue;
    }

    public void setUserLicenceTypeValue(String userLicenceTypeValue) {
        this.userLicenceTypeValue = userLicenceTypeValue;
    }

    public String getUserLicencePhoto() {
        return userLicencePhoto;
    }

    public void setUserLicencePhoto(String userLicencePhoto) {
        this.userLicencePhoto = userLicencePhoto;
    }

    public String getUserLicenceComments() {
        return userLicenceComments;
    }

    public void setUserLicenceComments(String userLicenceComments) {
        this.userLicenceComments = userLicenceComments;
    }

    public String getUserLicenceIssuedDate() {
        return userLicenceIssuedDate;
    }

    public void setUserLicenceIssuedDate(String userLicenceIssuedDate) {
        this.userLicenceIssuedDate = userLicenceIssuedDate;
    }

    public String getUserLicenceExpireDate() {
        return userLicenceExpireDate;
    }

    public void setUserLicenceExpireDate(String userLicenceExpireDate) {
        this.userLicenceExpireDate = userLicenceExpireDate;
    }

}

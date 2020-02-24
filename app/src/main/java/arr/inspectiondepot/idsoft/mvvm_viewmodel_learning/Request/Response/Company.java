package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Request.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Company implements Serializable
{

    @SerializedName("Company_Id")
    @Expose
    private Integer companyId;
    @SerializedName("Company_name")
    @Expose
    private String companyName;
    @SerializedName("Company_CEO_FirstName")
    @Expose
    private String companyCEOFirstName;
    @SerializedName("Company_CEO_LastName")
    @Expose
    private String companyCEOLastName;
    @SerializedName("Company_Address1")
    @Expose
    private String companyAddress1;
    @SerializedName("Company_Address2")
    @Expose
    private String companyAddress2;
    @SerializedName("Company_City")
    @Expose
    private String companyCity;
    @SerializedName("Company_State")
    @Expose
    private String companyState;
    @SerializedName("Company_Zip")
    @Expose
    private String companyZip;
    @SerializedName("Company_Phone")
    @Expose
    private String companyPhone;
    @SerializedName("Company_Photo")
    @Expose
    private String companyPhoto;
    @SerializedName("Company_Email")
    @Expose
    private String companyEmail;
    @SerializedName("Company_Website")
    @Expose
    private String companyWebsite;
    @SerializedName("Company_Logo")
    @Expose
    private String companyLogo;
    @SerializedName("Company_RegDate")
    @Expose
    private String companyRegDate;
    @SerializedName("Company_Signatureext")
    @Expose
    private String companySignatureext;
    private final static long serialVersionUID = -3240946796958320478L;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCEOFirstName() {
        return companyCEOFirstName;
    }

    public void setCompanyCEOFirstName(String companyCEOFirstName) {
        this.companyCEOFirstName = companyCEOFirstName;
    }

    public String getCompanyCEOLastName() {
        return companyCEOLastName;
    }

    public void setCompanyCEOLastName(String companyCEOLastName) {
        this.companyCEOLastName = companyCEOLastName;
    }

    public String getCompanyAddress1() {
        return companyAddress1;
    }

    public void setCompanyAddress1(String companyAddress1) {
        this.companyAddress1 = companyAddress1;
    }

    public String getCompanyAddress2() {
        return companyAddress2;
    }

    public void setCompanyAddress2(String companyAddress2) {
        this.companyAddress2 = companyAddress2;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getCompanyZip() {
        return companyZip;
    }

    public void setCompanyZip(String companyZip) {
        this.companyZip = companyZip;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyPhoto() {
        return companyPhoto;
    }

    public void setCompanyPhoto(String companyPhoto) {
        this.companyPhoto = companyPhoto;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyRegDate() {
        return companyRegDate;
    }

    public void setCompanyRegDate(String companyRegDate) {
        this.companyRegDate = companyRegDate;
    }

    public String getCompanySignatureext() {
        return companySignatureext;
    }

    public void setCompanySignatureext(String companySignatureext) {
        this.companySignatureext = companySignatureext;
    }

}

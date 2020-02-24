package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Userdb")
public class ModelUserdetails implements Parcelable {
    @PrimaryKey
    @NonNull
    private Integer userID;
    @ColumnInfo(name = "usertypeID")
    private Integer usertypeID;
    @ColumnInfo(name = "userName")
    private String userName;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "email")
    private String email;

    public ModelUserdetails() {
    }

    public ModelUserdetails(@NonNull Integer userID, Integer usertypeID, String userName, String password, String email) {
        this.userID = userID;
        this.usertypeID = usertypeID;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    protected ModelUserdetails(Parcel in) {
        userID = in.readInt();
        usertypeID = in.readInt();
        userName = in.readString();
        password = in.readString();
        email = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userID);
        dest.writeInt(usertypeID);
        dest.writeString(userName);
        dest.writeString(password);
        dest.writeString(email);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ModelUserdetails> CREATOR = new Creator<ModelUserdetails>() {
        @Override
        public ModelUserdetails createFromParcel(Parcel in) {
            return new ModelUserdetails(in);
        }

        @Override
        public ModelUserdetails[] newArray(int size) {
            return new ModelUserdetails[size];
        }
    };

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

    @Override
    public String toString() {
        return "ModelUserdetails{" +
                "userID=" + userID +
                ", usertypeID=" + usertypeID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Persistence;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.Query;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Model.ModelUserdetails;

import static androidx.room.OnConflictStrategy.IGNORE;
import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDAO {
    @Insert(onConflict = IGNORE)
    long[] insertUsers(ModelUserdetails... recipe);

    @Insert(onConflict = REPLACE)
    long insertUser(ModelUserdetails recipe);

    @Query("UPDATE userdb SET usertypeID = :usertypeID, userName = :userName, password = :password, email = :email " +
            "WHERE userID = :userID")
    void updateUsers(int userID,int usertypeID, String userName, String password, String email);

    @Query("Select * from userdb Where userID =:UserId")
    LiveData<ModelUserdetails> getUsers(int UserId);
}

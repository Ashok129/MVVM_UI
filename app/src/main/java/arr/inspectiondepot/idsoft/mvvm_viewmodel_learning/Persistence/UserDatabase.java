package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Persistence;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Model.ModelUserdetails;

@Database(entities = {ModelUserdetails.class}, version = 2)
@TypeConverters({Converters.class})
public abstract class UserDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "Userdb";

    private static UserDatabase userDB_Instance;

    public static UserDatabase getInstance(Context context) {
        if (userDB_Instance == null)
            userDB_Instance = Room.databaseBuilder(context.getApplicationContext(),
                    UserDatabase.class,DATABASE_NAME)
                    .addMigrations(MIGRATION_1_2)
                    .build();
        return userDB_Instance;
    }

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
            database.execSQL("ALTER TABLE 'Userdb' ADD COLUMN 'userName' TEXT NOT NULL");
        }
    };

    public abstract UserDAO getUserDAO();

}

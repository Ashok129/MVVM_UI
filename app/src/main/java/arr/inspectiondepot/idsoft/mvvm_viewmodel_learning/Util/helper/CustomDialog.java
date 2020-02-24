package arr.inspectiondepot.idsoft.mvvm_viewmodel_learning.Util.helper;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/*
 * Created by User on 11-02-2017.
 */


public class CustomDialog extends Dialog {
    @SuppressWarnings("ConstantConditions")
    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


    }
}

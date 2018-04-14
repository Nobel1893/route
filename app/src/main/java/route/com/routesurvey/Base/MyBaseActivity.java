package route.com.routesurvey.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.afollestad.materialdialogs.MaterialDialog;

import route.com.routesurvey.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 4/14/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class MyBaseActivity extends AppCompatActivity{

   protected MyBaseActivity activity;
    MaterialDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
    }


   public MaterialDialog ShowProgressDialoge(){

        if (dialog==null||!dialog.isShowing())
        dialog=new MaterialDialog.Builder(this)
                .title(R.string.loading)
                .content(R.string.please_wait)
                .progress(true, 0)
                .cancelable(false)
                .show();

        else return dialog;

         return dialog;
    }

    public void HideProgressDialog(){

       if (dialog!=null&& dialog.isShowing())dialog.dismiss();

    }

    public MaterialDialog ShowMessage(String title,String mess){

        dialog=new MaterialDialog.Builder(this)
                .title(R.string.error_login)
                .content(mess)
                .positiveText(R.string.ok)
                .show();
        return dialog;
    }

    public MaterialDialog ShowConfirmationDialog(String title, String mess, String posText, String negText, MaterialDialog.SingleButtonCallback onPositiveClick){

        dialog=new MaterialDialog.Builder(this)
                .title(R.string.error_login)
                .content(mess)
                .positiveText(posText)
                .negativeText(negText)
                .onPositive(onPositiveClick)
                .show();

        return dialog;

    }




}

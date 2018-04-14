package route.com.routesurvey;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import route.com.routesurvey.Base.MyBaseActivity;

public class Login extends MyBaseActivity implements View.OnClickListener {

    protected TextView title;
    protected EditText userName;
    EditText password;
    Button login;
    public static String actTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
        //method 1 with static paramter
        title.setText(actTitle);
    }

    public void onLoginClick() {
        String Suser_name = userName.getText().toString();
        String Spassword = password.getText().toString();

        if (Suser_name.equals(""))
        {
            ShowMessage("error","please insert username");
        }
        else if (Spassword.equals("")){
            ShowMessage("error","please insert password");

        }

        else {
            ShowProgressDialoge();
        }

  //      Toast.makeText(Login.this, Suser_name, Toast.LENGTH_SHORT).show();
//        Snackbar.make(findViewById(R.id.parent), Suser_name, Snackbar.LENGTH_LONG).show();

        Log.e("username", Suser_name);
        Log.e("password", Spassword);

    /*    Intent i=new Intent(Login.this,HomeActivity.class);
        startActivity(i);
*/
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.login) {

            onLoginClick();
        }
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title);
        userName =  findViewById(R.id.user_name);
        password =  findViewById(R.id.password);
        login =  findViewById(R.id.login);
        login.setOnClickListener(Login.this);
    }
}

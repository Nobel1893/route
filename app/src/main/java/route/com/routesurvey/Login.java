package route.com.routesurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

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
/*
        String actitle=getIntent().getStringExtra("title");
        method 2 with parameter in intent
        if (actitle!=null){
            title.setText(actitle);
        }
*/
    }

    public void onLoginClick() {
        String Suser_name = userName.getText().toString();
        String Spassword = password.getText().toString();

        Toast.makeText(Login.this, Suser_name, Toast.LENGTH_SHORT).show();
        Snackbar.make(findViewById(R.id.parent), Suser_name, Snackbar.LENGTH_LONG).show();

        Log.e("username", Suser_name);
        Log.e("password", Spassword);

        Intent i=new Intent(Login.this,Courses.class);
        startActivity(i);

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

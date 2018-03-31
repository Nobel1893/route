package route.com.routesurvey;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,Login.class);
                Login.actTitle="Login";
                intent.putExtra("title","Login");
                startActivity(intent);
                finish();
            }
        },2000);


        Log.e("splash","Splash has started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("splash","resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("splash","pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("splash","start");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("splash","stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("splash","destroy");

    }
}

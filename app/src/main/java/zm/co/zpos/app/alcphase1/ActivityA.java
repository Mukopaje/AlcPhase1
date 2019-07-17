package zm.co.zpos.app.alcphase1;

import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity  {
    public ActivityA() {}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        StrictMode.ThreadPolicy policy = new
                StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public void goToAboutPage(View v){
        Intent myIntent = new Intent(getBaseContext(),   ActivityB.class);
        startActivity(myIntent);
    }

    public void goToMyProfilePage(View v){
        Intent myIntent = new Intent(getBaseContext(),   ActivityC.class);
        startActivity(myIntent);
    }
}

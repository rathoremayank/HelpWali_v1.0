package tk.mayankrathore.helpwali_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void toLogin(View v){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }
}

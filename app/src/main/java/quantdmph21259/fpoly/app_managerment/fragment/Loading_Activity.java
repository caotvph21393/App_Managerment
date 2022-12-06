package quantdmph21259.fpoly.app_managerment.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import quantdmph21259.fpoly.app_managerment.MainActivity;
import quantdmph21259.fpoly.app_managerment.R;

public class Loading_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Loading_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}
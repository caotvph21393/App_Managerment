package quantdmph21259.fpoly.app_managerment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    private Button btnDK;
    private Button btnDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDK=findViewById(R.id.btnDK);
        btnDN=findViewById(R.id.btn_login);
        btnDK.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(DangNhap.this,DangKi.class);
                startActivity(intent);
         }
     });
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DangNhap.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
package quantdmph21259.fpoly.app_managerment.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import quantdmph21259.fpoly.app_managerment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_DangNhap#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_DangNhap extends Fragment {



    public Fragment_DangNhap() {
        // Required empty public constructor
    }


    public static Fragment_DangNhap newInstance() {
        Fragment_DangNhap fragment = new Fragment_DangNhap();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__dang_nhap, container, false);
    }

    private EditText id_edt_login;
    private TextInputEditText etPassword_login;
    private CheckBox chk;
    private Button btn_login;

    private static final String FILE_NAME_SHARED = "fileUserLogin.txt";
    private static final String KEY_EMAIL = "keyEmail";
    private static final String KEY_PASSWORD = "keyPassword";
    private static final String KEY_STATUS_CHECK_BOX = "keyStatusCheckBox";

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        id_edt_login = view.findViewById(R.id.id_edt_login);
        etPassword_login = view.findViewById(R.id.etPassword_login);
        chk = view.findViewById(R.id.chk_login);
        btn_login = view.findViewById(R.id.btn_login);

        String username = id_edt_login.getText().toString().trim();
        String pass = etPassword_login.getText().toString().trim();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id_edt_login.getText().toString().isEmpty() || etPassword_login.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(), "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getActivity(), "bạn đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), Loading_Activity.class);
                    startActivity(intent);
                }
            }
        });



    }
}
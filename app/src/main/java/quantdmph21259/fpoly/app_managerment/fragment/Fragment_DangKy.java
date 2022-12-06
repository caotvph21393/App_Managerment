package quantdmph21259.fpoly.app_managerment.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quantdmph21259.fpoly.app_managerment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_DangKy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_DangKy extends Fragment {

    public Fragment_DangKy() {
        // Required empty public constructor
    }

    public static Fragment_DangKy newInstance() {
        Fragment_DangKy fragment = new Fragment_DangKy();
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
        return inflater.inflate(R.layout.fragment__dang_ky, container, false);
    }

    private EditText edt_signup_username, edt_signup_email;
    private TextInputEditText etPassword_signup, etPassword_re_signup;
    private Button btn_signup, btn_signup_cancel;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edt_signup_username = view.findViewById(R.id.edt_signup_username);
        edt_signup_email = view.findViewById(R.id.edt_signup_email);
        etPassword_signup = view.findViewById(R.id.etPassword_signup);
        etPassword_re_signup = view.findViewById(R.id.etPassword_re_signup);
        btn_signup= view.findViewById(R.id.btn_signup);
        btn_signup_cancel = view.findViewById(R.id.btn_signup_cancel);

        btn_signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (edt_signup_username.getText().toString().isEmpty() || edt_signup_email.getText().toString().isEmpty() ||
                        etPassword_signup.getText().toString().isEmpty() || etPassword_re_signup.getText().toString().isEmpty()) {
                    Toast.makeText(getActivity(), "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                } else if (!etPassword_re_signup.getText().toString().equals(etPassword_signup.getText().toString())) {
                    Toast.makeText(getActivity(), "Bạn nhập sai mật khẩu, mời nhập lại !", Toast.LENGTH_SHORT).show();
                }
                else if(!checkValidateEmail(edt_signup_email.getText().toString())){
                    Toast.makeText(getActivity(), "Bạn nhập sai email", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(), "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_signup_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_signup_username.setText("");
                edt_signup_email.setText("");
                etPassword_signup.setText("");
                etPassword_re_signup.setText("");
            }
        });


    }
    private boolean checkValidateEmail(CharSequence e){
        return !TextUtils.isEmpty(e) && Patterns.EMAIL_ADDRESS.matcher(e).matches();
    }
}
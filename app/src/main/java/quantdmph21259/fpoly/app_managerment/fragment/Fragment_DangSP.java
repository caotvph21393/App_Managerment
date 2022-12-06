package quantdmph21259.fpoly.app_managerment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quantdmph21259.fpoly.app_managerment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_DangSP#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_DangSP extends Fragment {



    public Fragment_DangSP() {
        // Required empty public constructor
    }


    public static Fragment_DangSP newInstance() {
        Fragment_DangSP fragment = new Fragment_DangSP();
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
        return inflater.inflate(R.layout.fragment__dang_s_p, container, false);
    }
}
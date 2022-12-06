package quantdmph21259.fpoly.app_managerment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quantdmph21259.fpoly.app_managerment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_ThongKe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_ThongKe extends Fragment {


    public Fragment_ThongKe() {
        // Required empty public constructor
    }


    public static Fragment_ThongKe newInstance() {
        Fragment_ThongKe fragment = new Fragment_ThongKe();
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
        return inflater.inflate(R.layout.fragment__thong_ke, container, false);
    }
}
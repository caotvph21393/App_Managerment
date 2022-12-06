package quantdmph21259.fpoly.app_managerment.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import quantdmph21259.fpoly.app_managerment.R;
import quantdmph21259.fpoly.app_managerment.adapter.DonHangAdapter;
import quantdmph21259.fpoly.app_managerment.model.DonHang;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_DonHang#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_DonHang extends Fragment {


    public Fragment_DonHang() {
        // Required empty public constructor
    }


    public static Fragment_DonHang newInstance() {
        Fragment_DonHang fragment = new Fragment_DonHang();
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
        return inflater.inflate(R.layout.fragment__don_hang, container, false);
    }

    private ListView lv_donhang;
    private ArrayList<DonHang> list = new ArrayList<>();
    private DonHangAdapter adapter ;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lv_donhang = view.findViewById(R.id.lv_donhang);

        Themsp();
        adapter = new DonHangAdapter(getActivity(),R.layout.layout_item_thongtindh, list);
        lv_donhang.setAdapter(adapter);

    }
    private void Themsp(){
        list.add(new DonHang("Đắc nhân tâm","Minh Quân", R.drawable.dacnhantam, 20000));
        list.add(new DonHang("doraemon", "Trần Văn Cao" ,R.drawable.bachuloncon, 30000));
    }
}
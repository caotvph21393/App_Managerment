package quantdmph21259.fpoly.app_managerment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import quantdmph21259.fpoly.app_managerment.R;
import quantdmph21259.fpoly.app_managerment.model.DonHang;

public class DonHangAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<DonHang> DonHang_list;

    public DonHangAdapter(Context context, int layout, List<DonHang> donHang_list) {
        this.context = context;
        this.layout = layout;
        DonHang_list = donHang_list;
    }

    @Override
    public int getCount() {
        return DonHang_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

// ánh xạ
        ImageView img_donhang = convertView.findViewById(R.id.img_donhang);
        TextView tv_donhang_tensach = convertView.findViewById(R.id.tv_donhang_tensach);
        TextView tv_donhang_tenkh = convertView.findViewById(R.id.tv_donhang_tenkh);
        TextView tv_donhang_gia = convertView.findViewById(R.id.tv_donhang_gia);

        DonHang donhang = DonHang_list.get(position);

        img_donhang.setImageResource(donhang.getImg());
        tv_donhang_tensach.setText(donhang.getTensach());
        tv_donhang_tenkh.setText(donhang.getTenkh());
        tv_donhang_gia.setText(donhang.getGia()+ "");

        return convertView;
    }
}

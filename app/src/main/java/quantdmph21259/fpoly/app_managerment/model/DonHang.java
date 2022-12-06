package quantdmph21259.fpoly.app_managerment.model;

import java.util.StringJoiner;

public class DonHang {
    private String tensach, tenkh;
    private int img;
    private int gia;

    public DonHang(String tensach, String tenkh, int img, int gia) {
        this.tensach = tensach;
        this.tenkh = tenkh;
        this.img = img;
        this.gia = gia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}

package quantdmph21259.fpoly.app_managerment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import quantdmph21259.fpoly.app_managerment.fragment.Fragment_DangKy;
import quantdmph21259.fpoly.app_managerment.fragment.Fragment_DangNhap;
import quantdmph21259.fpoly.app_managerment.fragment.Fragment_DangSP;
import quantdmph21259.fpoly.app_managerment.fragment.Fragment_DonHang;
import quantdmph21259.fpoly.app_managerment.fragment.Fragment_Home;
import quantdmph21259.fpoly.app_managerment.fragment.Fragment_ThongKe;
import quantdmph21259.fpoly.app_managerment.fragment.Loading_Activity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerlayout;

    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_DONHANG = 1;
    private static final int FRAGMENT_DANGSP = 2;
    private static final int FRAGMENT_THONGKE = 3;
    private static final int FRAGMENT_DANGNHAP = 4;
    private static final int FRAGMENT_DANGKY = 5;

    private int mCurrentFragment = FRAGMENT_HOME;

    private TextView tv_signup_login, tv_login_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerlayout = findViewById(R.id.drawerlayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerlayout, toolbar,
                        R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerlayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationview = findViewById(R.id.navigationview);
        navigationview.setNavigationItemSelectedListener(this);

        replaceFragment(new Fragment_Home());
        navigationview.getMenu().findItem(R.id.nav_home).setChecked(true);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.nav_home){
            if(mCurrentFragment != FRAGMENT_HOME){
                replaceFragment(new Fragment_Home());
                mCurrentFragment = FRAGMENT_HOME;
            }
        }
        else if(id==R.id.nav_donhang){
            if(mCurrentFragment != FRAGMENT_DONHANG){
                replaceFragment(new Fragment_DonHang());
                mCurrentFragment = FRAGMENT_DONHANG;
            }
        }
        else if(id==R.id.nav_dangsp){
            if(mCurrentFragment != FRAGMENT_DANGSP){
                replaceFragment(new Fragment_DangSP());
                mCurrentFragment = FRAGMENT_DANGSP;
            }
        }
        else if(id==R.id.nav_thongke){
            if(mCurrentFragment != FRAGMENT_THONGKE){
                replaceFragment(new Fragment_ThongKe());
                mCurrentFragment = FRAGMENT_THONGKE;
            }
        }
        else if(id==R.id.nav_dangnhap){
            if(mCurrentFragment != FRAGMENT_DANGNHAP){
                replaceFragment(new Fragment_DangNhap());
                mCurrentFragment = FRAGMENT_DANGNHAP;
            }
        }
        else if(id==R.id.nav_dangky){
            if(mCurrentFragment != FRAGMENT_DANGKY){
                replaceFragment(new Fragment_DangKy());
                mCurrentFragment = FRAGMENT_DANGKY;
            }
        }
        else if(id==R.id.nav_thoat){
            Intent intent = new Intent(MainActivity.this, Loading_Activity.class);
            startActivity(intent);
        }

        drawerlayout.closeDrawer(GravityCompat.START);//đóng Drawerlayout

        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }

}
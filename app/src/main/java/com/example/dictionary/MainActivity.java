package com.example.dictionary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.dictionary.MainFragment.BeltFragment;
import com.example.dictionary.MainFragment.Costume;
import com.example.dictionary.MainFragment.ExtraBeltFragment;
import com.example.dictionary.MainFragment.Rope;
import com.example.dictionary.MainFragment.WallCrossing;
import com.google.android.material.navigation.NavigationView;
import com.example.dictionary.MainFragment.SearchFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    public static Toolbar toolbar;
    DrawerLayout drawerLayout;
    public static NavigationView navView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.red));
        initComponent();

        toolbar.setBackgroundColor(getResources().getColor(R.color.red));
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.close,R.string.open);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navView.setNavigationItemSelectedListener(this);
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SearchFragment()).commit();
            navView.setCheckedItem(R.id.search);
        }
    }
    private void initComponent(){

        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navView = findViewById(R.id.nav_view);

    }
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        super.onBackPressed();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new SearchFragment()).commit();
                toolbar.setTitle("Tìm Kiếm");
                break;
            case R.id.consume:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Costume()).commit();
                toolbar.setTitle("Trang Phục");
                break;
            case R.id.rope:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Rope()).commit();
                toolbar.setTitle("Dây");
                break;
            case R.id.crossTheWall:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new WallCrossing()).commit();
                toolbar.setTitle("Vượt Tường");
                break;
            case R.id.belt:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BeltFragment()).commit();
                toolbar.setTitle("Tự Cứu");
                break;
            case R.id.extraBelt:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ExtraBeltFragment()).commit();
                toolbar.setTitle("Đai");
                break;

            default:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

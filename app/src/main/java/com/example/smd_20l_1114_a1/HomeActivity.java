package com.example.smd_20l_1114_a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    FragmentManager manager;

    private ImageView ivArrow;
    private Button btnHome, btnProfile;
    String username, name, email, gender;

    Fragment fragHome, fragProfile;

    private View viewHomeBorder, viewProfileBorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
        setData();

        ivArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        int coralColor = ContextCompat.getColor(this, R.color.coral);
        int selectedColor = ContextCompat.getColor(this, R.color.tab_border);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.beginTransaction()
                        .show(fragHome)
                        .hide(fragProfile)
                        .commit();

                viewHomeBorder.setBackgroundColor(selectedColor);
                viewProfileBorder.setBackgroundColor(coralColor);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.beginTransaction()
                        .show(fragProfile)
                        .hide(fragHome)
                        .commit();

                viewProfileBorder.setBackgroundColor(selectedColor);
                viewHomeBorder.setBackgroundColor(coralColor);
            }
        });

    }

    private void setData() {
        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        name = intent.getStringExtra("name");
        gender = intent.getStringExtra("gender");
        email = intent.getStringExtra("email");
    }

    private void init() {
        manager = getSupportFragmentManager();
        ivArrow = findViewById(R.id.ivArrow);
        btnHome = findViewById(R.id.btnHome);
        btnProfile = findViewById(R.id.btnProfile);
        fragHome = manager.findFragmentById(R.id.fragHome);
        fragProfile = manager.findFragmentById(R.id.fragProfile);
        viewHomeBorder = findViewById(R.id.viewHomeBorder);
        viewProfileBorder = findViewById(R.id.viewProfileBorder);
    }
}
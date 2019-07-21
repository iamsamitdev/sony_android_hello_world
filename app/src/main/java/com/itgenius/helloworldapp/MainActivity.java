package com.itgenius.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // เรียกใช้งาน button btnShare
        ImageButton btnShare = findViewById(R.id.btnShare);

        // เขียนเหตุการณ์การคลิ๊กปุ่ม
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // System.out.println("Hello Android");
                // Alert
                Toast.makeText(getApplicationContext(),"Hello Android",Toast.LENGTH_SHORT).show();
            }
        });

        // เรียกใช้ปุ่ม btnMap
        ImageButton btnMap = findViewById(R.id.btnMap);

        // เขียนเหตุการคลิ๊กปุ่ม btnMap
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // การเปิดหน้าจอใหม่ ด้วยคำสั่ง Intent
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

    }
}

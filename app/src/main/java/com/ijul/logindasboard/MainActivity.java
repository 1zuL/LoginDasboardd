package com.ijul.logindasboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton = findViewById(R.id.buton);
        buton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Dasboard.class);
            startActivity(intent);

            TextView tv = findViewById(R.id.daftarbtn);
            tv.setOnClickListener(view1 -> {
                Intent intent1 = new Intent(MainActivity.this, daftar.class);
                startActivity(intent1);
            });
        });
    }
}
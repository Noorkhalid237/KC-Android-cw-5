package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Cus1 = findViewById(R.id.Namme);
        TextView Cus2 = findViewById(R.id.Agge);

        Bundle Noor = getIntent().getExtras();

        String cn = Noor.getString("key1");
        String num = Noor.getString("key2");

        Cus1.setText(cn);
        Cus2.setText(num);
    }
}
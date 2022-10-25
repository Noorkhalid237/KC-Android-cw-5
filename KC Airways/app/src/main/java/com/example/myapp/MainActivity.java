package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Name = findViewById(R.id.name);
        EditText Age = findViewById(R.id.age);
        Button Next = findViewById(R.id.Next);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String cn = Name.getText().toString();
                String num = Age.getText().toString();

                Intent fly = new Intent(MainActivity.this , MainActivity2.class);

                fly.putExtra("key1",cn);
                fly.putExtra("key2",num);

                if (TextUtils.isEmpty(cn)){
                    Name.setError("Please enter your name!");
                    return;
                }else if (TextUtils.isEmpty(num)){
                    Age.setError("Please enter your age!");
                    return;
                }


                startActivity(fly);
            }
        });
    }
}
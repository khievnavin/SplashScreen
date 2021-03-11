package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,Id;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name= findViewById(R.id.txtname);
        Id= findViewById(R.id.txtid);
        btnback = findViewById(R.id.btnback);


        Intent intent= getIntent();
        String nameS = intent.getStringExtra("name");
        String IdS =intent.getStringExtra("id");

        name.setText(nameS);
        Id.setText(IdS);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

}
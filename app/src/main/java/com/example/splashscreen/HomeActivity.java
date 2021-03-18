package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText name, Id;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        name = findViewById(R.id.etxtname);
        Id = findViewById(R.id.etxtid);
        btn = findViewById(R.id.btn);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameS = name.getText().toString();
                String IdS = Id.getText().toString();

                Intent intent = new Intent(HomeActivity.this,MainActivity2.class);
                intent.putExtra("name",nameS);
                intent.putExtra("id",IdS);
                startActivity(intent);
            }
        });
    }
}
package com.practice.greetingsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView greetText;
    EditText username;
    Button greetBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetText=findViewById(R.id.greetText);
        username=findViewById(R.id.username);
        greetBtn=findViewById(R.id.greetBtn);

        greetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=username.getText().toString().trim();
                if(!name.isEmpty()){
                    greetText.setText("Namaste, "+name);
                }
                else{
                    greetText.setText("Namaste");
                }
            }
        });




    }
}
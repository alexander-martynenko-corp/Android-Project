package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Callback method run after call activity

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view){
                throw new RuntimeException();
            }
        });
    }
}

package com.example.shapes_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    Definition
    Button btn_rectangle,btn_triangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        convert
        btn_rectangle = findViewById(R.id.main_btn_rectanlge);
        btn_triangle = findViewById(R.id.main_btn_triangle);

//        event
        btn_rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(),rectangle.class);
                startActivityForResult(intent1,1);
            }
        });
    }

}

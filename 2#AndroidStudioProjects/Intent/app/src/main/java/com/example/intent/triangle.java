package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class triangle extends AppCompatActivity {

    EditText et_base,et_height;
    Button btn_clc;
    int area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        et_base = findViewById(R.id.trian_et_base);
        et_height= findViewById(R.id.trian_et_height);
        btn_clc= findViewById(R.id.trian_btn_clc);

        btn_clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x =Integer.parseInt( et_base.getText().toString());
                int y =Integer.parseInt( et_height.getText().toString());
                area = x*y;

                Intent stor =new Intent();
                stor.putExtra("area",area);

                setResult(MainActivity.TRIANGLE,stor);

            }
        });
    }
}

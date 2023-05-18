package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class triangle extends AppCompatActivity {

//  inchlaisation
    EditText et_base,et_height;
    Button btn_clc;

    double area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

//  inflate
        et_base = findViewById(R.id.trian_et_base);
        et_height= findViewById(R.id.trian_et_height);
        btn_clc= findViewById(R.id.trian_btn_clc);

//  Listener of button culculation
        btn_clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x =Integer.parseInt( et_base.getText().toString());
                int y =Integer.parseInt( et_height.getText().toString());
                area = 0.5*x*y;

                Intent stor =new Intent();
                if(x<0||y<0)
                {
                    stor.putExtra("hieght",et_height.getText().toString());
                    stor.putExtra("base",et_base.getText().toString());
                    setResult(RESULT_CANCELED,stor);

                }
                else
                {
                    stor.putExtra("area",area);
                    setResult(RESULT_OK,stor);
                }
                finish();
            }
        });
    }

}

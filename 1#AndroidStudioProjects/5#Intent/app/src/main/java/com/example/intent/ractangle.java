package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.preference.PreferenceManager.OnActivityResultListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ractangle extends AppCompatActivity {

//  inchlaisation
    EditText et_width,et_height;
    Button btn_clc;
    double area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ractangle);

//  inflate
        et_width=findViewById(R.id.rc_et_width);
        et_height=findViewById(R.id.rc_et_height);
        btn_clc=findViewById(R.id.rc_btn_clc);


        btn_clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x=Integer.parseInt(et_width.getText().toString());
                int y=Integer.parseInt(et_height.getText().toString());

                area=x*y;

                Intent rect =getIntent();

                if(x<0||y<0)
                {
                    rect.putExtra("hieght",et_height.getText().toString());
                    rect.putExtra("width",et_width.getText().toString());
                    setResult(RESULT_CANCELED,rect);
                }
                else
                {
                    rect.putExtra("area",area);
                    setResult(RESULT_OK,rect);
                }
                finish();
            }
        });

    }
}

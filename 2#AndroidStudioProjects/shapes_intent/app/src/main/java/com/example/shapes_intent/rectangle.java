package com.example.shapes_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangle extends AppCompatActivity {

//    Definition
    EditText et_rect_width,et_rect_height;
    Button btn_calc;
    int area = 0;
    TextView tv_stor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

//        convert
        et_rect_width = findViewById(R.id.rectangle_et_width);
        et_rect_height = findViewById(R.id.rectangle_et_height);
        btn_calc = findViewById(R.id.rectangle_btn_calculate);



//        event
        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            parse
           int x = Integer.parseInt(et_rect_width.getText().toString());
            int y =Integer.parseInt( et_rect_height.getText().toString());
           area=x*y;
           Intent intent2=new Intent();
           intent2.putExtra("rectangle_area",area+"");

           setResult(1,intent2);


            }
        });

    }
}

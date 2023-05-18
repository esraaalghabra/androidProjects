package com.example.layout_part_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class rectangle extends AppCompatActivity {

// inchlasation
    Button btn_rect_width,btn_rect_hieght,btn_calculate;
    NumberPicker nb_value;
    EditText et_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

// inflate
        btn_rect_width = findViewById(R.id.rect_btn_width);
        btn_rect_hieght = findViewById(R.id.rect_btn_hieght);
        btn_calculate = findViewById(R.id.rect_btn_calculate);
        et_phone=findViewById(R.id.et_phone);
        nb_value=findViewById(R.id.nb_value);

// button calculate
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

// number picker
        nb_value.setMaxValue(30);
        nb_value.setMinValue(0);

        nb_value.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });


// Emplcint intent
        btn_rect_width.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x =et_phone.getText().toString();

                Intent inten=new Intent();
                inten.setAction(Intent.ACTION_DIAL);

                Uri phone_number=Uri.parse("tel:"+x);
                inten.setData(phone_number);
                startActivity(inten);
            }
        });


    }
}

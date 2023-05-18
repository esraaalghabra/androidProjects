package com.example.layout_part_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class area extends AppCompatActivity {

// inchlasation
    Spinner sp_shapes;
    EditText et_rect_width, et_rect_hieght, et_triangle_base, et_triangle_hieght, et_circle_radius;
    Button btn_calculate;
    TextView tv_result;
    RadioButton rbtn_gone,rbtn_show;
    SeekBar sb_size;
    RatingBar rt_value;


    double area = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);

// inflate
        sp_shapes = findViewById(R.id.main_sp_shapes);
        et_rect_width = findViewById(R.id.main_et_rectangle_width);
        et_rect_hieght = findViewById(R.id.main_et_rectangle_hieght);
        et_triangle_base = findViewById(R.id.main_et_triangle_base);
        et_triangle_hieght = findViewById(R.id.main_et_triangle_hieght);
        et_circle_radius = findViewById(R.id.main_et_circle_radius);
        btn_calculate = findViewById(R.id.main_btn_calculate);
        tv_result=findViewById(R.id.tv_result);

        rbtn_show=findViewById(R.id.main_rbtn_show);
        rbtn_gone=findViewById(R.id.main_rbtn_gone);

        sb_size=findViewById(R.id.sb_FontSize);

        rt_value=findViewById(R.id.rt_value);




// shapes
        sp_shapes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        et_rect_width.setVisibility(View.VISIBLE);
                        et_rect_hieght.setVisibility(View.VISIBLE);
                        et_triangle_base.setVisibility(View.GONE);
                        et_triangle_hieght.setVisibility(View.GONE);
                        et_circle_radius.setVisibility(View.GONE);
                        break;
                    case 1:
                        et_rect_width.setVisibility(View.GONE);
                        et_rect_hieght.setVisibility(View.GONE);
                        et_triangle_base.setVisibility(View.VISIBLE);
                        et_triangle_hieght.setVisibility(View.VISIBLE);
                        et_circle_radius.setVisibility(View.GONE);
                        break;
                    case 2:
                        et_rect_width.setVisibility(View.GONE);
                        et_rect_hieght.setVisibility(View.GONE);
                        et_triangle_base.setVisibility(View.GONE);
                        et_triangle_hieght.setVisibility(View.GONE);
                        et_circle_radius.setVisibility(View.VISIBLE);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = sp_shapes.getSelectedItemPosition();

                switch (index){
                    case 0:
                        double rect_width = Double.parseDouble(et_rect_width.getText().toString());
                        double rect_hieght = Double.parseDouble(et_rect_hieght.getText().toString());
                        area = rect_width*rect_hieght ;
                        break;

                    case 1:
                        double triangle_hieght = Double.parseDouble(et_triangle_hieght.getText().toString());
                        double triangle_base = Double.parseDouble(et_triangle_base.getText().toString());
                        area = 0.5 * triangle_base * triangle_hieght ;
                        break;
                    case 2:
                        double circle_radius = Double.parseDouble(et_circle_radius.getText().toString());
                        area = Math.PI * Math.pow(circle_radius,2);
                        break;

                }
                tv_result.setText(area+"");
            }
        });

// end shapes

// hide resulte by RadioButton
        rbtn_gone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    tv_result.setVisibility(View.GONE);
                }
                else
                {
                    tv_result.setVisibility(View.VISIBLE);
                }
            }
        });

// show resulte by RadioButton
        rbtn_show.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    tv_result.setVisibility(View.VISIBLE);
                }
                else
                {
                    tv_result.setVisibility(View.GONE);
                }
            }
        });

// change font size by SeekBar
        sb_size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_result.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

// RatingBar
        rt_value.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });

// intent
        Intent intent2=getIntent();
        String v=intent2.getStringExtra("area1");
        tv_result.setText(v);
    }
}


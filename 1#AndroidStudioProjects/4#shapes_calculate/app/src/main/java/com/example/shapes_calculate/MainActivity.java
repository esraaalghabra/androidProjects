package com.example.shapes_calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner sp_shapes;
    EditText et_rect_width, et_rect_hieght, et_triangle_base, et_triangle_hieght, et_circle_radius;
    Button btn_calculate;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_shapes = findViewById(R.id.main_sp_shapes);
        et_rect_width = findViewById(R.id.main_et_rectangle_width);
        et_rect_hieght = findViewById(R.id.main_et_rectangle_hieght);
        et_triangle_base = findViewById(R.id.main_et_triangle_base);
        et_triangle_hieght = findViewById(R.id.main_et_triangle_hieght);
        et_circle_radius = findViewById(R.id.main_et_circle_radius);
        btn_calculate = findViewById(R.id.main_btn_calculate);
        tv_result=findViewById(R.id.tv_result);


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
                double area = 0 ;
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
    }

}

package com.example.layout_part_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class triangle extends AppCompatActivity {
   //CalendarView clv;
    Button btn_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        btn_move=findViewById(R.id.btn_move);
//        clv=findViewById(R.id.clv);
//
//        clv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//
//            }
//        });
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getBaseContext(),area.class);
                intent1.putExtra("area1","not found area");
                startActivity(intent1);


            }
        });

    }
}

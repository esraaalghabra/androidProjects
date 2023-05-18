package com.example.adapptar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class objectOfAdabter extends AppCompatActivity {

    GridView main_gv;
    Button main_btn_add;
    TextView main_et_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        main_gv=findViewById(R.id.main_gv);
        main_btn_add=findViewById(R.id.main_btn_add);
        main_et_item=findViewById(R.id.main_et_item);

        //ArrayList

        ArrayList<String> dat =new ArrayList<>();
        for(int i=1;i<110;i++)
        {
            dat.add("osama #"+i);
        }
        //Adappter

        final addapter<String> addap= new addapter<>
                (this,dat,android.R.layout.simple_dropdown_item_1line);
        main_gv.setAdapter(addap);

        main_btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addap.setItem(main_et_item.getText().toString());
                addap.notifyDataSetChanged();

            }
        });

    }
}

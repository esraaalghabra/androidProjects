package com.example.adabter_2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    EditText et;
//    Button btn_add;
    ListView lv;
    int design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        et=findViewById(R.id.adabter_et);
//        btn_add=findViewById(R.id.adabter_btn);
        lv=findViewById(R.id.adabter_lv);

        ArrayList<String> data =new ArrayList<>();
        for(int i=0;i<50;i++)
        {
            data.add("esraa"+i);
        }

        ArrayAdapter adap=new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adap);


    }
}

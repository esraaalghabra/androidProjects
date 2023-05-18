package com.example.adabter_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/// عم يطلع من التبيق
public class MyProject extends AppCompatActivity {

    EditText et;
    Button btn;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_project);


        lv=findViewById(R.id.main_lv);
        et=findViewById(R.id.main_et_item);
        btn=findViewById(R.id.adabter_btn);


        ArrayList<String> deta=new ArrayList<>();
        for(int i=0;i<40;i++)
        {
            deta.add("esraa#"+i);
        }

       MyAdabter adab = new MyAdabter(this,android.R.layout.simple_list_item_1,deta);
        lv.setAdapter(adab);
    }
}

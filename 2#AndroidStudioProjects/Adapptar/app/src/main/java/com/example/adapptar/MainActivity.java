package com.example.adapptar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //inchlasation

    ListView main_lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //parse
      //  main_lv=findViewById(R.id.main_lv);



        //ArrayList

        ArrayList<String> names =new ArrayList<>();
        names.add("osama");
        names.add("esraa");
        names.add("osama2");
        names.add("osama3");
        names.add("osama4");


        //ArrayAdappter

        ArrayAdapter<String> adappter=new ArrayAdapter<>
                (this,android.R.layout.simple_list_item_1,names);

        main_lv.setAdapter(adappter);















    }
}

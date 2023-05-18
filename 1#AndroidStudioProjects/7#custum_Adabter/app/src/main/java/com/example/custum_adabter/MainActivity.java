package com.example.custum_adabter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    ListView lv;
    TextView tv;
    int count = -1;
    int REQ_CODE_ADD=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et=findViewById(R.id.ui_et_item);
        btn=findViewById(R.id.ui_btn_add);
        lv=findViewById(R.id.ui_lv_items);
        tv=findViewById(R.id.ui_tv_position);


        final ArrayList<Post> postes = new ArrayList<>();

          postes.add(new Post("12, May 2015","Esraa","Welcom !!",15,26,11));
          postes.add(new Post("13, May 2015","osama","Welcom !!",54,25,9));
          postes.add(new Post("14, May 2015","alaa","Welcom !!",17,18,14));


        final PostAdabter adab=new PostAdabter(this,R.layout.custum_post_latout,postes);
        lv.setAdapter(adab);


        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(count>-1)
                {
                  adab.EditItem(count,(Post)adab.getItem(count));
                  count=-1;
                }
                else
                {
                  //adab.addItem(et.getText().toString());
                  adab.addItem((Post)adab.getItem(count));
                }
                adab.notifyDataSetChanged();
                et.setText("");
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = (String) adab.getItem(position);
                et.setText(name);
                count=position;
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),AddPostActivity.class);
                startActivityForResult(intent,REQ_CODE_ADD);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQ_CODE_ADD&&resultCode==RESULT_OK)
        {

        }
    }
}

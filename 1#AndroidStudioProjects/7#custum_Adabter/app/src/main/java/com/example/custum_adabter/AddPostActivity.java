package com.example.custum_adabter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPostActivity extends AppCompatActivity {

    EditText et_name,et_date,et_body,et_posts,et_folowing,et_folowers;
    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        et_name=findViewById(R.id.add_post_name);
        et_date=findViewById(R.id.add_post_date);
        et_body=findViewById(R.id.add_post_body);
        et_posts=findViewById(R.id.add_post_postes);
        et_folowing=findViewById(R.id.add_post_folowing);
        et_folowers=findViewById(R.id.add_post_folowers);
        btn_add=findViewById(R.id.add_btn_save);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =et_name.getText().toString();
                String body=et_body.getText().toString();
                String date=et_date.getText().toString();
                int folowers=Integer.parseInt(et_folowers.getText().toString());
                int posts=Integer.parseInt(et_posts.getText().toString());
                int folowing=Integer.parseInt(et_folowing.getText().toString());

                Post post = new Post(name,body,date,folowers,posts,folowing);
                Intent intent = new Intent();
                intent.putExtra("post",post);

                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
}

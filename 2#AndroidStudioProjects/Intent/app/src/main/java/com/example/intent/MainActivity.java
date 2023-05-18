package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static final int RECTANGLE=1;
    static final int TRIANGLE=2;

    Button btn_rec,btn_trian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_rec = findViewById(R.id.main_btn_rc);
        btn_trian = findViewById(R.id.main_btn_tr);

        btn_rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent esraa=new Intent(getBaseContext(),ractangle.class);
                startActivityForResult(esraa,MainActivity.RECTANGLE);
            }
        });


        btn_trian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent esraa=new Intent(getBaseContext(),triangle.class);
                startActivityForResult(esraa,MainActivity.TRIANGLE);
            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}

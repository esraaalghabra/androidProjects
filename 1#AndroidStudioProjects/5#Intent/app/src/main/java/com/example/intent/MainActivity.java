package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


//  inchlaisation
    Button btn_rec,btn_trian,btn_call;
    TextView tv_result ;
    EditText et_number_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  inflate
        btn_rec =findViewById(R.id.main_btn_rc);
        btn_trian =findViewById(R.id.main_btn_tr);
        tv_result=findViewById(R.id.main_tv_result);

        btn_call = findViewById(R.id.btn_call);
        et_number_phone=findViewById(R.id.et_number_phone);


//  Listener of button culculation
        btn_rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent=new Intent(getBaseContext(),ractangle.class);

            startActivityForResult(intent,2);
            }
        });


        btn_trian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent=new Intent(getBaseContext(),triangle.class);

            startActivityForResult(intent,1);

            }
        });

// Emplcint intent
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x =et_number_phone.getText().toString();

                Intent inten=new Intent();

                inten.setAction(Intent.ACTION_DIAL);

                Uri phone_number=Uri.parse("tel:"+x);
                inten.setData(phone_number);
                startActivity(inten);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode==1 )
        {
            if(resultCode==RESULT_OK)
            {
                Double a = data.getDoubleExtra("area",0);

                tv_result.setText("area of triangle="+a+"");
            }
            else if(requestCode==RESULT_CANCELED)
            {
                String x = data.getStringExtra("hieght");
                String y = data.getStringExtra("base");

                tv_result.setText(x+"\t"+y);
            }

        }
        if (requestCode==2 )
        {
            if(resultCode==RESULT_OK)
            {
                Double a = data.getDoubleExtra("area",0);

                tv_result.setText("area of rectangle="+a+"");
            }
            else if(requestCode==RESULT_CANCELED)
            {
                int x = data.getIntExtra("hieght",0);
                int y = data.getIntExtra("width",0);

                tv_result.setText("hieght="+x+"\n width="+y);
            }

        }






    }
}


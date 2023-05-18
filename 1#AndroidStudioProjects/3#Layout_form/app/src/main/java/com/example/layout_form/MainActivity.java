package com.example.layout_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

import com.example.layout_form.ui.login.LoginActivity;
import com.example.layout_form.ui.login.LoginViewModel;

public class MainActivity extends AppCompatActivity {


    Switch sw_state;
    ImageView iv_icon;
    EditText et_fn,et_ln,et_pass;
    Button btn_login,btn_registor;
    RadioButton rb_male,rb_fmale;
    EditText tv;
    CheckBox chb_swim,chb_rade,chb_draw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login=findViewById(R.id.ui_btn_login);
        btn_registor=findViewById(R.id.ui_btn_registor);


        btn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
            Intent intent1=new Intent(getBaseContext(), LoginActivity.class);
                startActivityForResult(intent1,1);
            }
        });

        btn_registor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getBaseContext(),Main3Activity.class);
                startActivity(intent2);
            }
        });

    }
}

package com.example.adabter_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdabter<t> extends BaseAdapter {

    Context context;
    ArrayList<t> data;
    int design;

    public MyAdabter(Context c,int des,ArrayList<t> dat)
    {
        context=c;
        data=dat;
        design=des;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public  t getItem(int position) {
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View v = convertView;
       if(v==null){
           v= LayoutInflater.from(context).inflate
                   (design,null,false);
       }

        TextView tv=v.findViewById(android.R.id.text1);
       tv.setText((String)this.getItem(position));
        return v;
    }

}

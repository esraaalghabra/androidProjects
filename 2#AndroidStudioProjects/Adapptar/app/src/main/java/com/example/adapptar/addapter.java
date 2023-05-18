package com.example.adapptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class addapter<t> extends ArrayAdapter
{
    // Attributes

    ArrayList<t> data;
    Context context;
    int design;

    // constructor
    public addapter(Context osama, ArrayList<t> dat, int des) {
        super(osama,des,dat);
        context=osama;
        data=dat;
        design=des;

    }

    // Implentation for Super

    public void setItem(t item)
    {
        data.add(item);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v==null)
        {
            v=LayoutInflater.from(context).inflate
                    (design,null,false);
        }
        TextView tv=v.findViewById(android.R.id.text1);
           tv.setText((String)(t)this.getItem(position));
        return v;
    }
}

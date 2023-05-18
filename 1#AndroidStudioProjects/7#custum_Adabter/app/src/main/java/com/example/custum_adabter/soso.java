package com.example.custum_adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class soso<t> extends BaseAdapter
{
    private Context context;
    private ArrayList<t> deta;
    private int design;


    public soso(Context c,int design, ArrayList<t> det)
    {
        this.context=c;
        this.deta=det;
        this.design=design;
    }

    public void addPosition(int position,t item)
    {
        deta.add(position, item);
    }


    public void addItem(t item)
    {
        deta.add(item);
    }



    @Override
    public int getCount() {
        return deta.size();
    }

    @Override
    public t getItem(int position) {
        return deta.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View V=convertView;
        if(V==null)
        {
          V= LayoutInflater.from(context).inflate(design,null,false);
        }
        TextView tv =V.findViewById(android.R.id.text1);
        tv.setText((String)this.getItem(position));
        return V;
    }
}

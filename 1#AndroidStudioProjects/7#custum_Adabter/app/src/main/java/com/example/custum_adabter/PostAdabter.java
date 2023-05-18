package com.example.custum_adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class PostAdabter extends BaseAdapter {


    private Context context;
    private int recource;
    private ArrayList<Post> Postes;

    public PostAdabter(Context c, int recource, ArrayList<Post> Postes)
    {
        this.context=c;
        this.recource=recource;
        this.Postes=Postes;

    }

    public void addItem(Post post)
    {
        this.Postes.add(post);
    }
    public void EditItem(int i,Post post)
    {
        this.Postes.set(i,post);
    }


    @Override
    public int getCount() {
        return Postes.size();
    }


    @Override
    public Object getItem(int position) {
        return Postes.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v= convertView;

        if(v==null)
        {
            v= LayoutInflater.from(context).inflate(recource,null,false);
        }

        TextView tv_data=v.findViewById(R.id.custum_post_tv_date);
        TextView tv_name=v.findViewById(R.id.custum_post_tv_name);
        TextView tv_folowing=v.findViewById(R.id.custum_post_tv_date);
        TextView tv_folowers=v.findViewById(R.id.custum_post_tv_folowers_data);
        TextView tv_postes=v.findViewById(R.id.custum_post_tv_postes_data);
        TextView tv_body=v.findViewById(R.id.custum_post_tv_body);

        Post p = (Post) getItem(position);
        tv_data.setText(p.getData());
        tv_name.setText(p.getName());
        tv_folowing.setText(p.getFolowing()+"");
        tv_folowers.setText(p.getFolowers()+"");
        tv_postes.setText(p.getPostes()+"");
        tv_body.setText(p.getBody()+"");

        return v;
    }
}

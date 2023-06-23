package com.example.translatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class customAdapter  extends BaseAdapter {


    private Context context ;
    private ArrayList<WordModal> familyMembers;

    public customAdapter(Context context, ArrayList<WordModal> familyMembers) {
        this.context = context;
        this.familyMembers = familyMembers;
    }

    @Override
    public int getCount() {

        return familyMembers.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_layout, viewGroup,false);
       TextView english = view.findViewById(R.id.english);
       TextView kikuyu = view.findViewById(R.id.kikuyu);
       ImageView image = view.findViewById(R.id.image);

       english.setText(familyMembers.get(i).getEnglishWord());
       kikuyu.setText(familyMembers.get(i).getKiswahiliWord());


        return view;
    }
}

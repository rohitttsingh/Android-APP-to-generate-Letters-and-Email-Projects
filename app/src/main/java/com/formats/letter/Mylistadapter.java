package com.formats.letter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Mylistadapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;


    public Mylistadapter(Activity context, String[] maintitle){

super(context,R.layout.mylistvew,maintitle);
        this.context=context;

        this.maintitle=maintitle;


    }
    public View getView(int position, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView =inflater.inflate(R.layout.mylistvew, null,true);
        TextView titletext = rowView.findViewById(R.id.title);

        titletext.setText(maintitle[position]);


        return rowView;
    }
}

package com.example.root.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users){
        super(context, 0, users);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //how to get the data for the position
        User user = getItem(position);

         //how to check if an existing view is being reused othermwise inflate the view
        if(convertView ==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        //lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
        TextView tvsex = (TextView) convertView.findViewById(R.id.tvSex);

        //how to populate the data into the template view using the data object
        tvName.setText(user.name);
        tvHome.setText(user.hometown);
        tvsex.setText(user.sex);

        // Return the completed view to render on screen
        return convertView;
    }
}

package com.example.android.miwok;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.menu.ListMenuItemView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);
        View lstItemV = convertView;

        if (lstItemV == null) {
            lstItemV = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imgV = (ImageView) lstItemV.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            imgV.setImageResource(currentWord.getmImageID());
            imgV.setVisibility(View.VISIBLE);
        } else {
            imgV.setVisibility(View.GONE);
        }

        TextView txtMiwok = (TextView) lstItemV.findViewById(R.id.txtMiwok);
        txtMiwok.setText(currentWord.getmMiwokTranslation());

        TextView txtDefault = (TextView) lstItemV.findViewById(R.id.txtDefault);
        txtDefault.setText(currentWord.getmDefaultTranslation());

        View textContainer = lstItemV.findViewById(R.id.txtContainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        textContainer.setBackgroundColor(color);

        return lstItemV;
    }

    public  WordAdapter(Activity context, ArrayList<Word> word, int colorResourceID){

        super(context, 0, word);
        mColorResourceID = colorResourceID;
    }


}

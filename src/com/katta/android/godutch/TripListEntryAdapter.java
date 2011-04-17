package com.katta.android.godutch;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class TripListEntryAdapter extends BaseAdapter {
    private Context context;


    public TripListEntryAdapter(Context context) {
        this.context = context;
        trips.add("Trip One");
        trips.add("Trip Two");
        trips.add("Trip Three");
    }

    public int getCount() {
        return trips.size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }
    

    public View getView(int i, View view, ViewGroup viewGroup) {

        CheckedTextView tripView = new CheckedTextView(context);

//        TextView tripView = new TextView(context);
        tripView.setChecked(true);
        tripView.setText(trips.get(i));
        tripView.setTextColor(Color.BLACK);
        tripView.setHeight(30);
//        tripView.setGravity(Gravity.CENTER_VERTICAL);
        return tripView;
    }

    private List<String> trips = new ArrayList<String>();

}

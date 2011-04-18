package com.katta.android.godutch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class TripListEntryAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<String> trips = new ArrayList<String>();
    


    public TripListEntryAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);

        for(int i=0; i<100; i++) {
            trips.add("Trip : " + i);
        }
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
    

    public View getView(int i, View convertView, ViewGroup parent) {

        TripListEntryViewHolder viewHolder;

        if(convertView == null) {
            convertView = layoutInflater.inflate(R.layout.trip_list_entry, parent, false);
            viewHolder = new TripListEntryViewHolder();
            viewHolder.checkbox = (CheckBox) convertView.findViewById(R.id.triplistentrycheckbox);
            viewHolder.textview = (TextView) convertView.findViewById(R.id.triplistentrytext);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (TripListEntryViewHolder) convertView.getTag();
        }

        viewHolder.textview.setText(trips.get(i));
        return convertView;

    }

    static class TripListEntryViewHolder
    {
        CheckBox checkbox;
        TextView textview;
    }
}

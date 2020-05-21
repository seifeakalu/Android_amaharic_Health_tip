package com.example.admas_assign_2;

import java.util.HashMap;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

@SuppressLint("InflateParams")
public class Expandable_Addapter extends BaseExpandableListAdapter {
    private Context context;
    private List < String > listDataHeader;
    private HashMap < String, List < String >> listHashMap;

    public Expandable_Addapter(Context context, List < String > listDataHeader, HashMap < String, List < String >> listHashMap) {
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listHashMap = listHashMap;

    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        // TODO Auto-generated method stub
        return listHashMap.get(listDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        // TODO Auto-generated method stub
        return listDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        // TODO Auto-generated method stub
        return listHashMap.get(listDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        // TODO Auto-generated method stub
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        // TODO Auto-generated method stub
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b,
        View view, ViewGroup viewGroup) {
        // TODO Auto-generated method stub
        String headertitle = (String) getGroup(i);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_group, null);
        }
        TextView lblistHeader = (TextView) view.findViewById(R.id.lblheader);
        lblistHeader.setTypeface(null, Typeface.BOLD);
        lblistHeader.setText(headertitle);
        return view;
    }

    @Override
    public View getChildView(int i, int i1,
        boolean b, View view, ViewGroup viewGroup) {
        // TODO Auto-generated method stub

        final String childtext = (String) getChild(i, i1);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.text_item, null);
        }
        TextView txtListChild = (TextView) view.findViewById(R.id.lbllistitem);
        txtListChild.setText(childtext);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        // TODO Auto-generated method stub
        return true;
    }

}

package com.example.admas_assign_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
private ExpandableListView listview;
private ExpandableListAdapter listAdapter;
private List<String> listDataHeader;
private HashMap<String, List<String>> listHash;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listview= (ExpandableListView)findViewById(R.id.lvexp);
		initData();
		listAdapter=new Expandable_Addapter(this, listDataHeader,listHash); 
		listview.setAdapter(listAdapter);
	
	
	
	listview.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
		
		@Override
		public boolean onChildClick(ExpandableListView parent, View v,
				int groupPosition, int childPosition, long id) {
			// TODO Auto-generated method stub
			
			String catagory =listDataHeader.get(groupPosition) +", "+listHash.get(listDataHeader.get(groupPosition)).get(childPosition);
			
			
			Intent call=new Intent(getApplicationContext(),disc.class);
			call.putExtra("val1", catagory);
			
			
			startActivity(call);
			
			//Toast.makeText(MainActivity.this, listDataHeader.get(groupPosition) +" "+listHash.get(listDataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_LONG).show();
			return false;
		}
	}); 
	}

	private void initData(){
		
		listDataHeader=new ArrayList<>();
		listHash=new HashMap<>();
		
		
		listDataHeader.add("Heart Disease");
		listDataHeader.add("Cancer");
		listDataHeader.add("Diabetes");
		listDataHeader.add("Stroke");
		listDataHeader.add("Other");
		listDataHeader.add("About");
		List<String> edmtDev=new ArrayList<>();
		
		edmtDev.add("CAD");
		edmtDev.add("Arrhythmia");
		edmtDev.add("Heart failure");
		edmtDev.add("Heart valve Disease");
		
		
List<String> edmtcancer=new ArrayList<>();
		
		edmtcancer.add("Lung Cancer");
		edmtcancer.add("Breast Cancer");
		edmtcancer.add("Prostate cancer");
		
		
		edmtcancer.add("Skin cancer");
		
List<String> edmtdiabetes=new ArrayList<>();
		
		edmtdiabetes.add("Diabetes Discription");
		edmtdiabetes.add("Type 1 ");
		edmtdiabetes.add("Type 2");
		
		
List<String> edmtstroke=new ArrayList<>();
		
		edmtstroke.add("Stroke Discription");
		edmtstroke.add("Hemorrhagic stroke");
		edmtstroke.add("Ischemic stroke");	
		edmtstroke.add("Transient ischemic attack");
		
List<String> edmtother=new ArrayList<>();
		
		edmtother.add("Alzimers");
		edmtother.add("Tuberclosis");
		edmtother.add("Diarrhea");	
		edmtother.add("Cirrosis");
		edmtother.add("Chronic obstructive pulmonary");
		edmtother.add("General Health Tips");
		
		
		
List<String> edmtabout=new ArrayList<>();
		
		edmtabout.add("Developer ");
		
				
		listHash.put(listDataHeader.get(0),edmtDev);
		listHash.put(listDataHeader.get(1),edmtcancer);
		listHash.put(listDataHeader.get(2),edmtdiabetes);
		listHash.put(listDataHeader.get(3),edmtstroke);
		listHash.put(listDataHeader.get(4),edmtother);
		listHash.put(listDataHeader.get(5),edmtabout);
	}
	
	

}

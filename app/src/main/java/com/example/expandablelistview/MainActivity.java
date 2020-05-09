package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView listView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("EDMTDEV");
        listDataHeader.add("Android");
        listDataHeader.add("IOS");
        listDataHeader.add("Google MAP");


        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("This  is Expandable ListView");

        List<String> Android = new ArrayList<>();
        Android.add("Android Expandable ListView");
        Android.add("Android Google MAP");
        Android.add("Android This  is IOS");
        Android.add("Android Application");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("xamarin Expandable ListView");
        xamarin.add("xamarin Google MAP");
        xamarin.add("xamarin This  is IOS");
        xamarin.add("xamarin Application");

        List<String> uwp = new ArrayList<>();
        uwp.add("uwp Expandable ListView");
        uwp.add("uwp Google MAP");
        uwp.add("uwp This  is IOS");
        uwp.add("uwp Application");

        listHashMap.put(listDataHeader.get(0), edmtDev);
        listHashMap.put(listDataHeader.get(1), Android);
        listHashMap.put(listDataHeader.get(2), xamarin);
        listHashMap.put(listDataHeader.get(3), uwp);
    }
}

package com.example.wasabi.multipledeviceslab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.GridView;

import java.util.ArrayList;

public class BonusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus);

        ArrayList<Integer> numList = new ArrayList<>();
        for(int i=1; i<21; i++){
            numList.add(i);
        }

        RecyclerView myRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        myRecyclerView.setHasFixedSize(true);

        WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        int rotation = display.getRotation();
        int numOfColumns;
        if(rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270){
            numOfColumns = 3;
        }else{
            numOfColumns = 2;
        }

        myRecyclerView.setLayoutManager(new GridLayoutManager(this,numOfColumns));

        //Set adapter
        myRecyclerView.setAdapter(new MyAdapter(numList));

    }
}

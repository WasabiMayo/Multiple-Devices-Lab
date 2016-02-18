package com.example.wasabi.multipledeviceslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CardListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        ListView listView = (ListView)findViewById(R.id.cardListView);
        String[] array = new String[]{"Cheesecake", "Waffle", "Strawberry pancake", "Butter pecan icecream", "Banana bread", "Chocolate chip cookie", "Glazed donut"};
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array));

        CardView cardbutton = (CardView)findViewById(R.id.cardlist_cardview);
        cardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardListActivity.this, BonusActivity.class);
                startActivity(intent);
            }
        });
    }
}

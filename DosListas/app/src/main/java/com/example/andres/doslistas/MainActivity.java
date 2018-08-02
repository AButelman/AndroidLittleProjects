package com.example.andres.doslistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView leftList;
    private ListView rightList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftList = (ListView) findViewById(R.id.leftList);
        rightList = (ListView) findViewById(R.id.rightList);

        ArrayAdapter<CharSequence> adapterLeft = ArrayAdapter.createFromResource(this,
                R.array.animals, android.R.layout.simple_list_item_1);

        leftList.setAdapter(adapterLeft);

        ArrayAdapter<CharSequence> adapterRight = ArrayAdapter.createFromResource(this,
                R.array.nombres, android.R.layout.simple_list_item_1);

        rightList.setAdapter(adapterRight);

        rightList.setBackgroundColor(getResources().getColor(R.color.rosa));

        leftList.setItemsCanFocus(true);

    }
}

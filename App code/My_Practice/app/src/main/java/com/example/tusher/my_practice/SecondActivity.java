package com.example.tusher.my_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    private ListView listview;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listview = (ListView) findViewById(R.id.ListViewId);

      final  String[] str =  getResources().getStringArray(R.array.Spot_Names);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(SecondActivity.this,R.layout.spot_view,R.id.TextViewId,str);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = str[position];
                intent = new Intent(SecondActivity.this,ProfileActivity.class);
                intent.putExtra("name",value);
                startActivity(intent);

            }
        });

    }
}

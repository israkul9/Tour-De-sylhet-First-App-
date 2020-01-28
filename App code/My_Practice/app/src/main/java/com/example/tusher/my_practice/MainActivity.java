package com.example.tusher.my_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open = (Button) findViewById(R.id.Open);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OpenSecondActivity();
            }
        });

    }
  public void  OpenSecondActivity()
    {
        Intent intend = new Intent( this , SecondActivity.class );

        startActivity(intend);

    }
}

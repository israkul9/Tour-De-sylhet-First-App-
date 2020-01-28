package com.example.tusher.my_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView textview;
    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textview = (TextView) findViewById(R.id.text_view_id);
        imageview = (ImageView) findViewById(R.id.Image_view_id) ;


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String des = bundle.getString("name");
            display(des);
        }

    }


    void display(String des)
    {

        if(des.equals("Hazrat_Shahjalal_Mazar_Sharif"))
        {
            textview.setText(R.string.Mazaar);
            imageview.setImageResource(R.drawable.majar);

        }
        else if(des.equals("Shahjalal_University_of_Science_and_Technology"))
        {
            textview.setText(R.string.SUST);
            imageview.setImageResource(R.drawable.sust);

        }
        else if(des.equals("Sylhet_Engineering_College"))
        {
            textview.setText(R.string.SEC);
            imageview.setImageResource(R.drawable.sec);
        }
        else if(des.equals("Sylhet_Agricultural_University"))
        {
            textview.setText(R.string.sau);
            imageview.setImageResource(R.drawable.sau);

        }
        else if(des.equals("MC_College"))
        {
            textview.setText(R.string.MC);
            imageview.setImageResource(R.drawable.mc);
        }

        else if(des.equals("Ali_Amjad_s_Clock"))
        {
            textview.setText(R.string.clock);
            imageview.setImageResource(R.drawable.clock);

        }

        else if(des.equals("Keane_Bridge"))
        {
            textview.setText(R.string.Kin);
            imageview.setImageResource(R.drawable.kin);

        }
        else if(des.equals("Osmani_Museum"))
        {
            textview.setText(R.string.musuam);
            imageview.setImageResource(R.drawable.musum);
        }
        else if(des.equals("Bisanakandi"))
        {
            textview.setText(R.string.bisna);
            imageview.setImageResource(R.drawable.bisana);
        }
        else if(des.equals("Jaflong"))
    {
        textview.setText(R.string.jaf);
        imageview.setImageResource(R.drawable.jaf);
    }
    else if(des.equals("Ratargul_Swamp_Forest"))
    {
        textview.setText(R.string.ratar);
        imageview.setImageResource(R.drawable.ratargul);
    }
           else if(des.equals("Tilagor_Eco_Park"))
    {
        textview.setText(R.string.eco);
        imageview.setImageResource(R.drawable.eco);
    }
           else if(des.equals("Shimul_Garden,_Sunamganj"))
    {
        textview.setText(R.string.bagan);
        imageview.setImageResource(R.drawable.bagan);
    }
           else if(des.equals("Tanguar_haor"))
    {
        textview.setText(R.string.Tabgua);
        imageview.setImageResource(R.drawable.tangua);
    }
           else if(des.equals("Others_Spot..."))
    {
        textview.setText(R.string.others);
        imageview.setImageResource(R.drawable.tea);

    }
}


}


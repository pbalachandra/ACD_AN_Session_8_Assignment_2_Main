package com.acadgild.balu.acd_an_session_8_assignment_2_main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button  button_settings, button_show;
    TextView    textView_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_settings = (Button) findViewById(R.id.button_settings);
        button_show = (Button) findViewById(R.id.button_show);
        button_settings.setOnClickListener(this);
        button_show.setOnClickListener(this);

        textView_display = (TextView) findViewById(R.id.textView_display);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.button_settings)
        {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.button_show)
        {
            String display_settings = "";
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

            display_settings = display_settings +
                                getResources().getString(R.string.str_password_title) + " : " +
                                sharedPreferences.getString("prefUserPassword", "NULL") + "\n";

            display_settings = display_settings +
                    getResources().getString(R.string.str_lock_title) + " : " +
                    sharedPreferences.getBoolean("prefLockScreen", false) + "\n";

            display_settings = display_settings +
                    getResources().getString(R.string.str_reminder_title) + " : " +
                    sharedPreferences.getString("prefUpdateFrequency", "NULL") + "\n";
            Log.e("display", display_settings);
            textView_display.setText(display_settings);

        }

    }
}

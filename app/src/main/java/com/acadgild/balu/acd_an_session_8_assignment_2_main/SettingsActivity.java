package com.acadgild.balu.acd_an_session_8_assignment_2_main;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by BALU on 6/1/2016.
 */
public class SettingsActivity extends PreferenceActivity
{
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}

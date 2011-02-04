package ru.d_lab.HundredPushUps;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PreferencesXml extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }

}

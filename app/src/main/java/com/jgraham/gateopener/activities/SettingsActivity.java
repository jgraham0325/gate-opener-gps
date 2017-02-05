package com.jgraham.gateopener.activities;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.jgraham.gateopener.R;

/**
 * Created by James on 03/02/2017.
 */

public class SettingsActivity extends Activity {

    public static final String KEY_PREF_NUM_TO_CALL = "pref_num_to_call";
    public static final String KEY_PREF_GEOFENCE_RADIUS = "pref_geofence_radius";
    public static final String KEY_PREF_UPDATE_INTERVAL = "pref_update_interval";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }

    public static class SettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
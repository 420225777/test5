package com.example.asus.myapplication6;

        import android.os.Bundle;
        import android.preference.PreferenceFragment;
        import android.support.annotation.Nullable;

public class PreferenceActivityTest extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

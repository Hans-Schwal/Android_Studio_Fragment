package com.afpa.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText,String bottomImageText){
        FragmentManager fm = getSupportFragmentManager();
        BottomFragment bf = (BottomFragment) fm.findFragmentById(R.id.fragment2);
        bf.showText(topImageText, bottomImageText);
    }


}

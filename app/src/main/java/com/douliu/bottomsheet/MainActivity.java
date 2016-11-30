package com.douliu.bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void slide(View view){
        BottomSheet bottomSheet = BottomSheet.newInstance();
        getSupportFragmentManager().beginTransaction()
                .add(bottomSheet,"bottomSheet")
                .commit();
    }
}

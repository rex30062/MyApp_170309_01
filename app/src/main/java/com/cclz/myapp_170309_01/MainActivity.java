package com.cclz.myapp_170309_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 =(CheckBox) findViewById(R.id.checkBox);
        chk2 =(CheckBox) findViewById(R.id.checkBox);
        chk3 =(CheckBox) findViewById(R.id.checkBox);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Log.d("CHK", "chk1 打勾");
                }else{
                    Log.d("CHK", "chk1 不打勾");
                }
            }
        });
    }

    public void click1(View v){
        if(chk1.isChecked()){
            Log.d("CHK", "檢查後，chk1 有打勾");
        }else {
            Log.d("CHK", "檢查後，chk1 沒有打勾");
        }
    }
}

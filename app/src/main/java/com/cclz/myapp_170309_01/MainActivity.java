package com.cclz.myapp_170309_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox chk[]=new CheckBox[3];
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk[0] =(CheckBox) findViewById(R.id.checkBox);
        chk[1] =(CheckBox) findViewById(R.id.checkBox2);
        chk[2] =(CheckBox) findViewById(R.id.checkBox3);
        rg = (RadioGroup) findViewById(R.id.radioGroup);

        for(CheckBox c : chk){
            c.setOnCheckedChangeListener(this);
        }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton4:
                        Log.d("RDO", "4");
                        break;
                    case R.id.radioButton5:
                        Log.d("RDO", "5");
                        break;
                    case R.id.radioButton6:
                        Log.d("RDO", "6");
                        break;
                }
            }
        });
    }

    public void click1(View v){
        if(chk[0].isChecked()){
            Log.d("CHK", "檢查後，chk1 有打勾");
        }else {
            Log.d("CHK", "檢查後，chk1 沒有打勾");
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            switch (buttonView.getId()){
                case R.id.checkBox:
                    Log.d("CHK","chk1 打勾");
                    break;
                case R.id.checkBox2:
                    Log.d("CHK","chk2 打勾");
                    break;
                case R.id.checkBox3:
                    Log.d("CHK","chk3 打勾");
                    break;
            }
        }
    }
}

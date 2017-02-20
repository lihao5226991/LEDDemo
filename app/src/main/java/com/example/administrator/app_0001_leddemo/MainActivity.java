package com.example.administrator.app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private boolean checkFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        checkBox1 = (CheckBox)findViewById(R.id.check_box1);
        checkBox2 = (CheckBox)findViewById(R.id.check_box2);
        checkBox3 = (CheckBox)findViewById(R.id.check_box3);
        checkBox4 = (CheckBox)findViewById(R.id.check_box4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkFlag){
                    checkBox1.setChecked(true);
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    checkBox4.setChecked(true);
                    checkFlag = true;
                    btn.setText("ALL OFF");
                } else {
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox4.setChecked(false);
                    checkFlag = false;
                    btn.setText("ALL ON");
                }


            }
        });
    }
}

package com.roseleen.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv_RA;
    TextView tv_FG;
    Button return_BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_RA = (TextView) findViewById(R.id.raGrade);
        tv_FG = (TextView) findViewById(R.id.finalGrade);

        return_BTN = (Button) findViewById(R.id.btnReturn);
        String ra = getIntent().getStringExtra("ra");
        String fg = getIntent().getStringExtra("fg");

        tv_RA.setText("Your RA is "+ra);
        tv_FG.setText("Your FG is "+fg);
    }
    public void goBackToMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

package com.example.deep23.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    private ImageButton r_imgBtn, p_imgBtn, s_imgBtn;
    private TextView result_tv, count_tv;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize buttons
        r_imgBtn = (ImageButton) findViewById(R.id.btnRock);
        p_imgBtn = (ImageButton) findViewById(R.id.btnPaper);
        s_imgBtn = (ImageButton) findViewById(R.id.btnScissors); //initialize imgView
        imgView = (ImageView) findViewById(R.id.viewCmp);       //initialize result and count TextView
        result_tv = (TextView) findViewById(R.id.textResult);
        count_tv = (TextView) findViewById(R.id.textCount);
        MyOnClickListener myOnClickListener = new MyOnClickListener();
        r_imgBtn.setOnClickListener(myOnClickListener);
        p_imgBtn.setOnClickListener(myOnClickListener);
        s_imgBtn.setOnClickListener(myOnClickListener);
    }
    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v){
            int rand = (int) (Math.random() * 3 + 1); // get a random number form 1 to 3
            count++;
            switch (rand) {
                case 1:
                    imgView.setImageResource(R.drawable.rock); //computer choose Rock
                    switch (v.getId()) {
                        case R.id.btnRock: //player choose Rock
                            result_tv.setText("Result: " + "Tied!");
                            count_tv.setText("Round: " + "count");
                            break;
                        case R.id.btnPaper: //player choose Paper
                            result_tv.setText("Result: " + "Win!");
                            count_tv.setText("Round: " + count);
                            break;
                        case R.id.btnScissors: //player choose Scissors
                            result_tv.setText("Result: " + "Lose!");
                            count_tv.setText("Round: " + "count");
                            break;
                    }
                    break;
                case 2:
                    imgView.setImageResource(R.drawable.paper); //computer choose Paper
                    switch (v.getId()) {
                        case R.id.btnRock:
                            result_tv.setText("Result:" + "Lose!");
                            count_tv.setText("Round:" + "count");
                            break;
                        case R.id.btnPaper:
                            result_tv.setText("Result: " + "Tie!");
                            count_tv.setText("Round: " + "count");
                            break;
                        case R.id.btnScissors:
                            result_tv.setText("Result: " + "Win!");
                            count_tv.setText("Round: " + "count");
                            break;
                    }
                    break;
                case 3:
                    imgView.setImageResource(R.drawable.scissors); //computer choose Scissors
                    switch (v.getId()) {
                        case R.id.btnRock:
                            result_tv.setText("Result: " + "Win!");
                            count_tv.setText("Round: " + "count");
                            break;
                        case R.id.btnPaper:
                            result_tv.setText("Result: " + "Lose!");
                            count_tv.setText("Round: " + "count");
                            break;
                        case R.id.btnScissors:
                            result_tv.setText("Result: " + "Tie!");
                            count_tv.setText("Round: " + "count");
                            break;
                    }
                    break;
            }
        }
    }


}

package com.example.jeffery.BJ1616939Task3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by JEFFERY on 4/27/2016.
 */
public class Counting_Game extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counting_game);

        TextView userView = (TextView)findViewById(R.id.users);
        userView.setText(getIntent().getExtras().getString("Welcome"));


        final EditText userguess = (EditText) findViewById(R.id.editText2);
        final TextView tvInput = (TextView) findViewById(R.id.textView6);
        final TextView tvOutput = (TextView) findViewById(R.id.textView7);
        Button btcheck = (Button)findViewById(R.id.button);

        String[] myNames ={"emmanuel", "Mary", "Patrick", "Janet"};
        int rando = (int)(Math.random()*4);
        tvInput.setText(myNames[rando]);

        btcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int rando;
                rando = Integer.parseInt(userguess.getText().toString());
                if (tvInput.length() == rando) {
                    tvOutput.setText("Correct Value");
                }else if (tvInput.length()!= rando){
                    tvOutput.setText("Wrong Value");
                }else {
                    tvOutput.setText(null);
                }
            }
        });


    }
}

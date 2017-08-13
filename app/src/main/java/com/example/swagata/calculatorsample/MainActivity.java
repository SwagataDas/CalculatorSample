package com.example.swagata.calculatorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button plusButton, equalsButton;
    private int firstNumberGroup;
    private int secondNumberGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        textView.setText("");

        plusButton = (Button) findViewById(R.id.plus);
        equalsButton = (Button) findViewById(R.id.equals);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumberGroup = Integer.parseInt(textView.getText().toString());
                textView.setText("");
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumberGroup = Integer.parseInt(textView.getText().toString());
                int add = firstNumberGroup + secondNumberGroup;
                textView.setText(""+add);
            }
        });
    }

    public void numberOnClick(View view) {
        TextView buttonText = (TextView) view;
        if (textView.getText().equals("")) {
            textView.setText(buttonText.getText());
        }else {
            textView.append(buttonText.getText());
        }
//        switch (view.getId()){
//            case R.id.number_one:
//                break;
//            case R.id.number_two:
//                break;
//        }
    }
}

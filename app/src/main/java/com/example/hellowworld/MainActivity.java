package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn1;
    private EditText editText1;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.Btn1);
        btn1.setTextColor(Color.RED);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Hello World");
            }
        });
        editText1=(EditText)findViewById(R.id.Edit_first);
        textView1=(TextView)findViewById(R.id.textView_first);

    }


    public void OnClickBtn2(View view) {
       //     textView1.setText(textView1.getText().toString()+editText1.getText());
            textView1.setText(textView1.getText().toString().concat(editText1.getText().toString()));

    }
}
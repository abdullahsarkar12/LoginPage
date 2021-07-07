package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username,password;
    private Button button;
    private TextView textView;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.EditTextId1);
        password=findViewById(R.id.EditTextId2);
        button=findViewById(R.id.LoginButtonId);
        textView=findViewById(R.id.TextViewId);
        textView.setText("Number of attempts : 3");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=username.getText().toString();
                String pass=password.getText().toString();

                if(name.equals("sarkar") && pass.equals("9638"))
                {
                    Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    counter--;
                    textView.setText("Number of remaining attemts:"+counter);
                    if(counter==0){
                        button.setEnabled(false);
                    }
                }
            }
        });


    }
}
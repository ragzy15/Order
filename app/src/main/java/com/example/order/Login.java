package com.example.order;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnShowAddress;
    public final static String EXTRA_MESSAGE = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b1 = (Button)findViewById(R.id.sign_up_button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.name);
                EditText num = (EditText) findViewById(R.id.number);
                Context context = getApplicationContext();
                String na = name.getText().toString();
                String no = num.getText().toString();
                int nal = na.length();
                int nol = no.length();
                if(nal == 0){
                    Toast toast = Toast.makeText(context, "Name field cannot be blank", Toast.LENGTH_SHORT  );
                    toast.show();
                }
                else if(nol != 10) {
                    Toast toast = Toast.makeText(context, "Number field cannot be blank or short than 10", Toast.LENGTH_SHORT );
                    toast.show();
                }
                else {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    EditText editText = (EditText) findViewById(R.id.name);
                    String message = editText.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
            }
        });
    }
}

package com.example.angul.myfogg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText editText, editText1;
    Button bLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = (EditText) findViewById(R.id.edname);
        editText1 = (EditText) findViewById(R.id.edpas);
        bLogin = (Button) findViewById(R.id.btn3);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasar();
            }
        });
    }
    public  void pasar(){
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }
}

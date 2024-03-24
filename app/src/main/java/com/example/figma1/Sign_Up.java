package com.example.figma1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_Up extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
    }

    public void openSign_In(View view) {
        EditText emailInput = findViewById(R.id.email_in);
        EditText passInput = findViewById(R.id.pass_in);
        EditText checked_pass = (EditText)findViewById(R.id.PassInputConfirm);
        Boolean checkPass = checked_pass.getText().toString().equals(passInput.getText().toString());
        if (!checkPass){
            return;
        }
        String email = emailInput.getText().toString();
        String pass = passInput.getText().toString();

        User userData = new User(email, pass);
        Intent intent = new Intent(this, Sign_In.class);
        intent.putExtra(User.class.getName(), userData);
        startActivity(intent);
    }

    public void PrevPage(View view) {
        finish();
    }
}

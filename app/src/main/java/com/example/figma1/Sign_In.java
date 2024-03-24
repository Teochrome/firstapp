package com.example.figma1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_In extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
        get_data();
    }

    public void openSign_Up(View view) {
        Intent intent = new Intent(this, Sign_Up.class);
        startActivity(intent);
    }

    private void get_data() {
        EditText emailInput = findViewById(R.id.email_in);
        EditText passInput = findViewById(R.id.pass_in);

        User user_data = (User) getIntent().getSerializableExtra(User.class.getName());

        if (user_data != null) {
            emailInput.setText(user_data.Email());
            passInput.setText(user_data.Password());
        }
    }
}
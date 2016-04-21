package com.example.denis.testgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE="com.example.denis.testgit.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(MainActivity.this, "onCreate dude", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(MainActivity.this, "onResume dude", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage(View view){
        Intent intent=new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.edit_message);
        String message= null;
        if (editText != null) {
            message = editText.getText().toString();
        }
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}

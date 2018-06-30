package com.silmood.ciph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cipher(View button){
        String message = extractTextFrom(R.id.input_message);
        if(message.isEmpty()){
            setError(R.id.input_message,R.string.error_empty);
        }else {
            String result = Cipher.rot13(message);
            setText(R.id.label_output, result);
        }
    }

    private String extractTextFrom(int inputId){
        EditText input = findViewById(inputId);
        return input.getText().toString();
    }

    private void setText(int labelId, String text){
        TextView view = findViewById(labelId);
        view.setText(text);
    }

    private void setError(int labelId, int errorId){
        TextView view = findViewById(labelId);
        view.setError(getString(errorId));
    }
}

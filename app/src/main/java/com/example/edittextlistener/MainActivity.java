package com.example.edittextlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 =findViewById(R.id.textView);
        editText2 =findViewById(R.id.textView2);

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ////This method is called to notify you that, within s, the count characters beginning at start have just replaced old text that had length before.
            }

            @Override
            public void afterTextChanged(Editable s) {
                //This method is called to notify you that, somewhere within s, the text has been changed.
                editText2.setText(""+Integer.valueOf(editText1.getText().toString())*2);
            }
        });
    }
}

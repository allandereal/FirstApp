package com.codephillip.app.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyFancyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: has started");

        final TextView replytextView = (TextView) findViewById(R.id.textview_reply);
        final EditText nameEditText = (EditText) findViewById(R.id.edit_enter_name);

        final LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
        final LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);

        Button clickButton = (Button) findViewById(R.id.click_button);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: button is clicked");

                String name = nameEditText.getText().toString();
                replytextView.setText(name);

//                layout1.setVisibility(View.GONE);
//                layout2.setVisibility(View.VISIBLE);

                Intent intent = new Intent(getApplicationContext(), FuncyTabs.class);
                intent.putExtra("username", name);
                intent.putExtra("age", 40);

                startActivity(intent);
            }
        });




    }
}

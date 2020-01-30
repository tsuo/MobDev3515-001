package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.id_btn_change_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.id_txt_title_text)).setText(R.string.changed_text);
            }
        });
    }
}

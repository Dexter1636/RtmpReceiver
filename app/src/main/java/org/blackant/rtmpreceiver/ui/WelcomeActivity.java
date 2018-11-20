package org.blackant.rtmpreceiver.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.blackant.rtmpreceiver.R;

public class WelcomeActivity extends AppCompatActivity {

    private  Button bt1;

    private  Button bt2;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        bt1=(Button)findViewById(R.id.to_video);
        bt2=(Button)findViewById(R.id.out);
        textView=(TextView)findViewById(R.id.welcome);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(WelcomeActivity.this,VideoActivity.class);
                    startActivityForResult(intent,1);
                startActivityForResult(intent,1);
            }

        });
    }

}

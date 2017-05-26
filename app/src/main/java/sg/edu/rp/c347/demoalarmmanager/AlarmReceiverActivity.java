package sg.edu.rp.c347.demoalarmmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AlarmReceiverActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);

        tvResult = (TextView)findViewById(R.id.textViewResult);

        Intent intentReceived = getIntent();
        String messageReceived = intentReceived.getStringExtra("text");
        tvResult.setText(messageReceived);

    }
}

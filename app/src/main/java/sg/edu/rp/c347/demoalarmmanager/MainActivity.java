package sg.edu.rp.c347.demoalarmmanager;

import android.app.AlarmManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //int requestCode = 123;
    //int notificationID = 888;

    Button btnSetAlarm;
    AlarmManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSetAlarm = (Button)findViewById(R.id.btnAlarm);

        btnSetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.SECOND, 5);

                //Create a new PendingIntent and add it to the AlarmManager
                //Intent intent = new Intent(MainActivity.this, AlarmReceiverActivity.class);

                //int reqCode = 12345;

                //PendingIntent pIntent = PendingIntent.getActivities(MainActivity.this, requestCode, intent, PendingIntent.FLAG_CANCEL_CURRENT);

                Intent intent = new Intent(getBaseContext(), AlarmReceiverActivity.class );
                intent.putExtra("text", "Alarm Received");
                startActivity(intent);

            }
        });

    }
}

package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText, nameText, ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username1);
        nameText = findViewById(R.id.text_name1);
        ageText = findViewById(R.id.text_age1);

        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            // TODO: display value here
            usernameText.setText(extras.getString("username"));
            nameText.setText(extras.getString("name"));
            ageText.setText(String.valueOf(extras.getInt("age")));
        }
    }
}

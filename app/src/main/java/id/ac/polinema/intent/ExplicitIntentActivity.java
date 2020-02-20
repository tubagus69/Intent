package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);

    }

    public void handleVariableInput(View view) {
        outputText.setText("Hello " + nameInput.getText() + ", Congratulations!");
    }
}

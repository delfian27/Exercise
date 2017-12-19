package app.exercise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ASUS on 12/19/2017.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

        TextView tvUsername = (TextView) findViewById(R.id.tvUsername);

        String username = getIntent().getStringExtra("username");

        tvUsername.setText(username);
    }
}

package kr.hs.emirim.s2019w04.mirimtoastdialogtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textName, textEmail; //activity_main
    EditText editName, editEmail; //dialog1
    TextView textToast; //toast1
    View dialogView, toastView;
    Button btnHere; //activity_main

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
        editName = findViewById(R.id.edit_name);
        editEmail = findViewById(R.id.edit_email);
    }
}
package id.ac.poliban.mi.aulia.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNama = findViewById(R.id.etNama);
        final EditText etNim = findViewById(R.id.etNim);
        final EditText etAlamat = findViewById(R.id.etAlamat);
        final EditText etPhone = findViewById(R.id.etPhone);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNama.getText().clear();
                etNim.getText().clear();
                etAlamat.getText().clear();
                etPhone.getText().clear();
                Toast.makeText(MainActivity.this, "Anda telah memasukkan data", Toast.LENGTH_SHORT).show();

            }
        });


        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNama.getText().clear();
                etNim.getText().clear();
                etAlamat.getText().clear();
                etPhone.getText().clear();






            }
        });


    }



    }


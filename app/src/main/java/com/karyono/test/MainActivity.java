package com.karyono.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
public static final String FILENAME="menu";

    EditText input_nama, input_alamat;
    Button btn_submit, btn_cancle;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nama=findViewById(R.id.input_nama);
        input_alamat=findViewById(R.id.input_alamat);
        simpanFile();
    }

    void simpanFile(){
    String isiFile = input_nama.getText().toString() + ";" + input_alamat.getText().toString();
        File file= new File(getFilesDir(),FILENAME);

        FileOutputStream outputStream=null;
        try {
            file.createNewFile();
            outputStream=new FileOutputStream(file,false);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        Toast.makeText(this,"Berhasil di Simpan",Toast.LENGTH_SHORT).show();
        onBackPressed();
    }
}
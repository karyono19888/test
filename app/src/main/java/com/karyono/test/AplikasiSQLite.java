package com.karyono.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toolbar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AplikasiSQLite extends AppCompatActivity {
    EditText nama_view, nama_alamat;
    public static final String FILENAME="menu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Wiew Data");

        nama_view=findViewById(R.id.input_nama);
        nama_alamat=findViewById(R.id.input_alamat);

        bacaFile();
        bacaDatauser();

    }
    void bacaFile(){
        File sdcard=getFilesDir();
        File file=new File(sdcard,FILENAME);
        if (file.exists()){
            StringBuilder text=new StringBuilder();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line=br.readLine();
                while (line !=null){
                    text.append(line);
                    line=br.readLine();
                }
                br.close();
            }catch (IOException e){
                System.out.println("Error" + e.getMessage());
            }
//            String data=text.toString();
//            String() datauser=data.split(";");
//            bacaFile(datauser(0));
        }
    }
    void bacaDatauser(){

    }

}
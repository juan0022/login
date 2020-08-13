package com.example.login;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.MainActivity;
import com.example.login.R;

import java.util.ArrayList;

public class Pantalla2 extends AppCompatActivity
{
        ListView listView;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        ListView listView = (ListView) findViewById(R.id.listview);
final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("fralis joel- te hechos de menos");
        arrayList.add("fralis joel- hablamos despues");
        arrayList.add("lisandro nieto- toco el cielo");
        arrayList.add("harold y elena- por siempre");
        arrayList.add("juanpa y lenny- el amor viene de Dios");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(Pantalla2.this,"Canciones: "+i+" "+arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
        }
        });

        }




        }

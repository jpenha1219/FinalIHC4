package com.example.dave.finalihc.Conectaqp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 *
 */
public class Mensajes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listaMensajes;
        ArrayAdapter<String> adapter;

        listaMensajes = findViewById(R.id.lista_mensajes);
        adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("Mensaje 1");
        adapter.add("Mensaje 2");
        adapter.add("Mensaje 3");
        listaMensajes.setAdapter(adapter);


        ImageView back = findViewById(R.id.back_mensaje);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

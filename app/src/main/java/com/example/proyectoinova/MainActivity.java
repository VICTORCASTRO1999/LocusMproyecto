package com.example.proyectoinova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewNombre;
    private RecyclerViewAdaptador adaptadorNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNombre=(RecyclerView) findViewById(R.id.recyclerNombre);
        recyclerViewNombre.setLayoutManager(new LinearLayoutManager(this));
        adaptadorNombre=new RecyclerViewAdaptador(obtenerNombres());
        recyclerViewNombre.setAdapter(adaptadorNombre);
    }
    public List<grupo> obtenerNombres(){
        List<grupo>  nombre = new ArrayList<>();
        nombre.add(new grupo("Nosis","Ska,Rock",R.drawable.nosis));
        nombree.add(new grupo("Los hijos de santo","Ska,Rock",R.drawable.loshijosdelsanto));
        grupo.add(new grupo("Sentenciados","Ska,Rock",R.drawable.sentenciados));
        grupo.add(new grupo("Grupo Tendencia","Ska,Rock",R.drawable.grupotendencia));
        grupo.add(new grupo("Mariachi Aguila","Ska,Rock",R.drawable.mariachiaguila));
    }
}
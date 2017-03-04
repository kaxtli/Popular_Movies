package com.kaxtli.popular_movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.kaxtli.adapters.CarAdapter;
import com.kaxtli.models.Car;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Atributos
    /*private String[] data = new String[]{
            "Such list",
            "Very UI",
            "Too Android",
            "Wow! Its of programmings"
    };*/

    private ArrayList<Car> cars = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Alimentando la lista de carros
        cars.add(new Car(R.drawable.carros1, "Auto 1", "Un interesante auto 1 deportivo"));
        cars.add(new Car(R.drawable.carros2, "Auto 2", "Un interesante auto 2 deportivo"));
        cars.add(new Car(R.drawable.carros3, "Auto 3", "Un interesante auto 3 deportivo"));
        cars.add(new Car(R.drawable.carros4, "Auto 4", "Un interesante auto 4 deportivo"));
        cars.add(new Car(R.drawable.carros5, "Auto 5", "Un interesante auto 5 deportivo"));
        cars.add(new Car(R.drawable.carros1, "Auto 6", "Un interesante auto 6 deportivo"));
        cars.add(new Car(R.drawable.carros2, "Auto 7", "Un interesante auto 7 deportivo"));
        cars.add(new Car(R.drawable.carros3, "Auto 8", "Un interesante auto 8 deportivo"));
        cars.add(new Car(R.drawable.carros4, "Auto 9", "Un interesante auto 9 deportivo"));
        cars.add(new Car(R.drawable.carros5, "Auto 10", "Un interesante auto 10 deportivo"));
        cars.add(new Car(R.drawable.carros1, "Auto 1", "Un interesante auto 1 deportivo"));
        cars.add(new Car(R.drawable.carros2, "Auto 2", "Un interesante auto 2 deportivo"));
        cars.add(new Car(R.drawable.carros3, "Auto 3", "Un interesante auto 3 deportivo"));
        cars.add(new Car(R.drawable.carros4, "Auto 4", "Un interesante auto 4 deportivo"));
        cars.add(new Car(R.drawable.carros5, "Auto 5", "Un interesante auto 5 deportivo"));
        cars.add(new Car(R.drawable.carros1, "Auto 6", "Un interesante auto 6 deportivo"));
        cars.add(new Car(R.drawable.carros2, "Auto 7", "Un interesante auto 7 deportivo"));
        cars.add(new Car(R.drawable.carros3, "Auto 8", "Un interesante auto 8 deportivo"));
        cars.add(new Car(R.drawable.carros4, "Auto 9", "Un interesante auto 9 deportivo"));
        cars.add(new Car(R.drawable.carros5, "Auto 10", "Un interesante auto 10 deportivo"));

        // Instanciando un adaptador! :: El nativo sólo acepta tipos primitivos ::
        // Contexto, Layout de Android, datos
        // ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        // Creando el adaptador personalizado para Car
        CarAdapter adapter = new CarAdapter(this, cars);
        // Enviando datos al ListView en MainLayout
        // Obteniendo el elemento
        RecyclerView recycler = (RecyclerView) findViewById(R.id.DataList);
        // RecyclerView puede generar layouts de manera dinámica. Requiere de un manejador.
        // Existen varias maneras. Puedes incluso generar grids!!
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        // Tamaño fijo.
        recycler.setHasFixedSize(true);
        // Enviando los datos
        recycler.setAdapter(adapter);
    }
}

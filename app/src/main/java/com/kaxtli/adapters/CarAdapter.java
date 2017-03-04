package com.kaxtli.adapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaxtli.models.Car;
import com.kaxtli.popular_movies.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by kaxtli on 04/03/2017.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    // Datos para el adaptador
    private ArrayList<Car> data;
    private Context context;

    public CarAdapter(Context context, ArrayList<Car> cars){
        this.data = cars;
        this.context = context;
    }

    // Sobreescribiendo los métodos principales

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Se invoca con cada elemento visible. SOLO LOS VISIBLES
        // Si el tercer parámetro es true, no se utilizará el reciclado dinámico.
        // Esto es, estático.
        // Generando la vista a partir del XML
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        // Traduciendo a un ViewHolder
        ViewHolder holder = new ViewHolder(view);
        // Etiquetado
        view.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Se llama cada que se hace un scroll y se recicla la vista.

        // Obteniendo un elemento del arraylist
        Car car = data.get(position); // <- Qué posición? :: Viene de la función.
        // Empezar a llenar los elementos. Ahora holder contiene nuestros datos
        holder.title.setText(car.getTitle());

        holder.subtitle.setText(car.getDescription());

        holder.image.setImageResource(car.getImageID()); // <- Con esto ligamos una imagen al ImageView
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // Clase estática para implementa la vista reciclable en ViewHolder
    // Contiene todos los elementos que existen en la vista!! (Serán recicladas)
    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView subtitle;
        private final ImageView image;

        // Creando el constructur
        public ViewHolder (View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.titleTextView);
            subtitle = (TextView)view.findViewById(R.id.subtitleTextView);
            image = (ImageView)view.findViewById(R.id.itemViewImage);
        }
    }
}

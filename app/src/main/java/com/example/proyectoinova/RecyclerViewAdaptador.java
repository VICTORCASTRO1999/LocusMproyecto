package com.example.proyectoinova;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>{

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView nombre,genero;
        ImageView imggrupo;

        public ViewHolder( View itemView) {
            super(itemView);
            nombre=(TextView) itemView.findViewById(R.id.tvnombre);
            genero=(TextView) itemView.findViewById(R.id.tvgenero);
            imggrupo=(ImageView) itemView.findViewById(R.id.);
        }
    }
    public List <grupo> nombreList;

    public RecyclerViewAdaptador(List<grupo> nombreListList) {
        this.nombreList = nombreList;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext().inflace(R.layout.nombre,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.nombre.setText(nombreList.get(position).getNombre());
        holder.genero.setText(nombreList.get(position).getGenero());
        holder.imggrupo.setImageResource(nombreList.get(position).getImggruo());
    }

    @Override
    public int getItemCount() {
        return nombreList.size();
    }
}


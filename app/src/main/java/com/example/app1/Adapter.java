package com.example.app1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PlatoViewHolder> {

    List<Plato> platos;

    public Adapter(List<Plato> platos) {
        this.platos = platos;
    }
    @NonNull
    @Override
    public PlatoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PlatoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pedido, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(PlatoViewHolder platoViewHolder, int i) {
        platoViewHolder.setData(i);
    }

    @Override
    public int getItemCount() {
        return platos.size();
    }


    public class PlatoViewHolder extends RecyclerView.ViewHolder{
        CardView cvPlato;
        TextView tvNombrePlato;
        TextView tvPrecio;
        ImageView ivImage;

        PlatoViewHolder(View platoView){
            super(platoView);
            cvPlato = platoView.findViewById(R.id.cvPlato);
            tvNombrePlato = platoView.findViewById(R.id.tvNombrePlato);
            tvPrecio = platoView.findViewById(R.id.tvPrecio);
            ivImage = platoView.findViewById(R.id.ivImage);
        }

        public void setData(int i){
            tvNombrePlato.setText(platos.get(i).getNombre());
            tvPrecio.setText(String.valueOf(platos.get(i).getValor().intValue()));
            ivImage.setImageResource(platos.get(i).getImagen());
        }
    }
}

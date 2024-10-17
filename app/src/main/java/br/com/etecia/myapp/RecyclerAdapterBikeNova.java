package br.com.etecia.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

        public class ViewHolder extends RecyclerView.ViewHolder{

            CardView modeloBikeNova;
            ImageView idModeloImagemBikeNova;
            TextView idmodeloTituloBikeNova;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                modeloBikeNova = itemView.findViewById(R.id.modeloBikeNova);
                idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
                idmodeloTituloBikeNova = itemView.findViewById(R.id.idmodeloTituloBikeNova);
        }
    }

}

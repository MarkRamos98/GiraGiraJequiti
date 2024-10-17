package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    //criando variaveis globais para representar a lista e o contexto
    private Context context;
    private List<Bikenova> lstBikenova;

    //criuando construtor

    public RecyclerAdapterBikeNova(Context context, List<Bikenova> lstBikenova) {
        this.context = context;
        this.lstBikenova = lstBikenova;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idmodeloTituloBikeNova.setText(lstBikenova.get(position).getTitulo());
        holder.idModeloImagemBikeNova.setImageResource(lstBikenova.get(position).getImagem());

        //criar clique no card


    }

    @Override
    public int getItemCount() {
        return lstBikenova.size();
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

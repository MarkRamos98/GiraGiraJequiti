package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BikesNovasFragment extends Fragment {

    private List<Bikenova> lstBikenova;
    RecyclerView idrecbikesnovas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);

        idrecbikesnovas = view.findViewById(R.id.idrecbikesnovas);

        //carregando os objetos na lista
        lstBikenova = new ArrayList<>();
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Sportmarelo",R.drawable.ImagemA));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));
        lstBikenova.add(new Bikenova("Batman",R.drawable.batma));

        return view;
    }
}
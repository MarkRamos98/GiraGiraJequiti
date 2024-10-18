package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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
        lstBikenova.add(new Bikenova("Sportmarelo",R.drawable.imagema));
        lstBikenova.add(new Bikenova("CasuVerme",R.drawable.imagemb));
        lstBikenova.add(new Bikenova("Sportblack",R.drawable.imagemc));
        lstBikenova.add(new Bikenova("SportBranco",R.drawable.imagemd));
        lstBikenova.add(new Bikenova("YingYang",R.drawable.imageme));
        lstBikenova.add(new Bikenova("SportCult",R.drawable.imagemf));
        lstBikenova.add(new Bikenova("Monster",R.drawable.imagemg));
        lstBikenova.add(new Bikenova("Pantera",R.drawable.imagemh));
        lstBikenova.add(new Bikenova("Wine",R.drawable.imagemi));
        lstBikenova.add(new Bikenova("Street",R.drawable.imagemj));

        //carregando o adaptador
        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(),lstBikenova);

        idrecbikesnovas.setLayoutManager(new GridLayoutManager(getContext(),2));

        idrecbikesnovas.setAdapter(adapterBikeNova);

        return view;
    }
}
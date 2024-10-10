package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BikesDoacaoFragment extends Fragment {

    FloatingActionButton IdFABBikesDoacoes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bikes_doacao, container, false);

        IdFABBikesDoacoes = view.findViewById(R.id.IdFABBikesDoacoes);

        IdFABBikesDoacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Cliquei no FAB", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
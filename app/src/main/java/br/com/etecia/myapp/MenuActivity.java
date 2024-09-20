package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    CardView bike, acessorios, manutencao, locais, dicas, eventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bike = findViewById(R.id.menubicycle);
        acessorios = findViewById(R.id.menugadgets);
        manutencao = findViewById(R.id.menumanutencao);
        locais = findViewById(R.id.menulocais);
        dicas = findViewById(R.id.menudicas);
        eventos = findViewById(R.id.menuevent);

        bike.setOnClickListener(this);
        acessorios.setOnClickListener(this);
        manutencao.setOnClickListener(this);
        dicas.setOnClickListener(this);
        locais.setOnClickListener(this);
        eventos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menubicycle) {
            startActivity(new Intent(getApplicationContext(), Bike_Activity.class));
        }
        if (v.getId() == R.id.menugadgets) {
            startActivity(new Intent(getApplicationContext(), AcessoriosActivity.class));
        }
        if (v.getId() == R.id.menumanutencao) {
            startActivity(new Intent(getApplicationContext(), ManutencaoActivity.class));
        }
        if (v.getId() == R.id.menudicas) {
            startActivity(new Intent(getApplicationContext(), DicasActivity.class));
        }
        if (v.getId() == R.id.menulocais) {
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
        }
        if (v.getId() == R.id.menuevent) {
            startActivity(new Intent(getApplicationContext(), EventosActivity.class));
        }
    }
}
package br.com.etecia.myapp;

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
    }

    @Override
    public void onClick(View v) {

    }
}
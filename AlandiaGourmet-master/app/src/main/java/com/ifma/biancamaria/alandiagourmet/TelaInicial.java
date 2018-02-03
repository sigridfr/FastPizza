package com.ifma.biancamaria.alandiagourmet;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        //Classe que chama a thread para fazer o delay
        Handler handle = new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                pedePizza();
            }
        },2000);

    }

    private void pedePizza(){
        Intent intent = new Intent(this, ActivityPedido.class);
        startActivity(intent);
        finish();
    }
}

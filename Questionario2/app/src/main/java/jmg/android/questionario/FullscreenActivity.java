package jmg.android.questionario;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FullscreenActivity extends Activity {

    public static String nome;
    public static int acertos = 0;
    Button btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        btnProximo = (Button) findViewById(R.id.btnProximo);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!btnProximo.getText().equals(""))
                {
                    nome = btnProximo.getText().toString();
                    Intent proximaActivity = new Intent(FullscreenActivity.this, Questao1Activity.class);
                    startActivity(proximaActivity);
                }
            }
        });
    }
}


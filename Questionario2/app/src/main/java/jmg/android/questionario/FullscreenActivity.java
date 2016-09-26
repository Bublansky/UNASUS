package jmg.android.questionario;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FullscreenActivity extends Activity {

    public static String nome = "";
    public static boolean acertos[];
    private Button btnProximo;
    private EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        acertos = new boolean[5];
        setContentView(R.layout.activity_fullscreen);

        btnProximo = (Button) findViewById(R.id.btnProximo);
        edtNome = (EditText) findViewById(R.id.edtNome);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtNome.getText().equals(""))
                {
                    nome = edtNome.getText().toString();

                    Intent proximaActivity = new Intent(FullscreenActivity.this, Questao1Activity.class);
                    startActivity(proximaActivity);
                }
            }
        });
    }
}


package jmg.android.questionario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by aluno on 26/09/2016.
 */

public class ResultadoActivity extends Activity {

    private TextView txtNome, resultado;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.resultado);

        txtNome = (TextView) findViewById(R.id.textNomeResultado);
        txtNome.setText(FullscreenActivity.nome);
        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullscreenActivity.acertos = new boolean[5];
                FullscreenActivity.nome = "";
                Intent proximaActivity = new Intent(ResultadoActivity.this, FullscreenActivity.class);
                startActivity(proximaActivity);
            }
        });

        //q1
        resultado = (TextView) findViewById(R.id.txtResultado1);
        if(FullscreenActivity.acertos[0]) {
            resultado.setText("Resposta 1 - Correta");
        }
        else
        {
            resultado.setText("Resposta 1 - Errada");
        }
        //q2
        resultado = (TextView) findViewById(R.id.txtResultado2);
        if(FullscreenActivity.acertos[1]) {
            resultado.setText("Resposta 2 - Correta");
        }
        else
        {
            resultado.setText("Resposta 2 - Errada");
        }
        //q3
        resultado = (TextView) findViewById(R.id.txtResultado3);
        if(FullscreenActivity.acertos[2]) {
            resultado.setText("Resposta 3 - Correta");
        }
        else
        {
            resultado.setText("Resposta 3 - Errada");
        }
        //q4
        resultado = (TextView) findViewById(R.id.txtResultado4);
        if(FullscreenActivity.acertos[3]) {
            resultado.setText("Resposta 4 - Correta");
        }
        else
        {
            resultado.setText("Resposta 4 - Errada");
        }
        //q5
        resultado = (TextView) findViewById(R.id.txtResultado5);
        if(FullscreenActivity.acertos[4]) {
            resultado.setText("Resposta 5 - Correta");
        }
        else
        {
            resultado.setText("Resposta 5 - Errada");
        }

*/

    }

}

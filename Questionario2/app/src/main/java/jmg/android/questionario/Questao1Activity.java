package jmg.android.questionario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

/**
 * Created by aluno on 26/09/2016.
 */

public class Questao1Activity extends Activity {

    Button btnProximo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questao1);



        btnProximo = (Button) findViewById(R.id.btnProximoP1);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximaActivity = new Intent(Questao1Activity.this, Questao2Activity.class);
                startActivity(proximaActivity);
            }
        });
    }
}

package jmg.android.questionario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by aluno on 26/09/2016.
 */

public class Questao5Activity extends Activity {
    Button btnProximo;
    RadioGroup rg;
    int op;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questao5);

        rg = (RadioGroup) findViewById(R.id.rg5);


        btnProximo = (Button) findViewById(R.id.btnProximoP5);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = rg.getCheckedRadioButtonId();

                if(op != -1)
                {
                    if(op == R.id.r5a)
                    {
                        FullscreenActivity.acertos[4] = true;

                    }
                    Intent proximaActivity = new Intent(Questao5Activity.this, ResultadoActivity.class);
                    startActivity(proximaActivity);
                }


            }
        });
    }
}

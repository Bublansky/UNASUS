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

public class Questao3Activity extends Activity{

    Button btnProximo;
    RadioGroup rg;
    int op;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questao3);

        rg = (RadioGroup) findViewById(R.id.rg3);


        btnProximo = (Button) findViewById(R.id.btnProximoP3);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = rg.getCheckedRadioButtonId();

                if(op != -1)
                {
                    if(op == R.id.r3a)
                    {
                        FullscreenActivity.acertos[2] = true;

                    }
                    Intent proximaActivity = new Intent(Questao3Activity.this, Questao4Activity.class);
                    startActivity(proximaActivity);
                }


            }
        });
    }
}


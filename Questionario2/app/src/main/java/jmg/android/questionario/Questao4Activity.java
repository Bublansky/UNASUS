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

public class Questao4Activity extends Activity{

    Button btnProximo;
    RadioGroup rg;
    int op;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questao4);

        rg = (RadioGroup) findViewById(R.id.rg4);


        btnProximo = (Button) findViewById(R.id.btnProximoP4);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = rg.getCheckedRadioButtonId();

                if(op != -1)
                {
                    if(op == R.id.r4a)
                    {
                        FullscreenActivity.acertos[3] = true;

                    }
                    Intent proximaActivity = new Intent(Questao4Activity.this, Questao5Activity.class);
                    startActivity(proximaActivity);
                }


            }
        });
    }
}

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

public class Questao2Activity extends Activity{

    Button btnProximo;
    RadioGroup rg;
    int op;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.questao2);

        rg = (RadioGroup) findViewById(R.id.rg2);


        btnProximo = (Button) findViewById(R.id.btnProximoP2);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = rg.getCheckedRadioButtonId();

                if(op != -1)
                {
                    if(op == R.id.r2a)
                    {
                        FullscreenActivity.acertos[1] = true;

                    }
                    Intent proximaActivity = new Intent(Questao2Activity.this, Questao3Activity.class);
                    startActivity(proximaActivity);
                }


            }
        });
    }
}

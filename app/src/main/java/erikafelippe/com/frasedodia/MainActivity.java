package erikafelippe.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Criar cada item que tem no layout

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    //Criar o Array
    private String[] frases = {
            "Se está difícil para você, imagina para quem desenha a sobrancelha com carvão.",
            "Em briga de saci qualquer chute é uma voadora.",
            "Se ferradura desse sorte burro não puxava carroça!",
            "Quem cedo madruga passa o dia com sono.",
            "A esperança é a última que morre e a minha paciência é a primeira.",
            "Depois da tempestade… o trânsito pára!",
            "Não estou ficando velho, o meu espelho que não é Full HD."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // No OnCreate criar o findByID de cada item do layout citado acima
        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFrase);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        //Se tiver botão, criar o OnClickListener
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Instanciar o Random
                Random randomico = new Random();

                //Informar a quantidade de posições pelo tamanho do Array de forma automática
                int numeroAleatorio = randomico.nextInt(frases.length);

                //Mostar o texto usando o nome do Array e o comando de número aleatório
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });


    }
}

package com.wellingtonhenrique.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "O segredo de um relacionamento é ter alguém que não precisa de você pra nada, mas te queira para tudo.",
            "Você é livre para fazer suas escolhas, mas prisioneiro das consequências.",
            "Diferente do estômago, o cérebro nãote avisa quando está vazio.\nTem que checar sempre...",
            "O dia que você planta a semente, não é o mesmo dia que você colhe o fruto.\nSempre plante sementes...",
            "Você só pode vencer quando sua mente for mais forte que as emoções.",
            "A maneira como escolhemos ver o mundo cria o mundo que vemos.",
            "Ter conversas difíceis às vezes é necessário para evitar uma vida difícil.\nO que você diz, cura.\nO que guarda, adoece.",
            "Se você soubesse com que rapidez as pessoas esquecem os mortos, você pararia de viver para impressionas as pessoas.",
            "Duas coisas definem você:\nSua paciência quando você tem nada, e sua atitude quando você tem tudo.",
            "Pise na sua vaidade antes que você tropece nela.",
            "O mundo é trasnformado pelas suas atitudes e não pela opinião.",
            "Se você não quiser obedecer aos outros, terá que aprender a obedecer a si mesmo.",
            "A maioria das pessoas na verdade não querem liberdade.\nA liberdade envolve responsabilidade, e a maioria das pessoas tem medo da responsabilidade.",
            "É preciso morrer algumas vezes antes de realmente começar a viver.",
            "É melhor ser odiado pelo que você é do que ser amado pelo que você não é.",
            "Se o que você faz não condiz com o que você fala, você não tem nada a dizer.",
            "Ter a confiança de alguém é maior que ser amado. É o elogio mais sincero que existe.",
            "Não há nada que o governo possa te dar que não tenha tirado de você antes.",
            "Daqui alguns anos você estará mais arrependido pelas coisas que não fez do que pelas que fez.",
            "Seja impaciente com decisões e paciente com resultados.",
            "A preguiça anda tão devagar que o fracasso facilmente alcança.",
            "Se preocupe com o que os outros pensam, e você será eternamente prisioneiro deles.",
            "A melhor época para plantar uma semente, foi ontem. A segunda melhor é hoje.",
            "Quando você educa um homem, você educa um homem.\nQuando você educa uma mulher, você educa uma geração.",
            "Tudo que você diz deve ser verdade, mas nem toda verdade deve ser dita.",
            "O melhor professor que existe é a experiência.\nEle cobra caro, mas explica bem.",
            "Todos devem escolher uma das dores da vida: Dor da disciplina ou do arrependimento.",
            "A vida não é sobre as coisas que gostamos de fazer. É sobre as coisas que precisamos fazer.",
            "Tudo que você mais quer está atrás do medo.",
            "Melhor brecar cavalo disparado do que tocar mula manca.",
            "Muito risco, pouco ego."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrases(View view) {

        TextView texto = findViewById(R.id.textFrase);
        int fraseAleatoria = new Random().nextInt(29);
        String frase = frases[ fraseAleatoria ];

        texto.setText( frase );
    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textFrase);

        String textoFrase = "";
        for (String frase : frases) {
            textoFrase = textoFrase + frase + "\n" + "\n";
        }

        texto.setText(textoFrase);
    }
}
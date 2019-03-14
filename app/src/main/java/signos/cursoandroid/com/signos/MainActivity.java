package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView listaSignos;

    private String[] signos = { "Aries", "Touro" , "Cancer" , "Leão", "virgem", "Libra", "Escorpião",
            "sagitario", "Capricornio","Aquario","Peixes"

    };

    private String [] perfis = {
            "Arianos são animados, independentes , individualistas , dinamicos , corajosos e aventureiros",
            "Taurinos são positivos, pacientes , determinados , norturnos , leais e romanticos",
            "Geminianos são positivos, mutaveis, racionais e bastante voláteis",
            "...","...","...","...","...","...","...","...","..."



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_LONG).show();

            }
        });
    }
}

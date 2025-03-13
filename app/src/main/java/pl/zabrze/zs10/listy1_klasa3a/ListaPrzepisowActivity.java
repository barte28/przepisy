package pl.zabrze.zs10.listy1_klasa3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ListView listViewPrzepisy;
    private ArrayAdapter<Przepis> arrayAdapter;
    private ArrayList<Przepis> wybranePrzepisy;
    public  static final String PRZEPIS = "przepis";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent()
                .getExtras()
                .get(MainActivityListaKategorii.KATEGORIA)
                .toString();
        TextView textView = findViewById(R.id.textViewNazwaKAtegorii);
        textView.setText(kategoria);

        wybranePrzepisy = Repozytorium.wypiszPrzepisy(kategoria);
        arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                wybranePrzepisy
        );
        listViewPrzepisy = findViewById(R.id.listViewPrzepisy);
        listViewPrzepisy.setAdapter(arrayAdapter);

        listViewPrzepisy.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String nazwaPrzepisu = wybranePrzepisy.get(i).toString();
                        Intent intent = new Intent(ListaPrzepisowActivity.this,
                                PrzepisActivity.class);
                        intent.putExtra(PRZEPIS, nazwaPrzepisu);

                        startActivity(intent);
                    }
                }
        );

    }
}
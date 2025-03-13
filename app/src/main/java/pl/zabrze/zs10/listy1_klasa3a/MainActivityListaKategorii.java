package pl.zabrze.zs10.listy1_klasa3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivityListaKategorii extends AppCompatActivity {
    public static final String KATEGORIA = "kategoria";
    private ListView listViewKategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_kategorii);
        listViewKategorie = findViewById(R.id.listViewKategorie);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();

                        Intent intent = new Intent(MainActivityListaKategorii.this,
                                ListaPrzepisowActivity.class);
                        intent.putExtra(KATEGORIA,kategoria);
                        startActivity(intent);

                    }
                }
        );
    }
}
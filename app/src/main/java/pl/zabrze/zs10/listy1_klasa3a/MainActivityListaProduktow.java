package pl.zabrze.zs10.listy1_klasa3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityListaProduktow extends AppCompatActivity {
private ListView listViewProdukty;
private ArrayList<String> produkty;
private ArrayAdapter<String> arrayAdapter;
private Button button;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_produktow);
        produkty = new ArrayList<>();
        produkty.add("Marchewka");
        produkty.add("Buraki");
        produkty.add("Ziemniaki");
        produkty.add("Kapusta");
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextProdukt);
        arrayAdapter = new ArrayAdapter<>(
                MainActivityListaProduktow.this,
                android.R.layout.simple_list_item_1,
                produkty);
        //context - this,
        //widok = android.R.itd
        //lista z danymi
        //ArrayAdapter - most pomiędzy widokiem a danymi
        listViewProdukty = findViewById(R.id.listView2);
        listViewProdukty.setAdapter(arrayAdapter);
        //kliknięcie elementu listy
        listViewProdukty.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivityListaProduktow.this,
                                "kliknięto element "+produkty.get(i),
                                Toast.LENGTH_SHORT).show();
                        produkty.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String produkt = editText.getText().toString();
                        produkty.add(produkt);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );
    }
}
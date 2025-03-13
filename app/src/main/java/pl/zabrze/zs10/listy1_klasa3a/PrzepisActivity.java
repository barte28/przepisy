package pl.zabrze.zs10.listy1_klasa3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class PrzepisActivity extends AppCompatActivity {

    private TextView textViewNazwa;
    private TextView textViewOpis;
    private ImageView imageView;
    private RatingBar ratingBar;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        String nazwaPrzepisu = getIntent().getExtras().get(ListaPrzepisowActivity.PRZEPIS).toString();
        Toast.makeText(this, nazwaPrzepisu, Toast.LENGTH_SHORT).show();
        textViewNazwa = findViewById(R.id.textView2);
        textViewOpis = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView);
        ratingBar = findViewById(R.id.ratingBar);
        button = findViewById(R.id.button2);
        Przepis przepis = Repozytorium.zwrocPrzepis(nazwaPrzepisu);
        textViewNazwa.setText(przepis.getNazwaPrzepisu());
        textViewOpis.setText(przepis.getSkladniki());
        imageView.setImageResource(przepis.getIdObrazka());
        ratingBar.setRating(przepis.getPolubienia());
        ratingBar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        //TODO:
                    }
                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT,przepis.getNazwaPrzepisu()+" "+przepis.getSkladniki());
                        intent.setType("text/plain");
                        Intent podzielSieIntent = Intent.createChooser(intent,null);
                        startActivity(podzielSieIntent);
                    }
                }
        );
    }
}
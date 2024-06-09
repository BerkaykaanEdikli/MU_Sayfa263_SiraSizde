package com.example.mu_sayfa263_sirasizde;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mu_sayfa263_sirasizde.databinding.ActivityDetayBinding;

public class DetayActivity extends AppCompatActivity {

    private ActivityDetayBinding binding;
    public static Arkadas arkadas; // Singleton değişken

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textViewAd.setText("Ad: " + arkadas.ad);
        binding.textViewSoyad.setText("Soyad: " + arkadas.soyad);
        binding.textViewOkulNo.setText("Okul No: " + arkadas.okulNo);
        binding.textViewTelefon.setText("Telefon: " + arkadas.telefon);
    }
}

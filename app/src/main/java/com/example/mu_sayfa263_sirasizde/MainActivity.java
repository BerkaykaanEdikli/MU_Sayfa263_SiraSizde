package com.example.mu_sayfa263_sirasizde;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mu_sayfa263_sirasizde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Arkadas arkadas1 = new Arkadas("Ahmet", "Yılmaz", "234", "555 123 4567");
        Arkadas arkadas2 = new Arkadas("Ayşe", "Kaya", "755", "555 987 6543");
        Arkadas arkadas3 = new Arkadas("Mehmet", "Demir", "457", "555 567 8901");

        binding.buttonArkadas1.setOnClickListener(v -> {
            DetayActivity.arkadas = arkadas1; // Singleton ile veriyi aktar
            startActivity(new Intent(MainActivity.this, DetayActivity.class));
        });

        binding.buttonArkadas2.setOnClickListener(v -> {
            DetayActivity.arkadas = arkadas2;
            startActivity(new Intent(MainActivity.this, DetayActivity.class));
        });

        binding.buttonArkadas3.setOnClickListener(v -> {
            DetayActivity.arkadas = arkadas3;
            startActivity(new Intent(MainActivity.this, DetayActivity.class));
        });
    }
}
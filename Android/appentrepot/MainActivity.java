package com.example.appentrepot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    private Button button;

    BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
    bottomNavigationView.setSelectedItemId(R.id.bottom_home);
    bottomNavigationView.setOnItemSelectedListener(item -> {

        switch (item.getItemId()) {
            case R.id.bottom_home:
                return true;

            case R.id.bottom_livraison:
                startActivity(new Intent(getApplicationContext(), LivraisonActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            case R.id.bottom_exit:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
        }
        return false;
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPreparationActivity();
            }
        });
    }

    public void openPreparationActivity() {
        Intent intent = new Intent(this, PreparationActivity.class);
        startActivity(intent);
    }
}





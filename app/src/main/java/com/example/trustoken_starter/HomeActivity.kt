package com.example.trustoken_starter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find buttons
        val bankingButton = findViewById<Button>(R.id.button)
        val stocksButton = findViewById<Button>(R.id.button2)

        val trusToken = TrusToken()

        bankingButton.setOnClickListener {
            val fileDescriptor = trusToken.detectSmartCard()
            if (fileDescriptor != -1) {
                val intent = Intent(this, BankingActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Smart card not detected", Toast.LENGTH_SHORT).show()
            }
        }

        stocksButton.setOnClickListener {
            val fileDescriptor = trusToken.detectSmartCard()
            if (fileDescriptor != -1) {
                val intent = Intent(this, StocksActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Smart card not detected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
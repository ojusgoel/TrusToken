package com.example.trustoken_starter

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BankingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_banking)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find buttons by ID
        val btnCheckBalance = findViewById<Button>(R.id.btnCheckBalance)
        val btnFundTransfer = findViewById<Button>(R.id.btnFundTransfer)

        // Handle Check Balance Click
        btnCheckBalance.setOnClickListener {
            Toast.makeText(this, "Checking Balance...", Toast.LENGTH_SHORT).show()
            // Here first we check if PIN is valid or not
        }

        // Handle Fund Transfer Click
        btnFundTransfer.setOnClickListener {
            Toast.makeText(this, "Initiating Fund Transfer...", Toast.LENGTH_SHORT).show()
            // Here first we check if PIN is valid or not
        }
    }
}
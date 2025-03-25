package com.example.trustoken_starter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StocksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)

        val btnViewPortfolio = findViewById<Button>(R.id.btnViewPortfolio)
        val btnBuySellStocks = findViewById<Button>(R.id.btnBuySellStocks)

        btnViewPortfolio.setOnClickListener {
           // Here first we check if PIN is valid or not
            Toast.makeText(this, "Navigating to Portfolio...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PortfolioActivity::class.java)
            startActivity(intent)
        }

        btnBuySellStocks.setOnClickListener {
            // Here first we check if PIN is valid or not
            Toast.makeText(this, "Navigating to Buy/Sell Stocks...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, BuySellActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.trustoken_starter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BuySellActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buy_sell)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Initialize UI elements
        val buySellEditText = findViewById<EditText>(R.id.editTextText4)
        val dematBalanceEditText = findViewById<EditText>(R.id.editTextTextMultiLine2)
        val chargePerStockEditText = findViewById<EditText>(R.id.editTextTextMultiLine3)
        val confirmButton = findViewById<Button>(R.id.button3)

        // Set up button click listener
        confirmButton.setOnClickListener {
            // Here first we check if PIN is valid or not
            val buySellText = buySellEditText.text.toString()
            val dematBalance = dematBalanceEditText.text.toString()
            val chargePerStock = chargePerStockEditText.text.toString()

            Toast.makeText(this, "Action: $buySellText\n$dematBalance\n$chargePerStock", Toast.LENGTH_SHORT).show()
        }
    }
}

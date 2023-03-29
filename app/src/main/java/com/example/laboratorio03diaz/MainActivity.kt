package com.example.laboratorio03diaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var actionFiveCents : ImageView
    private lateinit var actionTenCents : ImageView
    private lateinit var actionQuarter : ImageView
    private lateinit var actionOneDollar : ImageView
    private lateinit var moneyDisplay : TextView
    private var money = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        updateMoney()
        addListener()
    }

    private fun bind () {
        actionFiveCents = findViewById(R.id.action_five_cents)
        actionTenCents = findViewById(R.id.action_ten_cents)
        actionQuarter = findViewById(R.id.action_quarter)
        actionOneDollar = findViewById(R.id.action_one_dollar)
        moneyDisplay = findViewById(R.id.money_display)
    }
    private fun addListener () {
        actionFiveCents.setOnClickListener{
            money += 0.05
            updateMoney()
        }
        actionTenCents.setOnClickListener{
            money += 0.10
            updateMoney()
        }
        actionQuarter.setOnClickListener{
            money += 0.25
            updateMoney()
        }
        actionOneDollar.setOnClickListener {
            money += 1
            updateMoney()
        }
    }

    private fun updateMoney () {
//        var moneys = String.format("%.2f", money).toDouble()
//        moneyDisplay.text = "HOla"
        moneyDisplay.text = "$${String.format("%.2f", money)}"
    }
}
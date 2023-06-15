package com.example.sampleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonReportGarbage = findViewById<Button>(R.id.btnReportGarbage)
        var buttonCheckData = findViewById<Button>(R.id.btnCheckData)

        buttonReportGarbage.setOnClickListener {
            Intent(this, ReportGarbageActivity::class.java).also{
                startActivity(it)
            }
        }

        buttonCheckData.setOnClickListener {


        }





    }
}
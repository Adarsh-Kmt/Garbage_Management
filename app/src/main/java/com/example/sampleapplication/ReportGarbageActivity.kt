package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text


class ReportGarbageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reportgarbage)

        val ReportButton = findViewById<Button>(R.id.btnReport)

        val rd = findViewById<RadioGroup>(R.id.rgRegions)

        ReportButton.setOnClickListener {

            val checkedRegion = rd.checkedRadioButtonId
            val checkedRadioButton = findViewById<RadioButton>(checkedRegion)
            val regionChosen = "garbage has been reported at " + checkedRadioButton.text
            Toast.makeText(applicationContext, regionChosen, Toast.LENGTH_LONG).show()
            finish()
        }







    }
}
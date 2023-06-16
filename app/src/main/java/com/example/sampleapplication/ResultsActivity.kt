package com.example.sampleapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import com.example.sampleapplication.DatabaseHelper



class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)


        val result_button = findViewById<Button>(R.id.btnResultPageResult)

        val result_text = findViewById<TextView>(R.id.tvresults)
        result_button.setOnClickListener{

            DatabaseHelper dbh = DatabaseHelper(this)

            List<Region> l = dbh.getallregions()


            result_text:text = l.toString();




        }


    }
}
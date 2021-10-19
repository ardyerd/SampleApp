package com.mws.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    private lateinit var txt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        txt = findViewById(R.id.textView2)

        if (intent.extras != null) {
            val bundle = intent.extras
            if (bundle != null) {
                txt.setText(bundle.getString("message"))
            } else {
                txt.setText("data tidak tersedia...")
            }
        }

    }
}
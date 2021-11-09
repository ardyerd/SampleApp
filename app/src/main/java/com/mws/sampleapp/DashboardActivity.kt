package com.mws.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {

    private lateinit var txt : TextView
    private lateinit var listView : ListView

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

        registerForContextMenu(txt)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.context_edit->{
                Toast.makeText(applicationContext, "Click On Edit", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.context_delete->{
                Toast.makeText(applicationContext, "Click On Delete", Toast.LENGTH_LONG).show()
                return true
            }
            else->super.onContextItemSelected(item)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.option_settings->{
//                Toast.makeText(applicationContext, "Click On Setting", Toast.LENGTH_LONG).show()
                val intentFragment = Intent(this, FragmentActivity::class.java)
                startActivity(intentFragment)
                return true
            }
            R.id.option_favorites->{
                Toast.makeText(applicationContext, "Click On Favorite", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.option_delete->{
                Toast.makeText(applicationContext, "Click On Delete", Toast.LENGTH_LONG).show()
                return true
            }
            else->super.onOptionsItemSelected(item)
        }

    }

}
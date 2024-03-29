package com.example.trabalhoagenda

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.lista

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val myToolbar = toolbar
        myToolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(myToolbar)

        val receitas = arrayOf("Espaguete a bolonhesa", "Bife a cavalo", "Pasta alho e oleo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, receitas)

        var listaReceitas = lista
        listaReceitas.setAdapter(adapter);

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@MainActivity, ReceitasActivity::class.java)
            startActivity(intent)
        }

    }


    // Oncreate é ciclo de vida da aplicação
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    // Recebe o id que está no menu.xml e realiza a ação
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.novo -> {
                val intent = Intent(this, ReceitasActivity::class.java)
                startActivity(intent)
                return false

            }

            else -> return super.onOptionsItemSelected(item)


        }
    }
}









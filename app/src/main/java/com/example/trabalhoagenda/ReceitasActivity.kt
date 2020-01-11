package com.example.trabalhoagenda

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_receitas.*
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.trabalhoagenda.R
import java.text.SimpleDateFormat
import java.util.*

class ReceitasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas)

        val myChildToolbar = toolbar_child
        setSupportActionBar(myChildToolbar)

        val ab = supportActionBar

        ab!!.setDisplayHomeAsUpEnabled(true)

        }
}


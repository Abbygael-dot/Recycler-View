package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.ItemAdapter
import com.example.recyclerview.data.DataSource
import com.example.recyclerview.model.Psalm23

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verse = DataSource().loadVerses()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        GridLayoutManager(
            this,3, RecyclerView.VERTICAL, false). apply { recyclerView.layoutManager = this }

        recyclerView.adapter = ItemAdapter(this, verse)
        recyclerView.setHasFixedSize(true)

    }
}
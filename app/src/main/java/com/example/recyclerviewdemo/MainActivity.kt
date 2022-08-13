package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruits = listOf<Fruit>(
        Fruit("Mango","hiie"),
        Fruit("Banana","hiie"),
        Fruit("Apple","hiie"),
        Fruit("Guava","hiie"),
        Fruit("Pairs","hiie")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruits) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }

    }

    private fun listItemClicked(fruit:Fruit){
        Toast.makeText(
            this,
            "Selected Fruit ${fruit.supplier}",
            Toast.LENGTH_SHORT
        ).show()
    }
}
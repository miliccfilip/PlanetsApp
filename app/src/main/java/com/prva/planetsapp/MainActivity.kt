package com.prva.planetsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)

        val planet1 = Planet("Mercury", "0 Moons", R.drawable.mercury)
        val planet2 = Planet("Jupiter", "79 Moons", R.drawable.jupiter)
        val planet3 = Planet("Mars", "2 Moons", R.drawable.mars)
        val planet4 = Planet("Neptune", "14 Moons", R.drawable.neptune)
        val planet5 = Planet("Uranus", "27 Moons", R.drawable.uranus)
        val planet6 = Planet("Saturn", "83 Moons", R.drawable.saturn)
        val planet7 = Planet("Pluto", "0 Moons", R.drawable.pluto)


        var planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)

        var myAdapter = MyCustomAdapter(this, planetList)

        listView.adapter = myAdapter


    }
}
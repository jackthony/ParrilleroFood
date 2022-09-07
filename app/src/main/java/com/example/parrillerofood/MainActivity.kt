package com.example.parrillerofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parrillerofood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Para el boton de navegación
        val bottomNavigationView = binding.bottomNavigationView
        bottomNavigationView.setSelectedItemId(R.id.mainActivity)

        bottomNavigationView.setOnItemSelectedListener {
            item ->
            when (item.itemId){
                R.id.mainActivity -> {
                }
                R.id.categoriastActivity -> {
                    val intent2 = Intent(this, CategoriaActivity::class.java)
                    startActivity(intent2)
                    overridePendingTransition(0,0)
                }
                R.id.foodActivity -> {
                    val intent2 = Intent(this, FoodActivity::class.java)
                    startActivity(intent2)
                    overridePendingTransition(0,0)
                }
                R.id.ubicacionActivity ->{
                    val intent3 = Intent(this,UbicacionActivity::class.java)
                    startActivity(intent3)
                    overridePendingTransition(0,0)
                }
            }
            true
        }


    }
}
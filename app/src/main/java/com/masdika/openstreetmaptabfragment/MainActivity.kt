package com.masdika.openstreetmaptabfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masdika.openstreetmaptabfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initiate Fragment
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, MapViewFragment())
            .commit()
    }
}
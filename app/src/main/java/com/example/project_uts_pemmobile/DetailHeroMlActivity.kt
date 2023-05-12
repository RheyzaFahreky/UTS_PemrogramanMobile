package com.example.project_uts_pemmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.project_uts_pemmobile.recycler.HomeFragment

@Suppress("DEPRECATION")
class DetailHeroMlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero_ml)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val heroml = intent.getParcelableExtra<HeroMl>(HomeFragment.INTENT_PARCELABLE)

        val imgHeroml = findViewById<ImageView>(R.id.img_photo)
        val namaHeroml = findViewById<TextView>(R.id.tv_name)
        val descHeroml = findViewById<TextView>(R.id.tv_description)

        imgHeroml.setImageResource(heroml?.imgHeroml!!)
        namaHeroml.text = heroml.namaHeroml
        descHeroml.text = heroml.descHeroml
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
package com.example.project_uts_pemmobile.recycler

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_uts_pemmobile.DetailHeroMlActivity
import com.example.project_uts_pemmobile.HeroMl
import com.example.project_uts_pemmobile.HeroMlAdapter
import com.example.project_uts_pemmobile.R

class HomeFragment : Fragment() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }

    private lateinit var adapter: HeroMlAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var heroArrayList: ArrayList<HeroMl>

    lateinit var imgHeroml: Array<Int>
    lateinit var namaHeroml: Array<String>
    lateinit var descHeroml: Array<String>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataIntialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_ml)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = HeroMlAdapter(heroArrayList)
        recyclerView.adapter = adapter
        

    }


    private fun dataIntialize() {
        heroArrayList = arrayListOf<HeroMl>()

        imgHeroml = arrayOf(
            R.drawable.alucard,
            R.drawable.balmon,
            R.drawable.betrix,
            R.drawable.brody,
            R.drawable.eudora,
            R.drawable.kufra,
            R.drawable.ling,
            R.drawable.nana,
            R.drawable.tigreal,
            R.drawable.yuzhong,
        )

        namaHeroml = arrayOf(
            "Alucard",
            "Balmond",
            "Beatrix",
            "Brody",
            "Eudora",
            "Khufra",
            "Ling",
            "Nana",
            "Tigreal",
            "Yu Zhong",
        )
        descHeroml = arrayOf(
            "Fighter/Assassin",
            "Fighter",
            "Marksman",
            "Marksman",
            "Mage",
            "Tank",
            "Assassin",
            "Mage",
            "Tank",
            "Fighter",
        )

        for (i in imgHeroml.indices){

            val heroMl = HeroMl(imgHeroml[i], namaHeroml[i], descHeroml[i])
            heroArrayList.add(heroMl)

        }

    }


}
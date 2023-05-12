package com.example.project_uts_pemmobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroMlAdapter(private val heromlList: ArrayList<HeroMl>)
    : RecyclerView.Adapter<HeroMlAdapter.HeroMlViewHolder>(){



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HeroMlAdapter.HeroMlViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.hero_ml,parent, false)
        return HeroMlViewHolder(itemView)
        itemView.setOnClickListener{
            listener(heromlList)
        }
    }

    private fun listener(heromlList: ArrayList<HeroMl>) {

    }

    override fun onBindViewHolder(holder: HeroMlAdapter.HeroMlViewHolder, position: Int) {
        val currentItem = heromlList[position]
        holder.imgHeroml.setImageResource(currentItem.imgHeroml)
        holder.namaHeroml.text = (currentItem.namaHeroml)
        holder.descHeroml.text = (currentItem.descHeroml)

    }


    override fun getItemCount(): Int {
        return heromlList.size
    }

    class HeroMlViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imgHeroml : ImageView = itemView.findViewById(R.id.img_item_photo)
        val namaHeroml : TextView = itemView.findViewById(R.id.tv_item_name)
        val descHeroml : TextView = itemView.findViewById(R.id.tv_item_description)

    }


}






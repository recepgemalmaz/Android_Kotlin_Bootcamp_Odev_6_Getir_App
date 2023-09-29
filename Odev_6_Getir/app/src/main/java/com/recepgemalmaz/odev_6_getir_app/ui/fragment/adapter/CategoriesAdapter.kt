package com.recepgemalmaz.odev_6_getir_app.ui.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.recepgemalmaz.odev_6_getir_app.data.entity.Categories
import com.recepgemalmaz.odev_6_getir_app.databinding.CategoriesCardDesignBinding

class CategoriesAdapter(var mContext: Context, var categoriesList: List<Categories>) : RecyclerView.Adapter<CategoriesAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CategoriesCardDesignBinding): RecyclerView.ViewHolder(tasarim.root){
        var cardViewCategori: CardView
        var imageViewCategoriImage: ImageView
        var textViewCategoriName: TextView

        init {
            cardViewCategori = tasarim.cardViewCategori
            imageViewCategoriImage = tasarim.imageViewCategoriImage
            textViewCategoriName = tasarim.textViewCategoriName

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CategoriesCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val categori = categoriesList.get(position)
        holder.imageViewCategoriImage.setImageResource(
            mContext.resources.getIdentifier(categori.categoriImage,"drawable",mContext.packageName))
        holder.textViewCategoriName.text = categori.categoriName
    }

    override fun getItemCount(): Int {
        return  categoriesList.size
    }
}
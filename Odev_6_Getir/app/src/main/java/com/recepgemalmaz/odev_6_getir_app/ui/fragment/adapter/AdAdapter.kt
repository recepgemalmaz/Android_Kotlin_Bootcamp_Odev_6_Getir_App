package com.recepgemalmaz.odev_6_getir_app.ui.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.recepgemalmaz.odev_6_getir_app.data.entity.Ad
import com.recepgemalmaz.odev_6_getir_app.databinding.AdCardDesignBinding

class AdAdapter(var mContext: Context, var adList: List<Ad>):RecyclerView.Adapter<AdAdapter.AdTarimTutucu>() {
    inner class AdTarimTutucu(var tasarim: AdCardDesignBinding) : RecyclerView.ViewHolder(tasarim.root) {

        var cardViewAd : CardView
        var imageViewAdImage : ImageView

        init {
            cardViewAd = tasarim.cardViewCategori
            imageViewAdImage = tasarim.imageViewCategoriImage
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdTarimTutucu {
        val tasarim = AdCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return AdTarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return adList.size

    }

    override fun onBindViewHolder(holder: AdTarimTutucu, position: Int) {
        val ad = adList.get(position)
        holder.imageViewAdImage.setImageResource(
            mContext.resources.getIdentifier(ad.categoriImage,"drawable",mContext.packageName))
    }

}

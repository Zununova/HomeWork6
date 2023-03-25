package com.example.homework6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CatAdapter(
    private val list : MutableList<CatItems>,
    private val onShortClick: OnShortClick
) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {




    inner class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var image : ImageView? = null
        private var name : TextView? = null
        private  var detail : TextView? = null

        init {
            image =itemView.findViewById(R.id.iv_cat)
            name = itemView. findViewById(R.id.tv_text)

        }
        fun onBind(catItems: CatItems) {
            image?.let { Glide.with(it).load(catItems.catImage).into(image!!)}
            name?.text = catItems.textName

            itemView.setOnClickListener {
                onShortClick.onItemShortClick(catItems)
            }

            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.one_item, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(list[position])

    }
}
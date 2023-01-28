package com.example.dz_2_5.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.dz_2_5.data.models.DotaModel
import com.example.dz_2_5.databinding.ItemDotaBinding

class DotaAdapter: ListAdapter<DotaModel ,DotaAdapter.DotaViewHolder>(diffUtil) {

    inner class DotaViewHolder(private val binding: ItemDotaBinding):ViewHolder(binding.root) {

        fun onBind(item: DotaModel) {
            Glide.with(binding.imageIcon.context)
                .load(item.icon)
                .into(binding.imageIcon)
            binding.namePerson.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DotaViewHolder {
        val binding = ItemDotaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DotaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DotaViewHolder, position: Int) {
       getItem(position)?.let {
           holder.onBind(it)
       }
    }
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<DotaModel>() {
            override fun areItemsTheSame(oldItem: DotaModel, newItem: DotaModel): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: DotaModel, newItem: DotaModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}
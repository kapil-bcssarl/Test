package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.CustomAdapterBinding

class CustomAdapter: RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = CustomAdapterBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.custom_adapter, parent, false))
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 22
}

class CustomViewHolder(itemView: CustomAdapterBinding) : RecyclerView.ViewHolder(itemView.root) {

}
package ru.ifmo.mobdev.lab2_orekhovskiy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidAdapter (context: Context,
                      private val android: List<Android>,
                      private val onAndroidListener: OnAndroidListener) : RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_android, parent , false), onAndroidListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = android.size

    private fun getItem(position: Int): Android = android[position]

    inner class ViewHolder(itemView: View, onAndroidListener: OnAndroidListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val title: TextView = itemView.findViewById(R.id.title)
        private val onAndroidListener = onAndroidListener

        fun bind(version: Android) {
            image.setImageResource(version.imageAndroid)
            title.text = version.title
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            onAndroidListener.onAndroidClick(adapterPosition)
        }
    }

    interface OnAndroidListener {
        fun onAndroidClick(position: Int)
    }
}
package ru.ifmo.mobdev.portfolioorekhovskiy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ElementAdapter (context: Context,
                      private val elements: List<Element>) : RecyclerView.Adapter<ElementAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.element, parent , false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = elements.size

    private fun getItem(position: Int): Element = elements[position]

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val description: TextView = itemView.findViewById(R.id.description)

        fun bind(element: Element) {
            image.setImageResource(element.image)
            description.text = element.description
        }
    }
}
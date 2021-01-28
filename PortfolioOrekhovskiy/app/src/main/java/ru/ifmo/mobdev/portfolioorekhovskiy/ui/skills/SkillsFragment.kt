package ru.ifmo.mobdev.portfolioorekhovskiy.ui.skills

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.ifmo.mobdev.portfolioorekhovskiy.Data
import ru.ifmo.mobdev.portfolioorekhovskiy.ElementAdapter
import ru.ifmo.mobdev.portfolioorekhovskiy.R

class SkillsFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_skills, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        val elements = Data.getElements()

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = context?.let { ElementAdapter(it, elements) }

        return view
    }
}
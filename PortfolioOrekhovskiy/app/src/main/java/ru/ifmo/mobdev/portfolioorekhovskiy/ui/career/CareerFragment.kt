package ru.ifmo.mobdev.portfolioorekhovskiy.ui.career

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.ifmo.mobdev.portfolioorekhovskiy.R

class CareerFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_career, container, false)
    }
}
package ru.ifmo.mobdev.portfolioorekhovskiy.ui.contacts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.ifmo.mobdev.portfolioorekhovskiy.R


class ContactsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_contacts, container, false)
        val buttonVK = view.findViewById<Button>(R.id.vk_btn)
        buttonVK.setOnClickListener {
            val url = "https://vk.com/sempaw"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        val buttonEmail = view.findViewById<Button>(R.id.email_btn)
        buttonEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "plain/text"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("anton.o.0619@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Привет из портфолио!")
            intent.putExtra(Intent.EXTRA_TEXT, "Пишу тебе из твоего классного портфолио!")
            startActivity(Intent.createChooser(intent, ""))
        }
        return view
    }
}
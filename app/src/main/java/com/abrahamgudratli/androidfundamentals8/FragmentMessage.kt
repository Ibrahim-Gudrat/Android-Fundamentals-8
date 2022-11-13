package com.abrahamgudratli.androidfundamentals8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_message.*

class FragmentMessage : Fragment(R.layout.fragment_message) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var chats = mutableListOf<ItemMessage>(
            ItemMessage(R.drawable.pic2, "Nadejda", "Can you help me to solve this equation?"),
            ItemMessage(R.drawable.pic3, "Murad", "Matrix 1 was a masterpiece"),
            ItemMessage(R.drawable.pic5, "Omar Najafov", "Can you send me solution of this task please?"),
            ItemMessage(R.drawable.pic6, "Farrukh", "Let's meet in CoffieMoffie at 8 pm."),
            ItemMessage(R.drawable.pic7, "Elvin Zeynalli", "Eminem released new album. Listen please"),
            ItemMessage(R.drawable.pic8, "Emil Khairov", "Can you please present. I am not good at it."),
            ItemMessage(R.drawable.pic9, "Sheldon", "I am bloody genius"),
            ItemMessage(R.drawable.pic10, "Angelina", "Brad Pitt does not answer my call."),
        )

        val adapterMessages = AdapterMessages(chats)
        rvMessage.adapter = adapterMessages
        rvMessage.layoutManager = LinearLayoutManager(activity)

    }



}
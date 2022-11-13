package com.abrahamgudratli.androidfundamentals8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_message.view.*

class AdapterMessages(var messageList: List<ItemMessage>) : RecyclerView.Adapter<AdapterMessages.ViewHolderMessage>() {
    inner class ViewHolderMessage(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMessage {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return ViewHolderMessage(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMessage, position: Int) {
        holder.itemView.apply {
            tvChatName.text = messageList[position].name
            tvChatText.text = messageList[position].text
            ivChatProfilePic.setImageResource(messageList[position].profilePic)
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

}
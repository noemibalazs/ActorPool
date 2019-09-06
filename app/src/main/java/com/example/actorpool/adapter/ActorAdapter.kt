package com.example.actorpool.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.actorpool.R
import com.example.actorpool.data.Actor
import com.example.actorpool.utils.loadPicture
import com.example.actorpool.utils.setOnDebounceClickListener

class ActorAdapter ( val actorListener: (Actor) -> Unit,
                     val diffUtil: DiffUtil.ItemCallback<Actor> = object : DiffUtil.ItemCallback<Actor>(){
                         override fun areItemsTheSame(oldItem: Actor, newItem: Actor): Boolean {
                             return oldItem.id == newItem.id
                         }

                         override fun areContentsTheSame(oldItem: Actor, newItem: Actor): Boolean {
                             return oldItem.id == newItem.id && newItem.name == oldItem.name && oldItem.avatar == newItem.avatar
                         }

                     }) : ListAdapter<Actor, ActorAdapter.ActorVH>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorVH {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_actor, parent, false)
        return ActorVH(view)
    }

    override fun onBindViewHolder(holder: ActorVH, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnDebounceClickListener {
            actorListener(getItem(position))
        }
    }

    inner class ActorVH(view: View): RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.name)
        val avatar = view.findViewById<ImageView>(R.id.avatar)

        fun bind(actor: Actor){
            name.text = actor.name
            avatar.context.loadPicture(actor.avatar, avatar)
        }
    }
}
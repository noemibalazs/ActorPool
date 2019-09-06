package com.example.actorpool.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.actorpool.R
import com.example.actorpool.data.Actor
import com.example.actorpool.data.TagActor
import com.example.actorpool.utils.setOnDebounceClickListener

class TagAdapter(

    val actorListener: (Actor) ->Unit,
    val tagLister: (TagActor) -> Unit,
    val diffUtil: DiffUtil.ItemCallback<TagActor> = object : DiffUtil.ItemCallback<TagActor>(){
        override fun areItemsTheSame(oldItem: TagActor, newItem: TagActor): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TagActor, newItem: TagActor): Boolean {
            return oldItem.id == newItem.id && oldItem.name == newItem.name && oldItem.actors == newItem.actors
        }
    }
) : ListAdapter<TagActor, TagAdapter.TagVH>(diffUtil) {

    val viewPool = RecyclerView.RecycledViewPool()
    private lateinit var actorAdapter: ActorAdapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tag, parent, false)
        return TagVH(view)
    }

    override fun onBindViewHolder(holder: TagVH, position: Int) {
        val tag: TagActor = getItem(position)
        holder.tagName.text = tag.name
        holder.tagShow.setOnDebounceClickListener {
            tagLister(tag)
        }

        setHolders(holder, tag)
    }

    private fun setHolders(holder: TagVH, tag:TagActor){
        val manager = LinearLayoutManager(holder.tagRecycler.context, RecyclerView.HORIZONTAL, false)
        manager.initialPrefetchItemCount = 4
        holder.tagRecycler.apply {
            layoutManager = manager
            actorAdapter = ActorAdapter(actorListener)
            actorAdapter.submitList(tag.actors)
            adapter = actorAdapter
            setRecycledViewPool(viewPool)
        }
    }

    inner class TagVH(view: View): RecyclerView.ViewHolder(view){
        val tagName = view.findViewById<TextView>(R.id.tagName)
        val tagShow = view.findViewById<TextView>(R.id.tagShow)
        val tagRecycler = view.findViewById<RecyclerView>(R.id.tagRecycler)
    }
}
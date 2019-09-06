package com.example.actorpool.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.actorpool.R
import com.example.actorpool.adapter.ActorAdapter
import com.example.actorpool.data.Actor
import com.example.actorpool.data.TagActor
import com.example.actorpool.utils.ACTOR
import com.example.actorpool.utils.TAG
import com.example.actorpool.utils.argument
import kotlinx.android.synthetic.main.fragment_tag.*

class TagFragment : Fragment() {

    private val tag: TagActor by argument(TAG)
    private lateinit var adapter: ActorAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateUI()

    }

    private fun onActorClicked(actor: Actor){
        findNavController().navigate(R.id.action_tagFragment_to_actorFragment,
            bundleOf(ACTOR to actor))
    }

    private fun populateUI(){
        tagName.text = tag.name
        adapter = ActorAdapter(this::onActorClicked)
        adapter.submitList(tag.actors)
        tagActorRecycler.adapter = adapter
    }

}
package com.example.actorpool.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.actorpool.R
import com.example.actorpool.data.Actor
import com.example.actorpool.utils.ACTOR
import com.example.actorpool.utils.argument
import com.example.actorpool.utils.loadPicture
import kotlinx.android.synthetic.main.fragment_actor.*

class ActorFragment : Fragment() {

    private val actor: Actor by argument(ACTOR)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_actor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateUI()
    }

    private fun populateUI(){
        context?.loadPicture(actor.avatar, actorAvatar)
        actorName.text = actor.name
        actorDescription.text = actor.description
    }
}
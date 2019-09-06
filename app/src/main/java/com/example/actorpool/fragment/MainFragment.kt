package com.example.actorpool.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.actorpool.R
import com.example.actorpool.adapter.TagAdapter
import com.example.actorpool.data.Actor
import com.example.actorpool.data.TagActor
import com.example.actorpool.repo.Repository
import com.example.actorpool.utils.ACTOR
import com.example.actorpool.utils.TAG
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private lateinit var adapter: TagAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateUI()

    }

    private fun populateUI() {
        adapter = TagAdapter(this::onActorClicked, this::onTagClicked)
        adapter.submitList(Repository().tags)
        mainRecycler.adapter = adapter

    }

    private fun onActorClicked(actor: Actor) {
        findNavController().navigate(
            R.id.action_mainFragment_to_actorFragment,
            bundleOf(ACTOR to actor)
        )
    }

    private fun onTagClicked(tagActor: TagActor) {
        findNavController().navigate(
            R.id.action_mainFragment_to_tagFragment,
            bundleOf(TAG to tagActor)
        )
    }

}
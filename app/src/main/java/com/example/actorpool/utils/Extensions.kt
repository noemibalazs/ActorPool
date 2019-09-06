package com.example.actorpool.utils

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.actorpool.R

fun View.setOnDebounceClickListener( viewClicked: (View) -> Unit){
    this.setOnClickListener(object : DebounceClickListener(){
        override fun onDebounce(v: View) {
            viewClicked(v)
        }

    })
}

fun Context.loadPicture(link: String, view: ImageView){
    Glide.with(this)
        .load(link)
        .error(R.drawable.sharon)
        .placeholder(R.drawable.sharon)
        .into(view)
}

fun <T:Any>Fragment.argument(key: String) = lazy {
    arguments?.get(key) as T
}
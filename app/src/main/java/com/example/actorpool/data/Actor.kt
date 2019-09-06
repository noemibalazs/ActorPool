package com.example.actorpool.data

import android.os.Parcel
import android.os.Parcelable

data class Actor(
    val id: Int,
    val name: String,
    val avatar: String,
    val description: String
) : Parcelable {
    constructor(source: Parcel) : this(
        source.readInt(),
        source.readString(),
        source.readString(),
        source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(id)
        writeString(name)
        writeString(avatar)
        writeString(description)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Actor> = object : Parcelable.Creator<Actor> {
            override fun createFromParcel(source: Parcel): Actor = Actor(source)
            override fun newArray(size: Int): Array<Actor?> = arrayOfNulls(size)
        }
    }
}
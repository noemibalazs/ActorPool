package com.example.actorpool.data

import android.os.Parcel
import android.os.Parcelable

data class TagActor(
    val id: Int,
    val name: String,
    val actors: List<Actor>
) : Parcelable {
    constructor(source: Parcel) : this(
        source.readInt(),
        source.readString(),
        source.createTypedArrayList(Actor.CREATOR)
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(id)
        writeString(name)
        writeTypedList(actors)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<TagActor> = object : Parcelable.Creator<TagActor> {
            override fun createFromParcel(source: Parcel): TagActor = TagActor(source)
            override fun newArray(size: Int): Array<TagActor?> = arrayOfNulls(size)
        }
    }
}
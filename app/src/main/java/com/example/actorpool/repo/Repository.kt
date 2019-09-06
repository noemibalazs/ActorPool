package com.example.actorpool.repo

import android.nfc.Tag
import com.example.actorpool.data.Actor
import com.example.actorpool.data.TagActor
import kotlin.math.sin

class Repository {

    val comedians = listOf<Actor>(
        Actor(0, "Eddie Murphy",
            "https://upload.wikimedia.org/wikipedia/commons/c/c5/Eddie_Murphy_Tribeca_Shankbone_2010_NYC_%282%29.jpg", "Actor * Comedian * Satire"),
        Actor(1, "Ben Affleck",
            "https://upload.wikimedia.org/wikipedia/commons/8/8b/Ben_Affleck_%26_Ezra_Miller_%2836072079871%29_%28cropped02%29.jpg", "Actor * Comedian * Satire"),
        Actor(2, "Richard Pryor",
            "https://upload.wikimedia.org/wikipedia/commons/b/bb/Richard_Pryor_%281986%29_%28cropped%29.jpg", "Improvisation * Comedian * Satire"),
        Actor(3, "Chris Tucker",
            "https://upload.wikimedia.org/wikipedia/commons/9/98/Chris_Tucker_TIFF_2%2C_2012.jpg", "Blue * Comedian * Insult"),
        Actor(4, "Chris Rock",
            "https://upload.wikimedia.org/wikipedia/commons/6/68/Chris_Rock_2012.jpg", "Blue * Sketch * Surreal"),
        Actor(5, "Jack Lemmon",
            "https://upload.wikimedia.org/wikipedia/commons/d/d0/The_apartment_trailer_1.JPG", "Blue * Improvisation * Surreal"),
        Actor(6, "Walter Matthau",
            "https://upload.wikimedia.org/wikipedia/commons/1/1a/Walter_Matthau_in_Charade_2.jpg", "Comedian * Improvisation * Surreal"),
        Actor(7, "Bette Midler",
            "https://upload.wikimedia.org/wikipedia/commons/d/dd/Bette_Midler_%281990%29.jpg", "Comedian * Improvisation * Drama")

    )

    val drama = listOf<Actor>(
        Actor(8, "Tyne Daly",
            "https://upload.wikimedia.org/wikipedia/commons/5/57/Tyne_Daly_at_the_2009_Tribeca_Film_Festival.jpg", "Actress * Comedian * Drama"),
        Actor(9, "Sarah Oh",
            "https://upload.wikimedia.org/wikipedia/commons/2/26/Sandra_Oh_WGA.JPG", "Actress"),
        Actor(10, "Glenn Close",
            "https://upload.wikimedia.org/wikipedia/commons/7/7e/GlennClose.jpg", "Producer * Actress * Singer"),
        Actor(11, "Anjelica Huston",
            "https://upload.wikimedia.org/wikipedia/commons/6/63/Anjelica_Huston_March_21%2C_2014_%28cropped%29.jpg", "Drama * Comedian * Surreal"),
        Actor(12, "Julia Roberts",
            "https://upload.wikimedia.org/wikipedia/commons/b/b0/Julia_Roberts_in_May_2002.jpg", "Actress * Drama * Surreal"),
        Actor(13, "Meryl Streep",
            "https://upload.wikimedia.org/wikipedia/commons/a/a3/Meryl_Streep_by_Jack_Mitchell.jpg", "Drama * Comedian * Surreal"),
        Actor(14, "Emma Thompson",
            "https://upload.wikimedia.org/wikipedia/commons/3/3e/Emma_Thompson.png", "Comedian * Actress * Author")

    )

    val action = listOf<Actor>(
        Actor(15, "Sharon Stone",
            "https://upload.wikimedia.org/wikipedia/commons/3/36/Sharon_Stone_KV.jpg", "Actress * Author * Drama"),
        Actor(16, "Angelina Jolie",
            "https://upload.wikimedia.org/wikipedia/commons/9/90/Angelina_Jolie.jpg", "Actress * Drama"),
        Actor(17, "Melanie Griffith",
            "https://upload.wikimedia.org/wikipedia/commons/c/c5/Melanie_Griffith_at_the_APLA_benefit.jpg", "Producer * Actress * Drama"),
        Actor(18, "Robert Redford",
            "https://upload.wikimedia.org/wikipedia/commons/5/54/Robert_Redford_Patricia_Blair_The_Virginian_1964.jpg", "Drama * Producer * Actor"),
        Actor(19, "Sean Connery",
            "https://upload.wikimedia.org/wikipedia/commons/5/5b/Sean_Connery_1999.jpg", "Actor * Drama * Producer"),
        Actor(20, "Harrison Ford",
            "https://upload.wikimedia.org/wikipedia/commons/2/28/Harrison_Ford_at_the_2009_Deauville_American_Film_Festival%2C_cropped.jpg", "Drama * Actor * Producer"),
        Actor(21, "Gwyneth Paltrow",
            "https://upload.wikimedia.org/wikipedia/commons/4/44/GwynethPaltrowTIFF00.jpg", "Singer * Actress * Drama")

    )

    val singer = listOf<Actor>(
        Actor(22, "Cher",
            "https://upload.wikimedia.org/wikipedia/commons/d/dd/Cher_-_Casablanca.jpg", "Actress * Singer * Drama"),
        Actor(23, "Sarah Ramirez",
            "https://upload.wikimedia.org/wikipedia/commons/3/35/Sara_Ramirez6.jpg", "Actress * Singer"),
        Actor(24, "Frank Sinatra",
            "https://upload.wikimedia.org/wikipedia/commons/2/20/Frank_Sinatra_laughing.jpg", "Singer * Actor * Drama"),
        Actor(25, "Elvis Presley",
            "https://upload.wikimedia.org/wikipedia/commons/9/99/Elvis_Presley_promoting_Jailhouse_Rock.jpg", "Drama * Singer * Actor"),
        Actor(26, "Whitney Houston",
            "https://upload.wikimedia.org/wikipedia/commons/8/81/Whitney_Houston_Welcome_Heroes_7.JPEG", "Actress * Drama * Singer"),
        Actor(27, "Scarlett Johansson",
            "https://upload.wikimedia.org/wikipedia/commons/6/60/Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%29.jpg", "Drama * Actress * Singer"),
        Actor(28, "Jessica Alba",
            "https://upload.wikimedia.org/wikipedia/commons/a/af/Jessica_Alba_Revlon_Run_Walk.jpg", "Singer * Actress")

    )

    val tags = mutableListOf(
        TagActor(0, "Comedy", comedians),
        TagActor(1, "Drama", drama),
        TagActor(2, "Action", action),
        TagActor(3, "Singer", singer)
    )

}
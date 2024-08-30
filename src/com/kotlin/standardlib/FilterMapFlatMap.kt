package com.kotlin.standardlib

import java.util.Collections

data class Album(val title: String, val year: Int, val chartuk: Int, val chartus: Int, val tracks: List<Track> = listOf())
data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
Album ("The Dark Side of the Moon", 1973, 2, 1,
listOf(Track("Speak to Me", 90),
Track("Breathe", 163),
Track("On he Run", 216),
Track("Time", 421),
Track("The Great Gig in the Sky", 276),
Track("Money", 382),
Track("Us and Then", 462),
Track("Any Color You Like", 205),
Track("Brain Damage", 228),
    Track("Eclipse", 123)
)),
    Album("The Wall", 1979, 3, 1),
    Album ("Wish You Were Here", 1975, 1, 1),
    Album ("Animals", 1977, 2, 3),
    Album ("The Piper at the Gates of Dawn", 1967, 6, 131),
    Album("The Final Cut", 1983, 1, 6),
    Album ("Meddle", 1971, 3, 70),
    Album ("Aton Heart Mother", 1970, 1, 55),
    Album ("gun", 1969, 5, 76),
    Album ("A Sauceful of Secrets", 1968, 9, 0),
    Album ("More", 1949, 9, 153))

fun albumAndTrackLowerThanSecs(trackSecs: Int, albums: List<Album>): List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < trackSecs
        }.map { Pair(albumTitle, it.title)
        }
    }
}
fun main(args: Array<String>) {
    val albumTitle = albums.filter { it.chartuk == 1 }
        .map { it.title}

    println(albumTitle)
    albumAndTrackLowerThanSecs(200, albums).forEach {
        println("${it.first} - ${it.second}")
    }

}

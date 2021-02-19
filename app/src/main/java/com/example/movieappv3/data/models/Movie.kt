package com.example.movieappv3.data.models

/**
 * @author Rofaeil Ashaiaa
 * Created on 2/19/21.
 */
data class Movie(
    var id: String,
    var title: String,
    var posterPath: String,
    var backdropPath: String,
    var releaseDate: String,
    var rating: String
) {
    constructor() : this("", "", "", "", "", "")
}
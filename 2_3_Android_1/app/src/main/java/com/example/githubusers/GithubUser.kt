package com.example.githubusers

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GithubUser(
    var name: String,
    var username: String,
    var photo: Int,
    var follower: Int,
    var following: Int,
    var company: String,
    var location: String,
    var repository: String
) : Parcelable
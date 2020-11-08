package com.selen.githubclient.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author Pyaterko Aleksey
 */
@Parcelize
data class GithubUser(
    val login: String
) : Parcelable

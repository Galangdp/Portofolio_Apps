package com.example.portofolioapps

import android.media.Image
import android.os.Parcelable
import android.webkit.RenderProcessGoneDetail
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portofolio(
    val id: Int = 0,
    var title: String = "",
    var detail: String = "",
    var image: Int = 0,
    var link: String = ""
) :Parcelable

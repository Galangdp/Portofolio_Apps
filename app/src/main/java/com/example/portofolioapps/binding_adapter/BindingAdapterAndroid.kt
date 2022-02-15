package com.example.portofolioapps.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.example.portofolioapps.Portofolio

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Portofolio){
    data?.let {
        text = it.title
    }
}

@BindingAdapter ("androidImage")
fun ImageView.setAndroidImage(data: Portofolio){
    load(data.image){
        crossfade(1000)
    }
}

@BindingAdapter("experienceTitle")
fun TextView.setExperienceTitle(data: Portofolio?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?){
    data?.let {
        text = data.detail
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setExperienceImage(data: Portofolio){
    load(data.image){
        crossfade(1000)
    }
}
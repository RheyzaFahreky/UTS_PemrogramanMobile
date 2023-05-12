package com.example.project_uts_pemmobile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeroMl(
    val imgHeroml: Int,
    val namaHeroml: String,
    val descHeroml: String
) : Parcelable

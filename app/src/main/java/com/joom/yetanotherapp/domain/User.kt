package com.joom.yetanotherapp.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
  val name: String
) : Parcelable

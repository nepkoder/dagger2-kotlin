package com.ims.daggermvvmrxjavatest.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "MovieEntity")
data class MovieEntity(

    @SerializedName("id")
    @PrimaryKey
    val id : Long,

    val name: String,

    val status: String?

)
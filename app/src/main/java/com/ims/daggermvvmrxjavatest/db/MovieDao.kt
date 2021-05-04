package com.ims.daggermvvmrxjavatest.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies : List<MovieEntity>) : LongArray

    @Query("select * from MovieEntity")
    fun getMovies() : List<MovieEntity>
}
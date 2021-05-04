package com.ims.daggermvvmrxjavatest.di

import android.app.Application
import androidx.room.Room
import com.ims.daggermvvmrxjavatest.db.AppDatabase
import com.ims.daggermvvmrxjavatest.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    val dbName = "dbname.db";

    /*
    * This is method return database object
    * */
    @Singleton
    @Provides
    internal fun provideDatabase(application: Application) : AppDatabase {
        return Room.databaseBuilder(application,AppDatabase::class.java,dbName)
            .allowMainThreadQueries().build()
    }

    @Provides
    @Singleton
    internal fun provideMovieDao(appDatabase: AppDatabase) : MovieDao {
        return appDatabase.movieDao()
    }
}
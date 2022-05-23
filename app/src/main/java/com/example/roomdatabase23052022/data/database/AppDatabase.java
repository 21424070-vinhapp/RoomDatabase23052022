package com.example.roomdatabase23052022.data.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomdatabase23052022.data.model.entities.WorkEntity;

@Database(entities = WorkEntity.class,version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract WordDao wordDao();

    //su dung design pattern Singleton
    private static AppDatabase instance=null;

    public static AppDatabase getInstance(Context context)
    {
     if(instance==null)
     {
         instance= Room.databaseBuilder(
                 context,
                 AppDatabase.class,
                 "appDb"
         )
                 .fallbackToDestructiveMigration()
                 .build();
     }
     return instance;
    }
}

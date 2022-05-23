package com.example.roomdatabase23052022.data.database;

import androidx.room.Query;

import com.example.roomdatabase23052022.data.model.entities.WorkEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public interface WordDao {
    @Query("select * from work")
    Observable<List<WorkEntity>> getWordList();
}

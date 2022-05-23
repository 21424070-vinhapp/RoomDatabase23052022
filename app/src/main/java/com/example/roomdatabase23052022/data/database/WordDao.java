package com.example.roomdatabase23052022.data.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomdatabase23052022.data.model.entities.WorkEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;


@Dao
public interface WordDao {
    @Query("select * from work")
    Observable<List<WorkEntity>> getWordList();

    @Insert
    Maybe<Long> insertWork(WorkEntity workEntity);
}

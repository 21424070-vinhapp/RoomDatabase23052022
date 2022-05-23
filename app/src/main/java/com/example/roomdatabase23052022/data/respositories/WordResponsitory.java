package com.example.roomdatabase23052022.data.respositories;

import android.content.Context;

import com.example.roomdatabase23052022.data.database.AppDatabase;
import com.example.roomdatabase23052022.data.database.WordDao;
import com.example.roomdatabase23052022.data.model.entities.WorkEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class WordResponsitory {
    private WordDao wordDao;

    public WordResponsitory(Context context) {
        wordDao = AppDatabase.getInstance(context).wordDao();
    }

    public Observable<List<WorkEntity>> getListWorks(){
        return wordDao.getWordList();
    }

    public Maybe<Long> insertWork(WorkEntity workEntity){
        return wordDao.insertWork(workEntity);
    }
}

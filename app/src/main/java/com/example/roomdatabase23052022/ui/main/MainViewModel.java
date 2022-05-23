package com.example.roomdatabase23052022.ui.main;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.roomdatabase23052022.data.database.AppDatabase;
import com.example.roomdatabase23052022.data.model.entities.WorkEntity;
import com.example.roomdatabase23052022.data.respositories.WordResponsitory;

import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<WorkEntity>> lisWork=new MutableLiveData<>();
    private WordResponsitory wordResponsitory;
    private Context context;

    public MainViewModel(Context context)
    {
        this.context=context;
        wordResponsitory=new WordResponsitory(context);
    }

    public LiveData<List<WorkEntity>> getList()
    {
        return lisWork;
    }

    public void queryListWork()
    {
        wordResponsitory.getListWorks();
    }
}

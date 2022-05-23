package com.example.roomdatabase23052022.ui.main;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.roomdatabase23052022.data.database.AppDatabase;
import com.example.roomdatabase23052022.data.model.entities.WorkEntity;
import com.example.roomdatabase23052022.data.respositories.WordResponsitory;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.MaybeConverter;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<WorkEntity>> lisWork = new MutableLiveData<>();
    private MutableLiveData<Long> idInsert = new MutableLiveData<>();
    private WordResponsitory wordResponsitory;
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
        wordResponsitory = new WordResponsitory(context);
    }

    public LiveData<List<WorkEntity>> getList() {
        return lisWork;
    }

    public LiveData<Long> getIdInsert() {
        return idInsert;
    }

    public void queryListWork() {
        wordResponsitory.getListWorks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<WorkEntity>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<WorkEntity> workEntities) {
                        lisWork.setValue(workEntities);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void insertWork(WorkEntity workEntity) {
        wordResponsitory
                .insertWork(workEntity)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<Long>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull Long aLong) {
                        idInsert.setValue(aLong);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

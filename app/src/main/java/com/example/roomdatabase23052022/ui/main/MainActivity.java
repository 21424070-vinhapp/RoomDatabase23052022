package com.example.roomdatabase23052022.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.roomdatabase23052022.R;
import com.example.roomdatabase23052022.data.model.entities.WorkEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mMainViewModel = new ViewModelProvider(this, new ViewModelProvider.Factory() {
//            @NonNull
//            @Override
//            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
//                return (T) new MainViewModel(MainActivity.this);
//            }
//        }).get(MainViewModel.class);
//
//        mMainViewModel.getList().observe(this, new Observer<List<WorkEntity>>() {
//            @Override
//            public void onChanged(List<WorkEntity> workEntities) {
//                Log.d("bbb", "Total "+workEntities.size()+"");
//            }
//        });
//
//        mMainViewModel.getIdInsert().observe(this, new Observer<Long>() {
//            @Override
//            public void onChanged(Long aLong) {
//                Log.d("bbb", "Row "+aLong+"");
//            }
//        });
//
//        mMainViewModel.queryListWork();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mMainViewModel.insertWork(new WorkEntity("alo alo","alo alo 2"));
//            }
//        },2000);

    }
}
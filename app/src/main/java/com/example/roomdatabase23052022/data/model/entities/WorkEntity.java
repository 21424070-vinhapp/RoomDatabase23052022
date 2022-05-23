package com.example.roomdatabase23052022.data.model.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "work")
public class WorkEntity  {

    //dat id lam khoa chinh va cho no tu dong tang
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String message;

    //dat gia tri mat dinh cho is_done la false
    @ColumnInfo(defaultValue = "0")
    private boolean is_done;

    //dung de tao ra constructor khi db chay
    public WorkEntity() {
    }

    //thong bao cho db biet khong con tao ra constructor nay
    @Ignore
    public WorkEntity(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIs_done() {
        return is_done;
    }

    public void setIs_done(boolean is_done) {
        this.is_done = is_done;
    }
}

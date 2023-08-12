package com.gtappdevelopers.wallpaperapp.data;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.Dao;



@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}

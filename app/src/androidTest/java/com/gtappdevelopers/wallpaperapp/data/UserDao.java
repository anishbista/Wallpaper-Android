package com.gtappdevelopers.wallpaperapp.data;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


@Dao
public interface UserDao {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM users WHERE email = :email")
    User getUserByEmail(String email);
}


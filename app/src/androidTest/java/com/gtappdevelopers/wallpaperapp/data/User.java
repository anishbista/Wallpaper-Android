// Assuming the package name is "com.gtappdevelopers.wallpaperapp.data"
package com.gtappdevelopers.wallpaperapp.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;


@Entity(tableName = "users")
public class User {
    @PrimaryKey
    @NonNull
    public String email;

    public String password;
}

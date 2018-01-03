package io.ermdev.classify.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import io.ermdev.classify.data.entity.Teacher
import io.ermdev.classify.data.local.dao.TeacherDao

/**
 * Created by erafaelmanuel on 1/3/2018.
 */
@Database(entities = arrayOf(Teacher::class), version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun teacherDao(): TeacherDao
}
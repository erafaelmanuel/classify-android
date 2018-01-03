package io.ermdev.classify.data.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import io.ermdev.classify.data.entity.Teacher

/**
 * Created by erafaelmanuel on 1/3/2018.
 */
@Dao
interface TeacherDao {

    @Query("SELECT * FROM tblteacher WHERE id=:teacherId")
    fun findById(teacherId: Long): Teacher

    @Query("SELECT * FROM tblteacher")
    fun findAll(): Teacher

    @Insert
    fun save(teacher: Teacher)
}
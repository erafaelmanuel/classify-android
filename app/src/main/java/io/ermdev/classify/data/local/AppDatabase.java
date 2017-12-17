package io.ermdev.classify.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.student.StudentDao;
import io.ermdev.classify.data.local.teacher.Teacher;
import io.ermdev.classify.data.local.teacher.TeacherDao;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

@Database(entities = {Student.class, Teacher.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract StudentDao studentDao();
    public abstract TeacherDao teacherDao();
}

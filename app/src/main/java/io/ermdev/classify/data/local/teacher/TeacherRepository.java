package io.ermdev.classify.data.local.teacher;

import java.util.List;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

public class TeacherRepository {

    private TeacherDao teacherDao;

    public TeacherRepository(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }

    public List<Teacher> getAll() {
        return teacherDao.getAll();
    }

    public void add(Teacher teacher) {
        teacherDao.insert(teacher);
    }
}

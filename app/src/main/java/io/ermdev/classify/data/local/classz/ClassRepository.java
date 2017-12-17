package io.ermdev.classify.data.local.classz;

import android.util.Log;

import io.ermdev.classify.data.local.student.StudentDao;
import io.ermdev.classify.data.local.teacher.TeacherDao;
import io.ermdev.mapfierj.SimpleMapper;

/**
 * Created by erafaelmanuel on 12/17/2017.
 */

public class ClassRepository {

    private ClassDao classDao;
    private StudentDao studentDao;
    private TeacherDao teacherDao;
    private SimpleMapper mapper;

    public ClassRepository(ClassDao classDao, StudentDao studentDao, TeacherDao teacherDao, SimpleMapper mapper){
        this.classDao = classDao;
        this.studentDao = studentDao;
        this.teacherDao = teacherDao;
        this.mapper = mapper;
    }

    public void add(Class _class) {
        classDao.add(_class);
    }

    public ClassDto getById(long id) {
        Log.i("thistag", classDao.getById(id) + "");
        ClassDto _class = mapper.set(classDao.getById(id)).mapAllTo(ClassDto.class);
        _class.setStudent(studentDao.getById(1));
        _class.setTeacher(teacherDao.getById(1));
        return _class;
    }
}

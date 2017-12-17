package io.ermdev.classify.data.local.student;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Remsama on 12/17/2017.
 */

public class StudentRepository  {

    private StudentDao studentDao;

    public StudentRepository(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public void add(final Student student) {
        StudentTask studentTask = new StudentTask();
        studentTask.setTask(new Task() {
            @Override
            public void doStaff() {
                studentDao.insert(student);
            }
        });
        studentTask.execute();
    }

    public void getAll() {
        StudentTask studentTask = new StudentTask();
        studentTask.setTask(new Task() {
            @Override
            public void doStaff() {
                Log.i(StudentRepository.class.getSimpleName(), studentDao.getAll().toString());
            }
        });
        studentTask.execute();
    }

    static class StudentTask extends AsyncTask<Void, Void, Void>{

        Task task;

        public void setTask(Task task) {
            this.task = task;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            task.doStaff();
            return null;
        }
    }

    @FunctionalInterface
    interface Task {
        void doStaff();
    }
}

package io.ermdev.classify.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.classz.Class;
import io.ermdev.classify.data.local.classz.ClassRepository;
import io.ermdev.classify.data.local.student.Student;
import io.ermdev.classify.data.local.student.StudentRepository;
import io.ermdev.classify.data.local.teacher.Teacher;
import io.ermdev.classify.data.local.teacher.TeacherRepository;
import io.ermdev.classify.data.local.user.User;
import io.ermdev.classify.databinding.ActivityUserBinding;
import io.ermdev.classify.viewmodel.SomethingFunction;
import io.ermdev.classify.viewmodel.UserViewModel;

public class UserActivity extends BasicActivity {

    @Inject
    StudentRepository studentRepository;

    @Inject
    TeacherRepository teacherRepository;

    @Inject
    ClassRepository classRepository;

    ActivityUserBinding mActivityUserBinding;
    UserViewModel mUserViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUserViewModel = new UserViewModel(new User());
        mActivityUserBinding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        mActivityUserBinding.setUserViewModel(mUserViewModel);
        mActivityUserBinding.setSomethingFunction(new SomethingFunction() {
            @Override
            public void doIt() {
                Toast.makeText(getApplication(),
                        "username " + mUserViewModel.getUsername() + " password" + mUserViewModel.getPassword(), Toast.LENGTH_LONG)
                        .show();
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        getmPersistenceComponent().inject(this);

        this.deleteDatabase("classify.db");
        this.deleteDatabase("classify");

        Student student = new Student(1L, "Rafael", "Manuel");

        Teacher teacher = new Teacher(1L, "Ralen", "Mandap");

        studentRepository.add(student);
        teacherRepository.add(teacher);

        classRepository.add(new Class(1, 1, 1));

        Log.i(this.getClass().getSimpleName(), teacherRepository.getAll().toString());
        Log.i(this.getClass().getSimpleName(), studentRepository.getAll().toString());
        Log.i(this.getClass().getSimpleName(), classRepository.getById(1).toString());















//        final UserClient userClient = retrofit.create(UserClient.class);
//        User user = new User();
//
//        user.setUsername("ronaldmanuel123");
//        user.setPassword("passwordabc");
//
//        Call<User> callPost = userClient.addUser(user);
//
//        callPost.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                user_123=response.body();
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//                Call<User> callGet = userClient.getById(user_123.getId());
//                callGet.enqueue(new Callback<User>() {
//                    @Override
//                    public void onResponse(Call<User> call, Response<User> response) {
//                        Snackbar.make(view, response.body().toString(), Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<User> call, Throwable t) {
//                        Snackbar.make(view, "Connection error", Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();
//                    }
//                });
//            }
//        });
    }

    //    @Inject
//    Retrofit retrofit;
//    User user_123 = null;
}

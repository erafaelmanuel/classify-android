package io.ermdev.classify.data.local._class;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Relation;

import java.util.ArrayList;
import java.util.List;

import io.ermdev.classify.data.local.student.Student;

/**
 * Created by erafaelmanuel on 12/1/2017.
 */

@Entity(tableName = "tblclass")
public class Class {

    @PrimaryKey
    private Long id;

    @Relation(parentColumn = "id", entityColumn = "")
    private List<Student> students = new ArrayList<>();


}

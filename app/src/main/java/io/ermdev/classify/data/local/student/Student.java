package io.ermdev.classify.data.local.student;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by erafaelmanuel on 12/2/2017.
 */

@Entity(tableName = "tblstudent")
public class Student {

    @PrimaryKey
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long classId;

    private Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

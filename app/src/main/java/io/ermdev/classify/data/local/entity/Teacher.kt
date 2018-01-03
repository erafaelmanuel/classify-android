package io.ermdev.classify.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by erafaelmanuel on 1/3/2018.
 */
@Entity(tableName = "tblteacher")
class Teacher(
        @PrimaryKey(autoGenerate = true)
        var id: Long,
        var firstName: String,
        var lastName: String
)
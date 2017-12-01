package io.ermdev.classify.data.quiz;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by erafaelmanuel on 11/28/2017.
 */

@Entity(tableName = "tblquiz")
public class Quiz {

    @PrimaryKey
    private Long id;
    private String title;
    private String date;
    private Integer score;
    private Integer total;

    public Quiz() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

package io.ermdev.classify.persistence;

import java.util.List;

import io.ermdev.classify.data.model.Quiz;

/**
 * Created by erafaelmanuel on 11/29/2017.
 */

public interface QuizDao {

    Quiz findById(Long id);

    List<Quiz> findAll(Long id);
}

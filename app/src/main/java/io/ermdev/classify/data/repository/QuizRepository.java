package io.ermdev.classify.data.repository;

import java.util.List;

import io.ermdev.classify.data.model.Quiz;

/**
 * Created by Remsama on 11/28/2017.
 */

public interface QuizRepository {

    Quiz findById(Long id);

    List<Quiz> findAll(Long id);
}

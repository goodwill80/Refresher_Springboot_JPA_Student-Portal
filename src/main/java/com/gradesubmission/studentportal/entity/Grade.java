package com.gradesubmission.studentportal.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Grade {
    private Long id;
    private String score;

    public Grade(Long id, String score) {
        this.id = id;
        this.score = score;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}

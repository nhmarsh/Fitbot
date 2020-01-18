package com.nhmarsh.exception;

import com.nhmarsh.domain.UserViolation;

import java.util.List;

public class ViolationException extends Exception {

    private List<UserViolation> violations;

    public ViolationException(List<UserViolation> violations) {
        super();
        this.violations = violations;
    }
}

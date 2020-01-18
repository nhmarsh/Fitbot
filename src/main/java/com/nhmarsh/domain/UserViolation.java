package com.nhmarsh.domain;

import org.apache.commons.lang3.StringUtils;

public class UserViolation {

    private Violation violation;
    private String violationArg;

    public UserViolation(Violation violation) {
        this.violation = violation;
        this.violationArg = null;
    }

    public UserViolation(Violation violation, String violationArg) {
        this.violation = violation;
        this.violationArg = violationArg;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public String getViolationArg() {
        return violationArg;
    }

    public void setViolationArg(String violationArg) {
        this.violationArg = violationArg;
    }

    public String formatUserViolation() {
        return "Error: " + violation.getPlainText() + (StringUtils.isNotBlank(violationArg) ? ": " + violationArg : "");
    }
}

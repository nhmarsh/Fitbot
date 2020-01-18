package com.nhmarsh.domain;

public enum Violation {

    ODD_NUM_ARGS("You should have an even number of arguments; one csv file for each json file [json1] [csv1] " +
            "[json2] [csv2]... "),
    UNREADABLE_FILE("The file at the following path is not readable or writeable");

    private final String plainText;

    Violation(String plainText) {
        this.plainText = plainText;
    }

    public String getPlainText() {
        return plainText;
    }
}

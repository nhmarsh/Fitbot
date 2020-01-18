package com.nhmarsh.service;

import com.nhmarsh.domain.JsonCsvPair;
import com.nhmarsh.domain.UserViolation;
import com.nhmarsh.domain.Violation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArgProcessor {

    public static List<JsonCsvPair> processArgs(List<String> args) {
        List<UserViolation> violations = new ArrayList<>();
        List<JsonCsvPair> files = new ArrayList<>();
        if(args.size() % 2 != 0) {
            violations.add(new UserViolation(Violation.ODD_NUM_ARGS));
        }

        for(int i = 0; i < args.size(); i += 2) {
            String jarName = args.get(i);
            String csvName = args.get(i+1);

            try {
                files.add(new JsonCsvPair(jarName, csvName));
            } catch (IOException e) {
                violations.add()
            }
        }

        return files;
    }



}

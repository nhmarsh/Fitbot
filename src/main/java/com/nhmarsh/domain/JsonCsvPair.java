package com.nhmarsh.domain;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class JsonCsvPair {
    String jsonPath;
    String csvPath;
    File csvFile;
    File jsonFile;

    public JsonCsvPair(String jsonPath, String csvPath) throws IOException {
        this.jsonPath = jsonPath;
        this.csvPath = csvPath;

        getJsonFile();
        getCsvFile();
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public String getCsvPath() {
        return csvPath;
    }

    public void setCsvPath(String csvPath) {
        this.csvPath = csvPath;
    }

    public File getJsonFile() throws IOException {
        if(jsonFile == null) {
            jsonFile = new File(getJsonPath());
            if(!jsonFile.canRead()) {
                throw new IOException("Unable to read file at path " + jsonPath);
            }
        }

        return jsonFile;
    }

    public File getCsvFile() throws IOException {
        if(csvFile == null) {
            csvFile = new File(getCsvPath());
            csvFile.createNewFile();
        }

        return csvFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonCsvPair that = (JsonCsvPair) o;
        return Objects.equals(getJsonPath(), that.getJsonPath()) &&
                Objects.equals(getCsvPath(), that.getCsvPath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJsonPath(), getCsvPath());
    }
}

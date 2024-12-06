package org.example;

public class MoodAnalysisException extends Exception {

    private final ErrorType errorType;

    public MoodAnalysisException(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}

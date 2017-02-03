package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by edgargonzalez on 2/2/17.
 */
public class OutOfBoundsException extends Exception {
    public OutOfBoundsException() {
    }

    public OutOfBoundsException(String message) {
        super(message);
    }

    public OutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public OutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

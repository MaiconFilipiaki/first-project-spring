package com.filipiaki.cursomc.services.exceptions;

public class ObjectNotFoundExpection extends RuntimeException {

    private static final long serialVersionUID = -7641363088043858325L;

    public ObjectNotFoundExpection(String msg) {
        super(msg);
    }

    public ObjectNotFoundExpection(String msg, Throwable cause) {
        super(msg, cause);
    }
}

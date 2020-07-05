package com.suanev.restaurant.resources.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<FieldMessage> errors = new ArrayList<FieldMessage>();

    public ValidationError(Integer status, String message, Long timeStamp) {
        super(status, message, timeStamp);
    }

    public List<FieldMessage> getError() {
        return errors;
    }

    public void addError(String name, String message) {
        errors.add(new FieldMessage(name, message));
    }
}

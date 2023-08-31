package com.polemon.viki_commons.communication.exception;

import com.polemon.viki_commons.utils.VikiException;

/**
 * Exception used when an error occurred in a deserialization.
 */
public class CommunicationDeserializerException extends VikiException {

    public CommunicationDeserializerException(String message) {
        super(message);
    }

}

package com.polemon.viki_commons.communication.exception;

import com.polemon.viki_commons.utils.VikiException;

/**
 * Exception used when an error occurred in a serialization.
 */
public class CommunicationSerializerException extends VikiException {

    public CommunicationSerializerException(String message) {
        super(message);
    }

}

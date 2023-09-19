package com.polemon.viki_commons.communication.exception;

import com.polemon.viki_commons.utils.VikiException;

/**
 * Exception used to inform a generic problem in the consumer.
 */
public class CommunicationConsumerException extends VikiException {

    public CommunicationConsumerException(String message) {
        super(message);
    }

}

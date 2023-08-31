package com.polemon.viki_commons.communication.exception;

import com.polemon.viki_commons.utils.VikiException;

/**
 * Exception used to inform a generic problem in the producer.
 */
public class CommunicationProducerException extends VikiException {

    public CommunicationProducerException(String message) {
        super(message);
    }

}

package com.polemon.viki_commons.communication.async;

import com.polemon.viki_commons.communication.exception.CommunicationProducerException;
import com.polemon.viki_commons.communication.models.Event;

/**
 * Interface producer to be implemented by a communication module.
 * It's only purpose is to produce/send an Event to the storage.
 */
public interface IAsyncProducer {

    /**
     * This method will be called to produce/send an Event to the storage.
     *
     * @param event to be produced
     * @throws CommunicationProducerException if ID, topic or payload are null
     */
    void produce(Event event) throws CommunicationProducerException;

}

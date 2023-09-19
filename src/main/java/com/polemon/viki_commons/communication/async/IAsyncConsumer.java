package com.polemon.viki_commons.communication.async;

import com.polemon.viki_commons.communication.exception.CommunicationConsumerException;
import com.polemon.viki_commons.communication.models.Event;

import java.util.Map;

/**
 * Interface consumer to be implemented by a communication module.
 * It's only purpose is to consume/get an Event from the storage.
 */
public interface IAsyncConsumer {

    /**
     * Configure the cache size of Events consumed.
     * If size = 0, the consumer will poll only when asked.
     * It is possible that the consumer cannot consume only one Event. If so, the cache will still exist
     * with the minimum Events possible.
     *
     * @param size of the cache
     */
    void cacheSize(int size);

    /**
     * This method allows the user to subscribe a specific Event.
     *
     * @param source the path to subscribe
     * @param classZ to be used in the deserialization of the events
     * @throws CommunicationConsumerException if a source or classZ are null
     */
    void subscribeEvent(String source, Class<?> classZ) throws CommunicationConsumerException;

    /**
     * This method allows the user to subscribe more than one Event.
     *
     * @param sourceMap has key with a source path and value with the class to be used in deserialization
     * @throws CommunicationConsumerException if a source or classZ are null
     */
    void subscribeEvents(Map<String, Class<?>> sourceMap) throws CommunicationConsumerException;

    /**
     * This method will be called to poll the next Event in a Queue.
     * If the technology polls many events at once, then the implementation should store those events to be returned later.
     *
     * @return Event is the next Event or null if no Event available
     */
    Event getNext();

}

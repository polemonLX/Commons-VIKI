package com.polemon.viki_commons.communication.utils;


import com.polemon.viki_commons.communication.models.Event;

/**
 * Interface to be implemented by a handler of the Consumer. The consumer will call this
 * handler to process the oncoming Event.
 */
public interface ICommunicationConsumerHandler {

    /**
     * Method to be called when the Event arrives to the Consumer.
     *
     * @param event the arriving Event
     * @return a response to the client
     */
    Event execute(Event event);

}

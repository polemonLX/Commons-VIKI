package com.polemon.viki_commons.communication.models;

import java.util.Map;

/**
 * Event is a pojo to be used in communication. All technologies should use this class
 * to store/send events.
 * This class contains a header (metadata of the Event) and a body (payload of the event).
 * The kernel should never use the Event. Only the payload should be used.
 */
public class Event {

    /**
     * Headers of the Event. Contains correlationId, address and metadata
     */
    private final Headers headers;

    /**
     * Payload of the event
     */
    private final Object payload;

    /**
     * Constructor with all needed information to build an Event
     *
     * @param sagaId  to be used as a correlation between events from the same Saga
     * @param address of the event
     * @param payload of the event
     */
    public Event(String sagaId, String address, Object payload) {
        this.headers = new Headers(sagaId, address);
        this.payload = payload;
    }

    /**
     * Add new metadata for the headers.
     *
     * @param key   The key of the header
     * @param value The value of the header
     */
    public void addHeader(String key, String value) {
        headers.addKeyValue(key, value);
    }

    /**
     * Get the value corresponding to a given key
     *
     * @param key that maps the value
     * @return the String of the value
     */
    public String getValue(String key) {
        return headers.getValue(key);
    }

    /**
     * Get a collection of all metadata present in the headers
     *
     * @return a new Map with all the data
     */
    public Map<String, String> getHeaders() {
        return headers.getHeaders();
    }

    public String getSagaId() {
        return headers.getSagaId();
    }

    public String getEventDestinationAddress() {
        return headers.getEventDestinationAddress();
    }

    @Override
    public String toString() {
        return "Event{" +
                "headers=" + headers +
                ", payload=" + payload +
                '}';
    }

}

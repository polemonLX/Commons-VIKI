package com.polemon.viki_commons.communication.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Headers of the Event class. It is used to store the meta-info about the Event.
 * Has an id and a destiny already in the key/value pair, since it is a must in each Event. If the keyValue is called,
 * it will return a Map with the id and destiny in it.
 * The rest of the key/value pairs are stored in a Map<String, String>.
 */
public class Headers {

    /**
     * All the metadata is stored here
     */
    private final Map<String, String> metadata;

    /**
     * CorrelationId to be used as a correlation between events from the same Saga
     */
    private final String sagaId;

    /**
     * Address of the event
     */
    private final String eventDestinationAddress;


    public Headers(String sagaId, String eventDestinationAddress) {
        this.sagaId = sagaId;
        this.eventDestinationAddress = eventDestinationAddress;
        this.metadata = new HashMap<>();
    }

    public void addKeyValue(String key, String value) {
        metadata.put(key, value);
    }

    public String getValue(String key) {
        return metadata.get(key);
    }

    public String getSagaId() {
        return sagaId;
    }

    public String getEventDestinationAddress() {
        return eventDestinationAddress;
    }

    public Map<String, String> getHeaders() {
        return new HashMap<>(metadata) {{
            put("sagaId", sagaId);
            put("eventDestinationAddress", eventDestinationAddress);
        }};
    }

    @Override
    public String toString() {
        return "Headers{" +
                "id='" + sagaId + '\'' +
                ", eventDestinationAddress ='" + eventDestinationAddress + '\'' +
                ", metadata =" + metadata +
                '}';
    }

}

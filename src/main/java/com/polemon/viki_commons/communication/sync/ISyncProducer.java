package com.polemon.viki_commons.communication.sync;

import com.polemon.viki_commons.communication.exception.CommunicationProducerException;
import com.polemon.viki_commons.communication.models.Event;
import com.polemon.viki_commons.communication.models.Method;

import java.util.Map;

/**
 * Interface producer to be implemented by a communication module.
 * It's only purpose is to produce/send an Event to the storage.
 */
public interface ISyncProducer {

    /**
     * Produces an HTTP Request
     *
     * @param method       HTTP request method
     * @param address      HTTP address
     * @param deserializer Deserializer for the response body
     * @param bodyType     Class of the response body
     * @return Event with the HTTP headers (including a "httpCode" header with the HTTP status code) and the body of the HTTP response
     */
    Event produce(Method method, String address, String deserializer, Class<?> bodyType) throws CommunicationProducerException;

    /**
     * Produces an HTTP Request
     *
     * @param method       HTTP request method
     * @param address      HTTP address
     * @param body         HTTP request body
     * @param serializer   Serializer for the request body
     * @param deserializer Deserializer for the response body
     * @param bodyType     Class of the response body
     * @return Event with the HTTP headers (including a "httpCode" header with the HTTP status code) and the body of the HTTP response
     */
    Event produce(Method method, String address, Object body, String serializer, String deserializer, Class<?> bodyType) throws CommunicationProducerException;

    /**
     * Produces an HTTP Request
     *
     * @param method       HTTP request method
     * @param address      HTTP address
     * @param body         HTTP request body
     * @param headers      HTTP request headers
     * @param serializer   Serializer for the request body
     * @param deserializer Deserializer for the response body
     * @param bodyType     Class of the response body
     * @return Event with the HTTP headers (including a "httpCode" header with the HTTP status code) and the body of the HTTP response
     */
    Event produce(Method method, String address, Object body, Map<String, String> headers, String serializer, String deserializer, Class<?> bodyType) throws CommunicationProducerException;

}

package com.polemon.viki_commons.communication.utils;

import com.polemon.viki_commons.communication.exception.CommunicationDeserializerException;

/**
 * Interface for deserializer implementations.
 */
public interface ICommunicationDeserializer {

    /**
     * Deserialize a String value into a model type.
     *
     * @param value     as a String to be deserialized
     * @param modelType to deserialize value into
     * @return a new model type
     * @throws CommunicationDeserializerException when occurs an error in deserialization process
     */
    Object deserialize(String value, Class<?> modelType) throws CommunicationDeserializerException;

    /**
     * Deserialize an Array of bytes into a model type.
     *
     * @param bytes     as an Array of bytes to be deserialized
     * @param modelType to deserialize value into
     * @return a new model type
     * @throws CommunicationDeserializerException when occurs an error in deserialization process
     */
    Object deserialize(byte[] bytes, Class<?> modelType) throws CommunicationDeserializerException;

}

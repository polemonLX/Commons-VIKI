package com.polemon.viki_commons.communication.utils;

import com.polemon.viki_commons.communication.exception.CommunicationSerializerException;

/**
 * Interface for serializer implementations.
 */
public interface ICommunicationSerializer {

    /**
     * Serialize an object into an Array of bytes.
     *
     * @param payload the object to be serialized
     * @return Array of bytes
     * @throws CommunicationSerializerException when occurs an error in serialization process
     */
    byte[] serialize(Object payload) throws CommunicationSerializerException;

}

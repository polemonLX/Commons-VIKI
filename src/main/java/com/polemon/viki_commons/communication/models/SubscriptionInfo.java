package com.polemon.viki_commons.communication.models;

/**
 * This abstract class must be extended by specific classes of a technology.
 * Each technology has different parameters that it must need in order to work.
 */
public abstract class SubscriptionInfo {

    /**
     * Source of the expected request.
     */
    private final String source;

    /**
     * Model type to convert the request's body.
     */
    private final Class<?> modelType;

    /**
     * Serializer to convert the response object into the request's response.
     */
    private final String serializer;

    /**
     * Deserializer to convert the request body into the model type.
     */
    private final String deserializer;

    public SubscriptionInfo(String source, Class<?> modelType, String serializer, String deserializer) {
        this.source = source;
        this.modelType = modelType;
        this.serializer = serializer;
        this.deserializer = deserializer;
    }

}

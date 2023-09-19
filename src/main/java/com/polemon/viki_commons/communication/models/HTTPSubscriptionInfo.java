package com.polemon.viki_commons.communication.models;

/**
 * Class that extends SubscriptionInfo. Useful to pass arguments that are needed in a sync communication. Plus, this class
 * has an extra argument, method, only used in this specific module.
 */
public class HTTPSubscriptionInfo extends SubscriptionInfo {

    /**
     * Method of the request
     */
    private final Method method;

    public HTTPSubscriptionInfo(String source, Method method, Class<?> modelType, String serializer, String deserializer) {
        super(source, modelType, serializer, deserializer);
        this.method = method;
    }

}

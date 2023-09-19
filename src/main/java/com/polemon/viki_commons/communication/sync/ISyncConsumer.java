package com.polemon.viki_commons.communication.sync;

import com.polemon.viki_commons.communication.exception.CommunicationConsumerException;
import com.polemon.viki_commons.communication.models.SubscriptionInfo;
import com.polemon.viki_commons.communication.utils.ICommunicationConsumerHandler;

import java.util.Map;

/**
 * Interface consumer to be implemented by a communication module.
 * It's only purpose is to consume/get an Event from the storage.
 */
public interface ISyncConsumer {

    /**
     * This method allows the user to subscribe a specific Event.
     *
     * @param subscriptionInfo                    must be extended by a specific class and filled with info about the Event
     * @param ICommunicationConsumerHandler handler to process the incoming event
     * @throws CommunicationConsumerException if something in SubscriptionInfo is null
     */
    void subscribeEvent(SubscriptionInfo subscriptionInfo, ICommunicationConsumerHandler ICommunicationConsumerHandler) throws CommunicationConsumerException;

    /**
     * This method allows the user to subscribe more than one Event.
     *
     * @param subscriptionInfos map of SubscriptionInfo and ConsumerHandler
     * @throws CommunicationConsumerException if something in SubscriptionInfo is null
     * @see #subscribeEvent(SubscriptionInfo, ICommunicationConsumerHandler)
     */
    void subscribeEvents(Map<SubscriptionInfo, ICommunicationConsumerHandler> subscriptionInfos) throws CommunicationConsumerException;

}

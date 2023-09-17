package com.polemon.viki_commons.communication.utils;

import com.polemon.viki_commons.communication.async.IAsyncConsumer;
import com.polemon.viki_commons.communication.async.IAsyncProducer;
import com.polemon.viki_commons.communication.sync.ISyncConsumer;
import com.polemon.viki_commons.communication.sync.ISyncProducer;

/**
 * Factory of async consumers and producers.
 * Since it is possible to have different consumers and producers, the id passed in each
 * method will map to a given consumer/producer.
 */
public interface ICommunicationFactory {

    /**
     * Map an id to a specific consumer.
     *
     * @param id to identify the wanted consumer
     * @return ICommunicationConsumer
     */
    IAsyncConsumer getNewAsyncConsumer(String id);

    /**
     * Map an id to a specific producer.
     *
     * @param id to identify the wanted producer
     * @return ICommunicationProducer
     */
    IAsyncProducer getNewAsyncProducer(String id);

    /**
     * Map an id to a specific consumer.
     *
     * @param id to identify the wanted consumer
     * @return ICommunicationConsumerSync
     */
    ISyncConsumer getNewSyncConsumer(String id);

    /**
     * Map an id to a specific producer.
     *
     * @param id to identify the wanted producer
     * @return ICommunicationProducerSync
     */
    ISyncProducer getNewSyncProducer(String id);

}

/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ClientValidationErrorDto;
import org.openapitools.client.model.MerchantChannel;
import org.openapitools.client.model.MerchantChannelPayment;
import org.openapitools.client.model.MerchantChannelRequest;
import org.openapitools.client.model.PaymentStatusDto;
import org.openapitools.client.model.ServerErrorDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelsApi
 */
@Disabled
public class ChannelsApiTest {

    private final ChannelsApi api = new ChannelsApi();

    /**
     * List Channels
     *
     * Retrieves all channels related to a Merchant ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ChannelGetTest() throws ApiException {
        String merchantId = null;
        String offset = null;
        String max = null;
        PaymentStatusDto sort = null;
        String order = null;
        List<MerchantChannel> response = api.apiV2ChannelGet(merchantId, offset, max, sort, order);
        // TODO: test validations
    }

    /**
     * List Channel Payments
     *
     * Retrieves a list of payments to a channel on a specific Merchant ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ChannelPaymentGetTest() throws ApiException {
        String merchantId = null;
        String status = null;
        String fromDate = null;
        String toDate = null;
        String offset = null;
        String max = null;
        String order = null;
        String q = null;
        List<MerchantChannelPayment> response = api.apiV2ChannelPaymentGet(merchantId, status, fromDate, toDate, offset, max, order, q);
        // TODO: test validations
    }

    /**
     * Get Channel Payment
     *
     * Retrieves a specific payment made into a channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ChannelPaymentUuidGetTest() throws ApiException {
        String uuid = null;
        MerchantChannelPayment response = api.apiV2ChannelPaymentUuidGet(uuid);
        // TODO: test validations
    }

    /**
     * Create Channel
     *
     * Creates a channel that your end users can openly send payments to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ChannelPostTest() throws ApiException {
        MerchantChannelRequest merchantChannelRequest = null;
        MerchantChannel response = api.apiV2ChannelPost(merchantChannelRequest);
        // TODO: test validations
    }

    /**
     * Get Channel
     *
     * Retrieves a specific channel by UUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ChannelUuidGetTest() throws ApiException {
        String uuid = null;
        MerchantChannel response = api.apiV2ChannelUuidGet(uuid);
        // TODO: test validations
    }

}

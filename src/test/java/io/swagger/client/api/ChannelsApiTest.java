/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ClientValidationErrorDto;
import io.swagger.client.model.MerchantChannel;
import io.swagger.client.model.MerchantChannelPayment;
import io.swagger.client.model.MerchantChannelRequest;
import io.swagger.client.model.PaymentStatusDto;
import io.swagger.client.model.ServerErrorDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ChannelsApi
 */
@Ignore
public class ChannelsApiTest {

    private final ChannelsApi api = new ChannelsApi();

    /**
     * List Channels
     *
     * Retrieves all channels related to a Merchant ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV2ChannelGetTest() throws Exception {
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV2ChannelPaymentGetTest() throws Exception {
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV2ChannelPaymentUuidGetTest() throws Exception {
        String uuid = null;
        MerchantChannelPayment response = api.apiV2ChannelPaymentUuidGet(uuid);

        // TODO: test validations
    }
    /**
     * Create Channel
     *
     * Creates a channel that your end users can openly send payments to.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV2ChannelPostTest() throws Exception {
        MerchantChannelRequest body = null;
        MerchantChannel response = api.apiV2ChannelPost(body);

        // TODO: test validations
    }
    /**
     * Get Channel
     *
     * Retrieves a specific channel by UUID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV2ChannelUuidGetTest() throws Exception {
        String uuid = null;
        MerchantChannel response = api.apiV2ChannelUuidGet(uuid);

        // TODO: test validations
    }
}

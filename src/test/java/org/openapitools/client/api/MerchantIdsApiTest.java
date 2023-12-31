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
import org.openapitools.client.model.Merchant;
import org.openapitools.client.model.MerchantIdCreateRequest;
import org.openapitools.client.model.SummaryPaymentDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantIdsApi
 */
@Disabled
public class MerchantIdsApiTest {

    private final MerchantIdsApi api = new MerchantIdsApi();

    /**
     * Create Merchant ID
     *
     * Generate a Merchant ID for your account to process pay-ins and pay-outs through our API.  A Merchant ID is essential as it designates the account wallet where incoming pay-ins will be settled. For instance, if a Merchant ID is associated with a EUR wallet ID, any incoming USDT payment will be automatically converted to EUR and deposited in the designated EUR wallet.  Vice versa, any outgoing USDT payment will be automatically converted and withdrawn from the designated EUR wallet.  For further information, please visit https://docs.bvnk.com/docs/creating-your-first-merchant to learn more about creating your first Merchant ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void merchantIdCreateTest() throws ApiException {
        MerchantIdCreateRequest merchantIdCreateRequest = null;
        SummaryPaymentDto response = api.merchantIdCreate(merchantIdCreateRequest);
        // TODO: test validations
    }

    /**
     * List Merchant IDs
     *
     * Retrieves merchant IDs setup on your account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void merchantIdListTest() throws ApiException {
        List<Merchant> response = api.merchantIdList();
        // TODO: test validations
    }

}

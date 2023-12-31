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

import io.swagger.client.model.Merchant;
import io.swagger.client.model.SummaryPaymentDto;
import io.swagger.client.model.V1MerchantBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MerchantIdsApi
 */
@Ignore
public class MerchantIdsApiTest {

    private final MerchantIdsApi api = new MerchantIdsApi();

    /**
     * Create Merchant ID
     *
     * Generate a Merchant ID for your account to process pay-ins and pay-outs through our API.  A Merchant ID is essential as it designates the account wallet where incoming pay-ins will be settled. For instance, if a Merchant ID is associated with a EUR wallet ID, any incoming USDT payment will be automatically converted to EUR and deposited in the designated EUR wallet.  Vice versa, any outgoing USDT payment will be automatically converted and withdrawn from the designated EUR wallet.  For further information, please visit https://docs.bvnk.com/docs/creating-your-first-merchant to learn more about creating your first Merchant ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void merchantIdCreateTest() throws Exception {
        V1MerchantBody body = null;
        SummaryPaymentDto response = api.merchantIdCreate(body);

        // TODO: test validations
    }
    /**
     * List Merchant IDs
     *
     * Retrieves merchant IDs setup on your account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void merchantIdListTest() throws Exception {
        List<Merchant> response = api.merchantIdList();

        // TODO: test validations
    }
}

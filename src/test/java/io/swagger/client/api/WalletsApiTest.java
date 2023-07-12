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

import io.swagger.client.model.Balance;
import io.swagger.client.model.ServerErrorDto;
import io.swagger.client.model.TransactionReport;
import io.swagger.client.model.Wallet;
import io.swagger.client.model.WalletRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WalletsApi
 */
@Ignore
public class WalletsApiTest {

    private final WalletsApi api = new WalletsApi();

    /**
     * Transactions Report
     *
     * Report all transactions from wallet in specified format. Report will be generated and sent to main account email in the specified format
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void transactionReportTest() throws Exception {
        Long walletId = null;
        String fromDate = null;
        String toDate = null;
        String format = null;
        String transactionType = null;
        List<TransactionReport> response = api.transactionReport(walletId, fromDate, toDate, format, transactionType);

        // TODO: test validations
    }
    /**
     * List Wallet Balances
     *
     * Retrieves the balances of your wallets on platform.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void walletBalanceListTest() throws Exception {
        String date = null;
        List<Balance> response = api.walletBalanceList(date);

        // TODO: test validations
    }
    /**
     * Create Wallet
     *
     * Creates a wallet on the BVNK platform.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void walletCreateTest() throws Exception {
        WalletRequest body = null;
        Wallet response = api.walletCreate(body);

        // TODO: test validations
    }
    /**
     * List Wallets
     *
     * Retrieves a list of wallets on your account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void walletListTest() throws Exception {
        Integer offset = null;
        Integer max = null;
        List<Wallet> response = api.walletList(offset, max);

        // TODO: test validations
    }
    /**
     * Get Wallet
     *
     * Retrieves a specific wallet.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void walletRGetTest() throws Exception {
        Long id = null;
        Wallet response = api.walletRGet(id);

        // TODO: test validations
    }
}

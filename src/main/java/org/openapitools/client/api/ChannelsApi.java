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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ClientValidationErrorDto;
import org.openapitools.client.model.MerchantChannel;
import org.openapitools.client.model.MerchantChannelPayment;
import org.openapitools.client.model.MerchantChannelRequest;
import org.openapitools.client.model.PaymentStatusDto;
import org.openapitools.client.model.ServerErrorDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ChannelsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ChannelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV2ChannelGet
     * @param merchantId The merchant ID that the channels belong to (required)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param sort The attribute used to sort the data (optional)
     * @param order Ordering direction (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelGetCall(String merchantId, String offset, String max, PaymentStatusDto sort, String order, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchantId", merchantId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (max != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max", max));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ChannelGetValidateBeforeCall(String merchantId, String offset, String max, PaymentStatusDto sort, String order, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling apiV2ChannelGet(Async)");
        }

        return apiV2ChannelGetCall(merchantId, offset, max, sort, order, _callback);

    }

    /**
     * List Channels
     * Retrieves all channels related to a Merchant ID.
     * @param merchantId The merchant ID that the channels belong to (required)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param sort The attribute used to sort the data (optional)
     * @param order Ordering direction (optional)
     * @return List&lt;MerchantChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public List<MerchantChannel> apiV2ChannelGet(String merchantId, String offset, String max, PaymentStatusDto sort, String order) throws ApiException {
        ApiResponse<List<MerchantChannel>> localVarResp = apiV2ChannelGetWithHttpInfo(merchantId, offset, max, sort, order);
        return localVarResp.getData();
    }

    /**
     * List Channels
     * Retrieves all channels related to a Merchant ID.
     * @param merchantId The merchant ID that the channels belong to (required)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param sort The attribute used to sort the data (optional)
     * @param order Ordering direction (optional)
     * @return ApiResponse&lt;List&lt;MerchantChannel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MerchantChannel>> apiV2ChannelGetWithHttpInfo(String merchantId, String offset, String max, PaymentStatusDto sort, String order) throws ApiException {
        okhttp3.Call localVarCall = apiV2ChannelGetValidateBeforeCall(merchantId, offset, max, sort, order, null);
        Type localVarReturnType = new TypeToken<List<MerchantChannel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Channels (asynchronously)
     * Retrieves all channels related to a Merchant ID.
     * @param merchantId The merchant ID that the channels belong to (required)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param sort The attribute used to sort the data (optional)
     * @param order Ordering direction (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelGetAsync(String merchantId, String offset, String max, PaymentStatusDto sort, String order, final ApiCallback<List<MerchantChannel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ChannelGetValidateBeforeCall(merchantId, offset, max, sort, order, _callback);
        Type localVarReturnType = new TypeToken<List<MerchantChannel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ChannelPaymentGet
     * @param merchantId The Merchant ID (required)
     * @param status  (optional)
     * @param fromDate From which date to start searching. (optional)
     * @param toDate At which date to stop searching. (optional)
     * @param offset Where to start fetching records. (optional)
     * @param max Maximum number of items in response (optional)
     * @param order Ordering direction (optional)
     * @param q Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPaymentGetCall(String merchantId, String status, String fromDate, String toDate, String offset, String max, String order, String q, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/channel/payment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchantId", merchantId));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (max != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max", max));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ChannelPaymentGetValidateBeforeCall(String merchantId, String status, String fromDate, String toDate, String offset, String max, String order, String q, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling apiV2ChannelPaymentGet(Async)");
        }

        return apiV2ChannelPaymentGetCall(merchantId, status, fromDate, toDate, offset, max, order, q, _callback);

    }

    /**
     * List Channel Payments
     * Retrieves a list of payments to a channel on a specific Merchant ID.
     * @param merchantId The Merchant ID (required)
     * @param status  (optional)
     * @param fromDate From which date to start searching. (optional)
     * @param toDate At which date to stop searching. (optional)
     * @param offset Where to start fetching records. (optional)
     * @param max Maximum number of items in response (optional)
     * @param order Ordering direction (optional)
     * @param q Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code. (optional)
     * @return List&lt;MerchantChannelPayment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<MerchantChannelPayment> apiV2ChannelPaymentGet(String merchantId, String status, String fromDate, String toDate, String offset, String max, String order, String q) throws ApiException {
        ApiResponse<List<MerchantChannelPayment>> localVarResp = apiV2ChannelPaymentGetWithHttpInfo(merchantId, status, fromDate, toDate, offset, max, order, q);
        return localVarResp.getData();
    }

    /**
     * List Channel Payments
     * Retrieves a list of payments to a channel on a specific Merchant ID.
     * @param merchantId The Merchant ID (required)
     * @param status  (optional)
     * @param fromDate From which date to start searching. (optional)
     * @param toDate At which date to stop searching. (optional)
     * @param offset Where to start fetching records. (optional)
     * @param max Maximum number of items in response (optional)
     * @param order Ordering direction (optional)
     * @param q Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code. (optional)
     * @return ApiResponse&lt;List&lt;MerchantChannelPayment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MerchantChannelPayment>> apiV2ChannelPaymentGetWithHttpInfo(String merchantId, String status, String fromDate, String toDate, String offset, String max, String order, String q) throws ApiException {
        okhttp3.Call localVarCall = apiV2ChannelPaymentGetValidateBeforeCall(merchantId, status, fromDate, toDate, offset, max, order, q, null);
        Type localVarReturnType = new TypeToken<List<MerchantChannelPayment>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Channel Payments (asynchronously)
     * Retrieves a list of payments to a channel on a specific Merchant ID.
     * @param merchantId The Merchant ID (required)
     * @param status  (optional)
     * @param fromDate From which date to start searching. (optional)
     * @param toDate At which date to stop searching. (optional)
     * @param offset Where to start fetching records. (optional)
     * @param max Maximum number of items in response (optional)
     * @param order Ordering direction (optional)
     * @param q Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPaymentGetAsync(String merchantId, String status, String fromDate, String toDate, String offset, String max, String order, String q, final ApiCallback<List<MerchantChannelPayment>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ChannelPaymentGetValidateBeforeCall(merchantId, status, fromDate, toDate, offset, max, order, q, _callback);
        Type localVarReturnType = new TypeToken<List<MerchantChannelPayment>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ChannelPaymentUuidGet
     * @param uuid The UUID of the payment you are querying. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPaymentUuidGetCall(String uuid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/channel/payment/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ChannelPaymentUuidGetValidateBeforeCall(String uuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling apiV2ChannelPaymentUuidGet(Async)");
        }

        return apiV2ChannelPaymentUuidGetCall(uuid, _callback);

    }

    /**
     * Get Channel Payment
     * Retrieves a specific payment made into a channel.
     * @param uuid The UUID of the payment you are querying. (required)
     * @return MerchantChannelPayment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public MerchantChannelPayment apiV2ChannelPaymentUuidGet(String uuid) throws ApiException {
        ApiResponse<MerchantChannelPayment> localVarResp = apiV2ChannelPaymentUuidGetWithHttpInfo(uuid);
        return localVarResp.getData();
    }

    /**
     * Get Channel Payment
     * Retrieves a specific payment made into a channel.
     * @param uuid The UUID of the payment you are querying. (required)
     * @return ApiResponse&lt;MerchantChannelPayment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantChannelPayment> apiV2ChannelPaymentUuidGetWithHttpInfo(String uuid) throws ApiException {
        okhttp3.Call localVarCall = apiV2ChannelPaymentUuidGetValidateBeforeCall(uuid, null);
        Type localVarReturnType = new TypeToken<MerchantChannelPayment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Channel Payment (asynchronously)
     * Retrieves a specific payment made into a channel.
     * @param uuid The UUID of the payment you are querying. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPaymentUuidGetAsync(String uuid, final ApiCallback<MerchantChannelPayment> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ChannelPaymentUuidGetValidateBeforeCall(uuid, _callback);
        Type localVarReturnType = new TypeToken<MerchantChannelPayment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ChannelPost
     * @param merchantChannelRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPostCall(MerchantChannelRequest merchantChannelRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = merchantChannelRequest;

        // create path and map variables
        String localVarPath = "/api/v2/channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ChannelPostValidateBeforeCall(MerchantChannelRequest merchantChannelRequest, final ApiCallback _callback) throws ApiException {
        return apiV2ChannelPostCall(merchantChannelRequest, _callback);

    }

    /**
     * Create Channel
     * Creates a channel that your end users can openly send payments to.
     * @param merchantChannelRequest  (optional)
     * @return MerchantChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public MerchantChannel apiV2ChannelPost(MerchantChannelRequest merchantChannelRequest) throws ApiException {
        ApiResponse<MerchantChannel> localVarResp = apiV2ChannelPostWithHttpInfo(merchantChannelRequest);
        return localVarResp.getData();
    }

    /**
     * Create Channel
     * Creates a channel that your end users can openly send payments to.
     * @param merchantChannelRequest  (optional)
     * @return ApiResponse&lt;MerchantChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantChannel> apiV2ChannelPostWithHttpInfo(MerchantChannelRequest merchantChannelRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ChannelPostValidateBeforeCall(merchantChannelRequest, null);
        Type localVarReturnType = new TypeToken<MerchantChannel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Channel (asynchronously)
     * Creates a channel that your end users can openly send payments to.
     * @param merchantChannelRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelPostAsync(MerchantChannelRequest merchantChannelRequest, final ApiCallback<MerchantChannel> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ChannelPostValidateBeforeCall(merchantChannelRequest, _callback);
        Type localVarReturnType = new TypeToken<MerchantChannel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ChannelUuidGet
     * @param uuid The UUID of the channel you are querying (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelUuidGetCall(String uuid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/channel/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ChannelUuidGetValidateBeforeCall(String uuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling apiV2ChannelUuidGet(Async)");
        }

        return apiV2ChannelUuidGetCall(uuid, _callback);

    }

    /**
     * Get Channel
     * Retrieves a specific channel by UUID.
     * @param uuid The UUID of the channel you are querying (required)
     * @return MerchantChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public MerchantChannel apiV2ChannelUuidGet(String uuid) throws ApiException {
        ApiResponse<MerchantChannel> localVarResp = apiV2ChannelUuidGetWithHttpInfo(uuid);
        return localVarResp.getData();
    }

    /**
     * Get Channel
     * Retrieves a specific channel by UUID.
     * @param uuid The UUID of the channel you are querying (required)
     * @return ApiResponse&lt;MerchantChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantChannel> apiV2ChannelUuidGetWithHttpInfo(String uuid) throws ApiException {
        okhttp3.Call localVarCall = apiV2ChannelUuidGetValidateBeforeCall(uuid, null);
        Type localVarReturnType = new TypeToken<MerchantChannel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Channel (asynchronously)
     * Retrieves a specific channel by UUID.
     * @param uuid The UUID of the channel you are querying (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ChannelUuidGetAsync(String uuid, final ApiCallback<MerchantChannel> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ChannelUuidGetValidateBeforeCall(uuid, _callback);
        Type localVarReturnType = new TypeToken<MerchantChannel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

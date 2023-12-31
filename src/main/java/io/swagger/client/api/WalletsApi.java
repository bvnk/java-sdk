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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Balance;
import io.swagger.client.model.ServerErrorDto;
import io.swagger.client.model.TransactionReport;
import io.swagger.client.model.Wallet;
import io.swagger.client.model.WalletRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletsApi {
    private ApiClient apiClient;

    public WalletsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WalletsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for transactionReport
     * @param walletId Date at to retrieve balances (optional, default to 255861)
     * @param fromDate Export range from date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2022-09-17)
     * @param toDate Export range to date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2023-03-17)
     * @param format &#x27;json&#x27; - json format, &#x27;csv&#x27; - csv format (optional, default to csv)
     * @param transactionType Transaction type code (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transactionReportCall(Long walletId, String fromDate, String toDate, String format, String transactionType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/transaction/report";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (walletId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("walletId", walletId));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (transactionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transactionType", transactionType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call transactionReportValidateBeforeCall(Long walletId, String fromDate, String toDate, String format, String transactionType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = transactionReportCall(walletId, fromDate, toDate, format, transactionType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Transactions Report
     * Report all transactions from wallet in specified format. Report will be generated and sent to main account email in the specified format
     * @param walletId Date at to retrieve balances (optional, default to 255861)
     * @param fromDate Export range from date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2022-09-17)
     * @param toDate Export range to date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2023-03-17)
     * @param format &#x27;json&#x27; - json format, &#x27;csv&#x27; - csv format (optional, default to csv)
     * @param transactionType Transaction type code (optional)
     * @return List&lt;TransactionReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TransactionReport> transactionReport(Long walletId, String fromDate, String toDate, String format, String transactionType) throws ApiException {
        ApiResponse<List<TransactionReport>> resp = transactionReportWithHttpInfo(walletId, fromDate, toDate, format, transactionType);
        return resp.getData();
    }

    /**
     * Transactions Report
     * Report all transactions from wallet in specified format. Report will be generated and sent to main account email in the specified format
     * @param walletId Date at to retrieve balances (optional, default to 255861)
     * @param fromDate Export range from date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2022-09-17)
     * @param toDate Export range to date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2023-03-17)
     * @param format &#x27;json&#x27; - json format, &#x27;csv&#x27; - csv format (optional, default to csv)
     * @param transactionType Transaction type code (optional)
     * @return ApiResponse&lt;List&lt;TransactionReport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TransactionReport>> transactionReportWithHttpInfo(Long walletId, String fromDate, String toDate, String format, String transactionType) throws ApiException {
        com.squareup.okhttp.Call call = transactionReportValidateBeforeCall(walletId, fromDate, toDate, format, transactionType, null, null);
        Type localVarReturnType = new TypeToken<List<TransactionReport>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Transactions Report (asynchronously)
     * Report all transactions from wallet in specified format. Report will be generated and sent to main account email in the specified format
     * @param walletId Date at to retrieve balances (optional, default to 255861)
     * @param fromDate Export range from date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2022-09-17)
     * @param toDate Export range to date in format &#x27;yyyy-MM-dd&#x27; (optional, default to 2023-03-17)
     * @param format &#x27;json&#x27; - json format, &#x27;csv&#x27; - csv format (optional, default to csv)
     * @param transactionType Transaction type code (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transactionReportAsync(Long walletId, String fromDate, String toDate, String format, String transactionType, final ApiCallback<List<TransactionReport>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transactionReportValidateBeforeCall(walletId, fromDate, toDate, format, transactionType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TransactionReport>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for walletBalanceList
     * @param date Date at to retrieve balances (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call walletBalanceListCall(String date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/wallet/balances";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call walletBalanceListValidateBeforeCall(String date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = walletBalanceListCall(date, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Wallet Balances
     * Retrieves the balances of your wallets on platform.
     * @param date Date at to retrieve balances (optional)
     * @return List&lt;Balance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Balance> walletBalanceList(String date) throws ApiException {
        ApiResponse<List<Balance>> resp = walletBalanceListWithHttpInfo(date);
        return resp.getData();
    }

    /**
     * List Wallet Balances
     * Retrieves the balances of your wallets on platform.
     * @param date Date at to retrieve balances (optional)
     * @return ApiResponse&lt;List&lt;Balance&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Balance>> walletBalanceListWithHttpInfo(String date) throws ApiException {
        com.squareup.okhttp.Call call = walletBalanceListValidateBeforeCall(date, null, null);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Wallet Balances (asynchronously)
     * Retrieves the balances of your wallets on platform.
     * @param date Date at to retrieve balances (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call walletBalanceListAsync(String date, final ApiCallback<List<Balance>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = walletBalanceListValidateBeforeCall(date, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for walletCreate
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call walletCreateCall(WalletRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/wallet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call walletCreateValidateBeforeCall(WalletRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = walletCreateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Wallet
     * Creates a wallet on the BVNK platform.
     * @param body  (optional)
     * @return Wallet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Wallet walletCreate(WalletRequest body) throws ApiException {
        ApiResponse<Wallet> resp = walletCreateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Wallet
     * Creates a wallet on the BVNK platform.
     * @param body  (optional)
     * @return ApiResponse&lt;Wallet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Wallet> walletCreateWithHttpInfo(WalletRequest body) throws ApiException {
        com.squareup.okhttp.Call call = walletCreateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Wallet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Wallet (asynchronously)
     * Creates a wallet on the BVNK platform.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call walletCreateAsync(WalletRequest body, final ApiCallback<Wallet> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = walletCreateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Wallet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for walletList
     * @param offset start offset (optional)
     * @param max max number results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call walletListCall(Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/wallet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (max != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max", max));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call walletListValidateBeforeCall(Integer offset, Integer max, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = walletListCall(offset, max, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Wallets
     * Retrieves a list of wallets on your account.
     * @param offset start offset (optional)
     * @param max max number results (optional, default to 10)
     * @return List&lt;Wallet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Wallet> walletList(Integer offset, Integer max) throws ApiException {
        ApiResponse<List<Wallet>> resp = walletListWithHttpInfo(offset, max);
        return resp.getData();
    }

    /**
     * List Wallets
     * Retrieves a list of wallets on your account.
     * @param offset start offset (optional)
     * @param max max number results (optional, default to 10)
     * @return ApiResponse&lt;List&lt;Wallet&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Wallet>> walletListWithHttpInfo(Integer offset, Integer max) throws ApiException {
        com.squareup.okhttp.Call call = walletListValidateBeforeCall(offset, max, null, null);
        Type localVarReturnType = new TypeToken<List<Wallet>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Wallets (asynchronously)
     * Retrieves a list of wallets on your account.
     * @param offset start offset (optional)
     * @param max max number results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call walletListAsync(Integer offset, Integer max, final ApiCallback<List<Wallet>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = walletListValidateBeforeCall(offset, max, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Wallet>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for walletRGet
     * @param id start offset (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call walletRGetCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/wallet/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call walletRGetValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling walletRGet(Async)");
        }
        
        com.squareup.okhttp.Call call = walletRGetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Wallet
     * Retrieves a specific wallet.
     * @param id start offset (required)
     * @return Wallet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Wallet walletRGet(Long id) throws ApiException {
        ApiResponse<Wallet> resp = walletRGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Wallet
     * Retrieves a specific wallet.
     * @param id start offset (required)
     * @return ApiResponse&lt;Wallet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Wallet> walletRGetWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = walletRGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Wallet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Wallet (asynchronously)
     * Retrieves a specific wallet.
     * @param id start offset (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call walletRGetAsync(Long id, final ApiCallback<Wallet> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = walletRGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Wallet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

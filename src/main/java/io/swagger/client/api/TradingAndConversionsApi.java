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


import io.swagger.client.model.AcceptedQuote;
import io.swagger.client.model.Quote;
import io.swagger.client.model.QuoteRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradingAndConversionsApi {
    private ApiClient apiClient;

    public TradingAndConversionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TradingAndConversionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for quoteAccept
     * @param uuid The quote UUID you are accepting. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteAcceptCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/quote/accept/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call quoteAcceptValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling quoteAccept(Async)");
        }
        
        com.squareup.okhttp.Call call = quoteAcceptCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Accept Quote
     * Executes a quote.
     * @param uuid The quote UUID you are accepting. (required)
     * @return AcceptedQuote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AcceptedQuote quoteAccept(String uuid) throws ApiException {
        ApiResponse<AcceptedQuote> resp = quoteAcceptWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Accept Quote
     * Executes a quote.
     * @param uuid The quote UUID you are accepting. (required)
     * @return ApiResponse&lt;AcceptedQuote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AcceptedQuote> quoteAcceptWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = quoteAcceptValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<AcceptedQuote>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Accept Quote (asynchronously)
     * Executes a quote.
     * @param uuid The quote UUID you are accepting. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteAcceptAsync(String uuid, final ApiCallback<AcceptedQuote> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quoteAcceptValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AcceptedQuote>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for quoteCreate
     * @param body  (optional)
     * @param estimate Create estimate quote (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteCreateCall(QuoteRequest body, Boolean estimate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/quote";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (estimate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("estimate", estimate));

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
    private com.squareup.okhttp.Call quoteCreateValidateBeforeCall(QuoteRequest body, Boolean estimate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = quoteCreateCall(body, estimate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Quote
     * Creates a quote to convert between wallets.
     * @param body  (optional)
     * @param estimate Create estimate quote (optional, default to false)
     * @return Quote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Quote quoteCreate(QuoteRequest body, Boolean estimate) throws ApiException {
        ApiResponse<Quote> resp = quoteCreateWithHttpInfo(body, estimate);
        return resp.getData();
    }

    /**
     * Create Quote
     * Creates a quote to convert between wallets.
     * @param body  (optional)
     * @param estimate Create estimate quote (optional, default to false)
     * @return ApiResponse&lt;Quote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Quote> quoteCreateWithHttpInfo(QuoteRequest body, Boolean estimate) throws ApiException {
        com.squareup.okhttp.Call call = quoteCreateValidateBeforeCall(body, estimate, null, null);
        Type localVarReturnType = new TypeToken<Quote>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Quote (asynchronously)
     * Creates a quote to convert between wallets.
     * @param body  (optional)
     * @param estimate Create estimate quote (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteCreateAsync(QuoteRequest body, Boolean estimate, final ApiCallback<Quote> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quoteCreateValidateBeforeCall(body, estimate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Quote>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for quoteList
     * @param merchantId Merchant ID you are retrieving quotes from. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteListCall(String merchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/quote/{merchantId}"
            .replaceAll("\\{" + "merchantId" + "\\}", apiClient.escapeString(merchantId.toString()));

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
    private com.squareup.okhttp.Call quoteListValidateBeforeCall(String merchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling quoteList(Async)");
        }
        
        com.squareup.okhttp.Call call = quoteListCall(merchantId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Quotes
     * Retrieves all quotes on a specific Merchant ID.
     * @param merchantId Merchant ID you are retrieving quotes from. (required)
     * @return List&lt;Quote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Quote> quoteList(String merchantId) throws ApiException {
        ApiResponse<List<Quote>> resp = quoteListWithHttpInfo(merchantId);
        return resp.getData();
    }

    /**
     * List Quotes
     * Retrieves all quotes on a specific Merchant ID.
     * @param merchantId Merchant ID you are retrieving quotes from. (required)
     * @return ApiResponse&lt;List&lt;Quote&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Quote>> quoteListWithHttpInfo(String merchantId) throws ApiException {
        com.squareup.okhttp.Call call = quoteListValidateBeforeCall(merchantId, null, null);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Quotes (asynchronously)
     * Retrieves all quotes on a specific Merchant ID.
     * @param merchantId Merchant ID you are retrieving quotes from. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteListAsync(String merchantId, final ApiCallback<List<Quote>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quoteListValidateBeforeCall(merchantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Quote>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for quoteRead
     * @param uuid UUID of the quote you are retrieving. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quoteReadCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/quote/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
    private com.squareup.okhttp.Call quoteReadValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling quoteRead(Async)");
        }
        
        com.squareup.okhttp.Call call = quoteReadCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read Quote
     * Retrieves a specific quote.
     * @param uuid UUID of the quote you are retrieving. (required)
     * @return Quote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Quote quoteRead(String uuid) throws ApiException {
        ApiResponse<Quote> resp = quoteReadWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Read Quote
     * Retrieves a specific quote.
     * @param uuid UUID of the quote you are retrieving. (required)
     * @return ApiResponse&lt;Quote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Quote> quoteReadWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = quoteReadValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<Quote>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Quote (asynchronously)
     * Retrieves a specific quote.
     * @param uuid UUID of the quote you are retrieving. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quoteReadAsync(String uuid, final ApiCallback<Quote> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quoteReadValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Quote>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

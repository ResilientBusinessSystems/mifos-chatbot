/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client.api;

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


import io.swagger.client.model.GetSelfSavingsAccountsAccountIdChargesResponse;
import io.swagger.client.model.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse;
import io.swagger.client.model.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse;
import io.swagger.client.model.GetSelfSavingsAccountsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelfSavingsAccountApi {
    private ApiClient apiClient;

    public SelfSavingsAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SelfSavingsAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for retrieveAllSavingsAccountCharges
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAllSavingsAccountChargesCall(Long accountId, String chargeStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/self/savingsaccounts/{accountId}/charges"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (chargeStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("chargeStatus", chargeStatus));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveAllSavingsAccountChargesValidateBeforeCall(Long accountId, String chargeStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling retrieveAllSavingsAccountCharges(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveAllSavingsAccountChargesCall(accountId, chargeStatus, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetSelfSavingsAccountsAccountIdChargesResponse> retrieveAllSavingsAccountCharges(Long accountId, String chargeStatus) throws ApiException {
        ApiResponse<List<GetSelfSavingsAccountsAccountIdChargesResponse>> resp = retrieveAllSavingsAccountChargesWithHttpInfo(accountId, chargeStatus);
        return resp.getData();
    }

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return ApiResponse&lt;List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetSelfSavingsAccountsAccountIdChargesResponse>> retrieveAllSavingsAccountChargesWithHttpInfo(Long accountId, String chargeStatus) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAllSavingsAccountChargesValidateBeforeCall(accountId, chargeStatus, null, null);
        Type localVarReturnType = new TypeToken<List<GetSelfSavingsAccountsAccountIdChargesResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Savings Charges (asynchronously)
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAllSavingsAccountChargesAsync(Long accountId, String chargeStatus, final ApiCallback<List<GetSelfSavingsAccountsAccountIdChargesResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveAllSavingsAccountChargesValidateBeforeCall(accountId, chargeStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetSelfSavingsAccountsAccountIdChargesResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveSavings
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsCall(Long accountId, String chargeStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/self/savingsaccounts/{accountId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (chargeStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("chargeStatus", chargeStatus));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveSavingsValidateBeforeCall(Long accountId, String chargeStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling retrieveSavings(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveSavingsCall(accountId, chargeStatus, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve a savings account
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return GetSelfSavingsAccountsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSelfSavingsAccountsResponse retrieveSavings(Long accountId, String chargeStatus) throws ApiException {
        ApiResponse<GetSelfSavingsAccountsResponse> resp = retrieveSavingsWithHttpInfo(accountId, chargeStatus);
        return resp.getData();
    }

    /**
     * Retrieve a savings account
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return ApiResponse&lt;GetSelfSavingsAccountsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSelfSavingsAccountsResponse> retrieveSavingsWithHttpInfo(Long accountId, String chargeStatus) throws ApiException {
        com.squareup.okhttp.Call call = retrieveSavingsValidateBeforeCall(accountId, chargeStatus, null, null);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a savings account (asynchronously)
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     * @param accountId accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsAsync(Long accountId, String chargeStatus, final ApiCallback<GetSelfSavingsAccountsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveSavingsValidateBeforeCall(accountId, chargeStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveSavingsAccountCharge
     * @param accountId accountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsAccountChargeCall(Long accountId, Long savingsAccountChargeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "savingsAccountChargeId" + "\\}", apiClient.escapeString(savingsAccountChargeId.toString()));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveSavingsAccountChargeValidateBeforeCall(Long accountId, Long savingsAccountChargeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling retrieveSavingsAccountCharge(Async)");
        }
        
        // verify the required parameter 'savingsAccountChargeId' is set
        if (savingsAccountChargeId == null) {
            throw new ApiException("Missing the required parameter 'savingsAccountChargeId' when calling retrieveSavingsAccountCharge(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveSavingsAccountChargeCall(accountId, savingsAccountChargeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @return GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(Long accountId, Long savingsAccountChargeId) throws ApiException {
        ApiResponse<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> resp = retrieveSavingsAccountChargeWithHttpInfo(accountId, savingsAccountChargeId);
        return resp.getData();
    }

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @return ApiResponse&lt;GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountChargeWithHttpInfo(Long accountId, Long savingsAccountChargeId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveSavingsAccountChargeValidateBeforeCall(accountId, savingsAccountChargeId, null, null);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Savings account Charge (asynchronously)
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * @param accountId accountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsAccountChargeAsync(Long accountId, Long savingsAccountChargeId, final ApiCallback<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveSavingsAccountChargeValidateBeforeCall(accountId, savingsAccountChargeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveSavingsTransaction
     * @param accountId accountId (required)
     * @param transactionId transactionId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsTransactionCall(Long accountId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/self/savingsaccounts/{accountId}/transactions/{transactionId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveSavingsTransactionValidateBeforeCall(Long accountId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling retrieveSavingsTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling retrieveSavingsTransaction(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveSavingsTransactionCall(accountId, transactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve Savings Account Transaction
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     * @param accountId accountId (required)
     * @param transactionId transactionId (required)
     * @return GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse retrieveSavingsTransaction(Long accountId, Long transactionId) throws ApiException {
        ApiResponse<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> resp = retrieveSavingsTransactionWithHttpInfo(accountId, transactionId);
        return resp.getData();
    }

    /**
     * Retrieve Savings Account Transaction
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     * @param accountId accountId (required)
     * @param transactionId transactionId (required)
     * @return ApiResponse&lt;GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> retrieveSavingsTransactionWithHttpInfo(Long accountId, Long transactionId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveSavingsTransactionValidateBeforeCall(accountId, transactionId, null, null);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve Savings Account Transaction (asynchronously)
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     * @param accountId accountId (required)
     * @param transactionId transactionId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveSavingsTransactionAsync(Long accountId, Long transactionId, final ApiCallback<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveSavingsTransactionValidateBeforeCall(accountId, transactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

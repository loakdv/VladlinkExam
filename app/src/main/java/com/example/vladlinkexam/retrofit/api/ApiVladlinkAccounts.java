/*
 * Created by Dmitry Garmyshev on 14.07.20 14:52
 * Copyright (c) 2020 . All rights reserved.
 * Last modified 14.07.20 14:52
 *
 */

package com.example.vladlinkexam.retrofit.api;


import com.example.vladlinkexam.model.accounts.accountsList.MAccountsListData;
import com.example.vladlinkexam.model.accounts.oneAccount.MOneAccountData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiVladlinkAccounts {
    public static final String PREFIX= "/v1/public/users";

    @GET(PREFIX+"/my")
    @Headers("Content-Type: application/json")
    Call<MAccountsListData> getAccounts(@Header( "Authorization") String token);

    @GET(PREFIX+"/{account_id}")
    @Headers("Content-Type: application/json")
    Call<MOneAccountData> getAccountData(@Header( "Authorization") String token
    , @Path("account_id") long id);
}

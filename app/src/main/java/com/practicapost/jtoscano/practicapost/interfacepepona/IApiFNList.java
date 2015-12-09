package com.practicapost.jtoscano.practicapost.interfacepepona;

import com.practicapost.jtoscano.practicapost.models.FNListIn.FNListIn;
import com.practicapost.jtoscano.practicapost.models.rateplanin.RatePlanIn;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by jtoscano on 07/12/2015.
 */
public interface IApiFNList {
    @POST("/mimovistar/autogestion/json/ServiciosHTML/")
    @Headers({"Content-Type : text/plain","Authorization : Basic YXBwTWlNb3Zpc3RhcjojLk0xTTB2aXN0NHIuLg=="})
    void Authenticate(@Body FNListIn listIn, Callback<Response> responseCallback);
}

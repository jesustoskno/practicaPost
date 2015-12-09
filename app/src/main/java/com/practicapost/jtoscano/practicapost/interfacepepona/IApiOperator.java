package com.practicapost.jtoscano.practicapost.interfacepepona;

import com.practicapost.jtoscano.practicapost.models.getoperatorin.GetOperator;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by jtoscano on 07/12/2015.
 */
public interface IApiOperator {
    @POST("/mimovistar/autogestion/json/ServiciosHTML/")
    @Headers({"Content-Type : text/plain","Authorization : Basic YXBwTWlNb3Zpc3RhcjojLk0xTTB2aXN0NHIuLg=="})
    void Authenticate(@Body GetOperator getOperator, Callback<Response> responseCallback);
}
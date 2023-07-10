package com.example.currencyconversion.network;

import com.example.currencyconversion.model.Currency;
import com.example.currencyconversion.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {
    @GET("v1/latest")
    Call<Currency> fetchCurrency(@Query("apikey") String apikey);
}

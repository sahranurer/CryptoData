package com.sahraer.kriptoproject.service


import com.sahraer.kriptoproject.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //GTE,UPDATE,POST

    //https://api.nomics.com/v1/
    // prices?key=57282e966725bbe4cd84c63f1d66385373103fee&ids=BTC,ETH,XRP&interval=1d,30d&convert=EUR&platform-currency=ETH&per-page=100&page=1


    @GET("prices?key=57282e966725bbe4cd84c63f1d66385373103fee&ids=BTC,ETH,XRP&interval=1d,30d&convert=EUR&platform-currency=ETH&per-page=100&page=1")
    fun getData() : Observable<List<CryptoModel>>
    //fun getData(): Call<List<CryptoModel>>

}
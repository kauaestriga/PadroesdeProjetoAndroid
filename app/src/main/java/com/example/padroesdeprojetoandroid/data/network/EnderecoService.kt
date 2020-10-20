package com.example.padroesdeprojetoandroid.data.network

import com.example.padroesdeprojetoandroid.model.Endereco
import retrofit2.Call
import retrofit2.http.GET

interface EnderecoService {

    @GET("/ws/{cep}/json")
    fun pesquisar(cep: String): Call<Endereco>

}
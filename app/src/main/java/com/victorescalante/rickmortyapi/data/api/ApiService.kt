package com.victorescalante.rickmortyapi.data.api

import com.victorescalante.rickmortyapi.data.dto.Characters
import com.victorescalante.rickmortyapi.util.Constants
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getCharacters(): Characters

}
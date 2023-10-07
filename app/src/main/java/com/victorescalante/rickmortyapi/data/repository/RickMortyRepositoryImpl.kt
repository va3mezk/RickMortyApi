package com.victorescalante.rickmortyapi.data.repository

import com.victorescalante.rickmortyapi.data.api.ApiService
import com.victorescalante.rickmortyapi.data.dto.Characters
import com.victorescalante.rickmortyapi.domain.repository.RickMortyRepository
import javax.inject.Inject

class RickMortyRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    RickMortyRepository {
    override suspend fun getCharacters(): Characters = apiService.getCharacters()
}
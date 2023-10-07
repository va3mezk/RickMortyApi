package com.victorescalante.rickmortyapi.domain.repository

import com.victorescalante.rickmortyapi.data.dto.Characters

interface RickMortyRepository {
    suspend fun getCharacters(): Characters
}
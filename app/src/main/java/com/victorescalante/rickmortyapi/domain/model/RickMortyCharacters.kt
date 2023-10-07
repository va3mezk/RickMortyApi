package com.victorescalante.rickmortyapi.domain.model

import com.victorescalante.rickmortyapi.data.dto.Location
import com.victorescalante.rickmortyapi.data.dto.Origin
import com.victorescalante.rickmortyapi.data.dto.Result

data class RickMortyCharacters(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun Result.toDomain() = RickMortyCharacters(
    created = created,
    episode = episode,
    gender = gender,
    id=id,
    image=image,
    location=location,
    name=name,
    origin=origin,
    species=species,
    status=status,
    type=type,
    url=url
)
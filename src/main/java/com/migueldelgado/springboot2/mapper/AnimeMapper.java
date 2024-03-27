package com.migueldelgado.springboot2.mapper;

import com.migueldelgado.springboot2.domain.Anime;
import com.migueldelgado.springboot2.requests.AnimePostRequestBody;
import com.migueldelgado.springboot2.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePostRequestBody);
}

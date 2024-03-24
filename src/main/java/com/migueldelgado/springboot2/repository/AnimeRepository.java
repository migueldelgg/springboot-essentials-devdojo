package com.migueldelgado.springboot2.repository;

import com.migueldelgado.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}

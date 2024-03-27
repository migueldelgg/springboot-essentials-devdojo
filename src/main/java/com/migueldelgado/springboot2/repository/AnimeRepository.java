package com.migueldelgado.springboot2.repository;

import com.migueldelgado.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

    public List<Anime> findByName(String name);
}

package com.migueldelgado.springboot2;

import com.migueldelgado.springboot2.service.AnimeService;

public class TESTE {
    public static void main(String[] args) {
        AnimeService animeService = new AnimeService();

        System.out.println(animeService.listAll());
    }
}

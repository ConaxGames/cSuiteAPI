package com.conaxgames.api.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Language {

    ENGLISH("English", Arrays.asList("en_gb", "en_nz", "en_us", "en_ca")),
    FRENCH("French", Collections.singletonList("fr_fr")),
    ITALIAN("Italian", Collections.singletonList("it_it")),
    SPANISH("Spanish", Collections.singletonList("es_es")),
    PIRATE("Pirate", Collections.singletonList("en_pt")); // i had too :>

    private final String name;
    private final List<String> locale;

    public static Language getLanguageFromClientLocale(String clientLocale) {
        return Arrays.stream(values()).filter(language -> language.getLocale().contains(clientLocale)).findFirst().orElse(null);
    }
}

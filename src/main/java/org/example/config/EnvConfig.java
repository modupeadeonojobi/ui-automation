package org.example.config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * @author iModupsy
 * @created 08/09/2025
 */
public class EnvConfig {

    private static final Dotenv dotenv = Dotenv.load();

    public static String get(final String key) {
        return dotenv.get(key);
    }
}

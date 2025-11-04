package com.projects.f1leagueback;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class F1leaguebackApplicationTests {

    // Spring inyectará el valor de MONGODB_URI del .env
    @Value("${MONGODB_URI}")
    private String mongoUri;

    // Spring inyectará el valor de MONGO_DB del .env
    @Value("${MONGO_DB}")
    private String databaseName;

    @Test
    void testMongoPropertiesAreLoaded() {
        // Asegúrate de que los valores no sean nulos
        assertNotNull(mongoUri, "MONGODB_URI no debería ser nulo");
        assertNotNull(databaseName, "MONGO_DB no debería ser nulo");

        // Puedes verificar parte del contenido (opcional)
        assertTrue(mongoUri.contains("mongodb+srv://juan:milton@"), "La URI debe contener el usuario y contraseña");
        assertEquals("f1league", databaseName, "El nombre de la base de datos debe ser 'f1league'");
    }
}
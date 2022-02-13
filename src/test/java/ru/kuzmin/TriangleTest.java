package ru.kuzmin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @Tag("positive")
    @DisplayName("Позитивный тест площади треугольника")
    void getSquareTest() {
        logger.info("Лог 1");
        assertEquals(6, App.getSquare(3, 4, 5));
    }

    @Test
    @Tag("negative")
    @DisplayName("Передаем ноль")
    void getNullTest() {
        logger.info("Лог 2");
        assertEquals(0, App.getNull(0, 3, 3));
    }

    @Test
    @Tag("negative")
    @DisplayName("Передаем отрицательное значение")
    void getNegativeTest() {
        logger.info("Лог 3");
        assertFalse(App.getNegative(1, -3, 1));
    }

    @Test
    @Tag("negative")
    @DisplayName("Проверка существования треугольника")
    void getTriangleTest() {
        logger.info("Лог 4");
        assertTrue(App.getTriangle(3, 3, 3));
    }

}
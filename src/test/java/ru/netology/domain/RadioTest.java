//package ru.netology.domain;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RadioTest {
//
//    @Test
//    void SelectCurrentStationZero() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(0);
//        int expected = 0;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationOne() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(1);
//        int expected = 1;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationMinus() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(-1);
//        int expected = 0;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationAverage() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(5);
//        int expected = 5;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationPenult() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(8);
//        int expected = 8;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationLast() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(9);
//        int expected = 9;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void SelectCurrentStationBeyond() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(10);
//        int expected = 0;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    // Использование кнопки Next
//    @Test
//    void usingButtonNextReturnToZero() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(9);
//        radio.nextStations();
//        int expected = 0;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void usingButtonNextSwitchNext() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(1);
//        radio.nextStations();
//        int expected = 2;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    // Использование кнопки Prev
//    @Test
//    void usingButtonPrevBackToLast() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(0);
//        radio.prevStations();
//        int expected = 9;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void usingButtonPrevBelowLast() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(9);
//        radio.prevStations();
//        int expected = 8;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void usingButtonSwitchToStart() {
//        Radio radio = new Radio();
//        radio.setCurrentStations(1);
//        radio.prevStations();
//        int expected = 0;
//        int actual = radio.getCurrentStations();
//
//        assertEquals(expected, actual);
//    }
//
//    // Увеличение звука. Кнопка +
//    @Test
//    void increaseVolumeMax() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(9);
//        radio.increaseVolume();
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void increaseVolumeStayOnMax() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(10);
//        radio.increaseVolume();
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void increaseVolumeAboveMax() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(11);
//        radio.increaseVolume();
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    // Уменьшение звука. Кнопка -
//    @Test
//    void decreaseVolumeMin() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(1);
//        radio.decreaseVolume();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void decreaseVolumeStayOnMin() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//        radio.decreaseVolume();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void decreaseVolumeBeyondLimitZero() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-1);
//        radio.decreaseVolume();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//}

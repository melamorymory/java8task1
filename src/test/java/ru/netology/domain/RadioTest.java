package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseVolumeFrom33To34() {
        Radio radio = new Radio(33);
        int expected = 34;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeFrom100() {
        Radio radio = new Radio(100);
        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom33To32() {
        Radio radio = new Radio(33);
        int expected = 32;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeFrom0() {
        Radio radio = new Radio(0);
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentVolume(expected);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeOverMax() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(120);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-20);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannel() {
        Radio radio = new Radio(7, 15);
        int expected = 8;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannel() {
        Radio radio = new Radio(7, 15);
        int expected = 6;
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFromMaxTo0Channel() {
        Radio radio = new Radio(14, 15);
        int expected = 0;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0ToMaxChannel() {
        Radio radio = new Radio(0, 15);
        int expected = 14;
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentChannel() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentChannel(expected);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelOverMax() {
        Radio radio = new Radio(5, 15);
        int expected = 5;
        radio.setCurrentChannel(20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelUnderMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(-20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }
}
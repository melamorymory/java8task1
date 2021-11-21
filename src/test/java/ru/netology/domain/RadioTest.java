package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseVolumeFrom33To34() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        radio.increaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom33To32() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        radio.decreaseVolume();
        int expected = 32;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeFrom0() {
        Radio radio = new Radio();
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
        Radio radio = new Radio(15);
        radio.setCurrentChannel(7);
        radio.increaseChannel();
        int expected = 8;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannel() {
        Radio radio = new Radio(15);
        radio.setCurrentChannel(7);
        radio.decreaseChannel();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFromMaxTo0Channel() {
        Radio radio = new Radio(15);
        radio.setCurrentChannel(14);
        radio.increaseChannel();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0ToMaxChannel() {
        Radio radio = new Radio(15);
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        int expected = 14;
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
        Radio radio = new Radio(15);
        int expected = 0;
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
package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseVolumeFrom0To1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeFrom10() {
        Radio radio = new Radio();
        int expected = 10;
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom2To1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannel() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseChannelOverMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        int expected = 9;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannel() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseChannel();
        radio.increaseChannel();
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseChannelUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        int expected = 0;
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom9To0Channel() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(9);
        radio.transitFrom9To0Channel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotTransitFrom9To0Channel() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentChannel(5);
        radio.transitFrom9To0Channel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0To9Channel() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentChannel(0);
        radio.transitFrom0To9Channel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotTransitFrom0To9Channel() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentChannel(5);
        radio.transitFrom0To9Channel();
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
        Radio radio = new Radio();
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
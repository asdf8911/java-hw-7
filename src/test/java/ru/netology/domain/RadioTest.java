package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldSetQuantityRStation() {
        Radio radio = new Radio(30);
        Radio radio1 = new Radio(14);

        assertEquals(30, radio.getQuantityRStation());
        assertEquals(14, radio1.getQuantityRStation());
    }

    @Test
    void showNumCurrentRStation() { // 1
        Radio radio = new Radio();

        radio.getNumCurrentRStation();

        int actual = radio.getNumCurrentRStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showStationAfterIncreaseBorder1() { // 2.1
        Radio radio = new Radio();
        radio.setNumCurrentRStation(9);

        radio.nextRStation();

        int actual = radio.getNumCurrentRStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showStationAfterIncreaseBorder2() { // 2.2
        Radio radio = new Radio();
        radio.setNumCurrentRStation(0);

        radio.nextRStation();

        int actual = radio.getNumCurrentRStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void showStationAfterDecrease1() { // 3.1
        Radio radio = new Radio();
        radio.setNumCurrentRStation(0);

        radio.prevRStation();

        int actual = radio.getNumCurrentRStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void showStationAfterDecrease2() { // 3.2
        Radio radio = new Radio();
        radio.setNumCurrentRStation(1);

        radio.prevRStation();

        int actual = radio.getNumCurrentRStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showNewNumCurrentRStation() { // 4.1
        Radio radio = new Radio();

        radio.setNumCurrentRStation(9);

        int actual = radio.getNumCurrentRStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void showNewNumCurrentRStationFatalOne() { // 4.2
        Radio radio = new Radio();

        radio.setNumCurrentRStation(20);

        int actual = radio.getNumCurrentRStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showNewNumCurrentRStationFatalTwo() { // 4.3
        Radio radio = new Radio();

        radio.setNumCurrentRStation(-1);

        int actual = radio.getNumCurrentRStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showGetCurrentVolume() { // 5
        Radio radio = new Radio();

        radio.getCurrentVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showSetCurrentVolume1() { // 6.1
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void showSetCurrentVolume2() { // 6.2
        Radio radio = new Radio();

        radio.setCurrentVolume(111);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showSetCurrentVolume3() { // 6.3
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void showVolumeAfterIncreaseByOne1() { // 7.1
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolumeByOne();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void showVolumeAfterIncreaseByOne2() { // 7.2
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolumeByOne();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void showVolumeAfterDecreaseByOne1() { // 8.1
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolumeByOne();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void showVolumeAfterDecreaseByOne2() { // 8.2
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolumeByOne();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}

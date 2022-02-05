package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // @ParameterizedTest
    //  @CsvSource(value = {
    //         "adding a channel,2,2",
    //})
    // void getCurrentChanel(String testName, int currentChanel, int expected) {
    //   Radio radio = new Radio();
    // radio.setCurrentChanel(currentChanel);

    // assertEquals(expected, radio.getCurrentChanel());
    //}

    @ParameterizedTest
    @CsvSource(value = {

            "limit values,10,0",
            "limit values,0,0",
    })
    void setCurrentChanel1(String testName, int currentChanel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        assertEquals(expected, radio.getCurrentChanel());


    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,9,0",
    })
    void next(String testName, int currentChanel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.next();
        assertEquals(expected, radio.getCurrentChanel());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,1,0",
    })
    void prev(String testName, int currentChanel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.prev();
        assertEquals(expected, radio.getCurrentChanel());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "adding a volume,5,5",
    })
    void getCurrentVolume(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,-1,0",
            "limit values,0,0",
            "limit values,1,1",
            "limit values,9,9",
            "limit values,101,0"
    })
    void setCurrentVolume(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,1",
            "limit values,1,2",
            "limit values,9,10",
    })
    void up(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.up();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,10,9",
            "limit values,1,0",

    })
    void down(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.down();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,11,11",
            "limit values,9,9",
            "limit values,10,10",

    })
    void setNumberChanel(String testName, int numberChanel, int expected) {
        Radio radio = new Radio();
        radio.setNumberChanel(numberChanel);
        assertEquals(expected, radio.getNumberChanel());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,11,10,10",
            "limit values,9,8,8",
            "limit values,10,9,9",

    })
    void setMaxChanelString( String testName, int numberChanel, int maxChanel, int expected ) {
        Radio radio = new Radio();
        radio.setNumberChanel(numberChanel);
        radio.setMaxChanel(maxChanel);
        assertEquals(expected, radio.getMaxChanel());
    }
}
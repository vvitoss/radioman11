package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

 //   Radio radio = new Radio();


    //   @ParameterizedTest
    // @CsvSource(value = )

    // @ParameterizedTest
    //  @CsvSource(value = {
    //         "adding a channel,2,2",
    //})
    // void getCurrentChanel(String testName, int currentChanel, int expected) {
    //   Radio radio = new Radio();
    // radio.setCurrentChanel(currentChanel);

    // assertEquals(expected, radio.getCurrentChanel())
    //}

    @ParameterizedTest
    @CsvSource(value = {

            "entering values,1,0,1",
            "entering values,10,9,10",
            "entering values,11,10,11",
    })
    void numberChanel(String testname, int numberChanel, int maxChanel, int expected) {
        Radio radio = new Radio(numberChanel, maxChanel);

        assertEquals(expected, radio.getNumberChanel());

    }

    @ParameterizedTest
    @CsvSource(value = {

            "entering values,1,0,0",
            "entering values,10,9,9",
            "entering values,11,10,10",
    })
    void maxChanel(String testname, int numberChanel, int maxChanel, int expected) {
        Radio radio = new Radio(numberChanel, maxChanel);

        assertEquals(expected, radio.getMaxChanel());

    }
   // @ParameterizedTest
   // @CsvSource (value = {
     //       "examination,10,9",
     //       "examination,11,10",
      //      "examination,9,8",
 //   } )
   // void maxChanel(int numberChanel, int maxChanel, int expected ) {
   //     Radio radio = new Radio(numberChanel, maxChanel);
       // radio.setCurrentChanel();
       // this.maxChanel(maxChanel);
      //  assertEquals(expected, maxChanel );
 //  }
   Radio radio = new Radio();


    @ParameterizedTest
    @CsvSource(value = {

            "limit values,10,0",
            "limit values,0,0",
    })
    void setCurrentChanel1(String testname, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        assertEquals(expected, radio.getCurrentChanel());


    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,9,0",
    })
    void next(String testname, int currentChanel, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.next();
        assertEquals(expected, radio.getCurrentChanel());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,1,0",
    })
    void prev(String testname, int currentChanel, int expected) {
         // Radio radio = new Radio();
        radio.setCurrentChanel(currentChanel);
        radio.prev();
        assertEquals(expected, radio.getCurrentChanel());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "adding a volume,5,5",
    })
    void getCurrentVolume(String testname, int currentVolume, int expected) {
        // Radio radio = new Radio();
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
    void setCurrentVolume(String testname, int currentVolume, int expected) {
        // Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,1",
            "limit values,1,2",
            "limit values,9,10",
    })
    void up(String testname, int currentVolume, int expected) {
        //Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.up();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,10,9",
            "limit values,1,0",

    })
    void down(String testname, int currentVolume, int expected) {
       // Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.down();
        assertEquals(expected, radio.getCurrentVolume());
    }

    //  @ParameterizedTest
    //  @CsvSource(value = {
    //         "limit values,11,11",
    //        "limit values,9,9",
    //        "limit values,10,10",

    // })
    //  void setNumberChanel(String testName, int numberChanel, int expected) {
    //     Radio radio = new Radio();
    //     radio.setNumberChanel(numberChanel);
    //     assertEquals(expected, radio.getNumberChanel());
    //  }

    //  @ParameterizedTest
    // @CsvSource(value = {
    //      "limit values,11,10,10",
    //      "limit values,9,8,8",
    //    "limit values,10,9,9",

    //  })
    // void setMaxChanelString(String testName, int numberChanel, int maxChanel, int expected) {
    //     Radio radio = new Radio();
    //     radio.setNumberChanel(numberChanel);
    //      radio.setMaxChanel(maxChanel);
    //       assertEquals(expected, radio.getMaxChanel());
    //}
}
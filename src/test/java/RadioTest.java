import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void station6() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNotExistOver() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNotExistBelow() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void station8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void station1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume33() {
        Radio radio = new Radio();

        radio.setCurrentVolume(33);

        int actual = radio.getCurrentVolume();
        int expected = 33;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeNotExistBelow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeNotExistOver() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev5() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }







    @Test
    public void next1_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next28_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(28);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next29_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next0_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev5_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev1_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev0_30() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }
}
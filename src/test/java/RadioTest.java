import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioStationSelection() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void minimumBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(100);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessSoundBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-7);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void macsimumLoveLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        int expected = 33;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beyondTheBoundsOfLoudness() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationForward() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperLimitOfSwitchingStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerLimitOfSwitchingStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchBackToTheStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerLimitOfSwitchingStationBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperLimitOfSwitchingStationBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void makeLouder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.volumeUp();
        int ecpected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(ecpected, actual);

    }

    @Test
    public void addSoundAtTheTop() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();
        int ecpected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(ecpected, actual);

    }
    @Test
    public void turnDownTheVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.volumeDown();
        int ecpected = 89;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(ecpected, actual);

    }
    @Test
    public void turnDownTheVolumeAtTheBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        int ecpected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(ecpected, actual);

    }
    @Test
    public void maximumStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        int ecpected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(ecpected, actual);

    }
    @Test
    public void minimumStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        int ecpected = 0;
        int actual = radio.getMinStation();
        Assertions.assertEquals(ecpected, actual);

    }
    @Test
    public void minimumVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        int ecpected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(ecpected, actual);

    }

    @Test
    public void maximumVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        int ecpected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(ecpected, actual);

    }

    @Test
    public void shouldSetRadioStationConstructor() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int ecpected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(ecpected, actual);

    }
}
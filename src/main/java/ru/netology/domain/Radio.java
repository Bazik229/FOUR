package ru.netology.domain;

public class Radio {
    private int numRadioStation;
    private int valueVolume;

    public void nextRadioStation() {
        int maxRadioStation = 9;
        numRadioStation++;
        if (numRadioStation > maxRadioStation) {
            numRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        int minRadioStation = 0;
        numRadioStation--;
        if (numRadioStation < minRadioStation) {
            numRadioStation = 9;
        }
    }

    public void increaseVolume() {
        int maxVolume = 10;
        if (valueVolume < maxVolume) {
            valueVolume++;
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (valueVolume > minVolume) {
            valueVolume--;
        }
    }


    public int getNumRadioStation() {
        return numRadioStation;
    }

    public void setNumRadioStation(int numRadioStation) {
        if (numRadioStation <= 9 && numRadioStation >= 0)
            this.numRadioStation = numRadioStation;
    }

    public int getValueVolume() {
        return valueVolume;
    }

    public void setValueVolume(int valueVolume) {
        if (valueVolume <= 10 && valueVolume >= 0)
            this.valueVolume = valueVolume;
    }
}

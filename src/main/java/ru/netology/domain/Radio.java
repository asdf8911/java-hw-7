package ru.netology.domain;

public class Radio {

    private int numCurrentRStation;
    private int currentVolume;
//только локальные переменные можно создавать пустыми, незаполненными
//все остальные переменные автоматически заполняются

    public int getNumCurrentRStation() { // 1 ном. текущ станции от 0 до 9
        return numCurrentRStation;
    }

    public void nextRStation() { // 2 next station
        if (numCurrentRStation < 9) {
            numCurrentRStation = numCurrentRStation + 1;
        } else {
            numCurrentRStation = 0;
        }
    }

    public void prevRStation() { // 3 prev station
        if (numCurrentRStation > 0) {
            numCurrentRStation = numCurrentRStation - 1;
        } else {
            numCurrentRStation = 9;
        }
    }

    public void setNumCurrentRStation(int newNumCurrentRStation) { // 4 указание номера станции
        if (newNumCurrentRStation < 0) {
            return;
        }
        if (newNumCurrentRStation > 9) {
            return;
        }
        numCurrentRStation = newNumCurrentRStation;
    }

    public int getCurrentVolume() { // 5
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // 6
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeByOne() { // 7
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolumeByOne() { // 8
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}

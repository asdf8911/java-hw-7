package ru.netology.domain;

public class Radio {
    private int quantityRStation = 10;   // кол-во радиостанций - ТРЕБОВАНИЕ 1
    private int numCurrentRStation; // номер радиостанции
    private int currentVolume;      // громкость
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;

    public Radio() { // конструктор по умолчанию
    }
    public Radio(int quantityRStation) { // конструктор для указания кол-ва радиостанций
        this.quantityRStation = quantityRStation;
    }

    public int getQuantityRStation() {
        return quantityRStation;
    }

    public int getNumCurrentRStation() { // 1 ном. текущ станции от 0 до кол-ва радиостанций - 1
        return numCurrentRStation;
    }

    public void nextRStation() { // 2 next station - ТРЕБОВАНИЕ 3 СОБЛЮДАЕТСЯ
        if (numCurrentRStation < quantityRStation - 1) {
            numCurrentRStation = numCurrentRStation + 1;
        } else {
            numCurrentRStation = 0;
        }
    }

    public void prevRStation() { // 3 prev station - ТРЕБОВАНИЕ 4 СОБЛЮДАЕТСЯ
        if (numCurrentRStation > 0) {
            numCurrentRStation = numCurrentRStation - 1;
        } else {
            numCurrentRStation = quantityRStation - 1;
        }
    }

    public void setNumCurrentRStation(int newNumCurrentRStation) { // 4 указание номера станции - ТРЕБОВАНИЕ 2
        if (newNumCurrentRStation < 0) {
            return;
        }
        if (newNumCurrentRStation > quantityRStation - 1) {
            return;
        }
        numCurrentRStation = newNumCurrentRStation;
    }

    public int getCurrentVolume() { // 5
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // 6
        if (currentVolume < minCurrentVolume) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeByOne() { // 7
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolumeByOne() { // 8
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}

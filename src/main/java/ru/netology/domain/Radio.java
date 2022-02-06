package ru.netology.domain;

public class Radio {
    private int currentStations;
    private int currentVolume;
    private int maxNumberStations = 10;

    public int getCurrentStations() {
        return this.currentStations;
    }

    public void setCurrentStations(int currentStations) {
        if (currentStations < 0) {
            return;
        }
        if (currentStations > 9) {
            return;
        }
        this.currentStations = currentStations;
    }

    public void nextStations() {
        if (currentStations == 9) {
            this.currentStations = 0;
            return;
        }
        this.currentStations++;
    }

    public void prevStations() {
        if (currentStations == 0) {
            this.currentStations = 9;
            return;
        }
        this.currentStations--;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }
}

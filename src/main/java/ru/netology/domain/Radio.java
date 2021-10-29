package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel;
    private int maxVolume = 10;
    private int minVolume;

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
    }

    public void transitFrom9To0Channel() {
        if (currentChannel == 9) {
            currentChannel = 0;
        }
    }

    public void transitFrom0To9Channel() {
        if (currentChannel == 0) {
            currentChannel = 9;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}

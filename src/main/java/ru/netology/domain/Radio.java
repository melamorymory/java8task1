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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
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

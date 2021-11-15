package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int channelCount = 10;
    private int minChannel;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Radio(int currentChannel, int channelCount) {
        this.currentChannel = currentChannel;
        this.channelCount = channelCount;
    }

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
        if (currentChannel == channelCount - 1) {
            currentChannel = minChannel;
        }
        else {
            currentChannel = currentChannel + 1;
        }

    }

    public void decreaseChannel() {
        if (currentChannel == minChannel) {
            currentChannel = channelCount - 1;
        }
        else {
            currentChannel = currentChannel - 1;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > channelCount - 1) {
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

package com.offer24.adhost.factory;

public class MP3 implements AudioPlayer{
    @Override
    public void play() {
        System.out.println("Playing MP3");
    }

    @Override
    public double getBitrate() {
        return 32.0;
    }

    @Override
    public void geyPlaybackInfo() {
        System.out.println("playback info: " + MediaTypes.MP3);

    }
}

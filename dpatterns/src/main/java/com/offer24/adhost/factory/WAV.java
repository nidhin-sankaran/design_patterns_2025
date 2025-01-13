package com.offer24.adhost.factory;

public class WAV implements  AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing WAV");
    }

    @Override
    public double getBitrate() {
        return 64.0;
    }

    @Override
    public void geyPlaybackInfo() {
        System.out.println("playback info:" + MediaTypes.WAV);

    }
}

package com.offer24.adhost.factory;

public class FLAC implements  AudioPlayer{
    @Override
    public void play() {
        System.out.println("FLAC");
    }

    @Override
    public double getBitrate() {
        return 16.0;
    }

    @Override
    public void geyPlaybackInfo() {
        System.out.println("playback info: " + MediaTypes.FLAC);

    }
}

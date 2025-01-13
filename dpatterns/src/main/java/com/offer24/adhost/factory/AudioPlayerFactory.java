package com.offer24.adhost.factory;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaTypes mediaType) {
        switch (mediaType) {
            case MP3:
                return new MP3();
            case WAV:
                return new WAV();
            case FLAC:
                return new FLAC();
            default:
                return null;
        }
    }
}

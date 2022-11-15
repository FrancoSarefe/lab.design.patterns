package com.bootcamp.patterns.lab.exercise4;

import com.bootcamp.patterns.lab.exercise4.interfaces.AdvancedMediaPlayer;
import com.bootcamp.patterns.lab.exercise4.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter() {

	}

	public void setMediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(MediaType type) {

		switch (type) {

		case MP3:
			System.out.println("Media Player is MP3");
			break;
		case MP4:
			advancedMediaPlayer.playMP4();
			break;
		case VLC:
			advancedMediaPlayer.playVLC();
			break;
		default:
			System.out.println("Unsupported media file");
		}
	}

}

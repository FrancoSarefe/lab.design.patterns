package com.bootcamp.patterns.lab.exercise4;

import com.bootcamp.patterns.lab.exercise4.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("VLC-PLAYER: Media Player is VLC");

	}

	@Override
	public void playMP4() {
		System.out.println("VLC-PLAYER: Media Player is MP4");

	}

}

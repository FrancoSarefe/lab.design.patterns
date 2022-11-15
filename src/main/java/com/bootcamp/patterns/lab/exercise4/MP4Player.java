package com.bootcamp.patterns.lab.exercise4;

import com.bootcamp.patterns.lab.exercise4.interfaces.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("MP4-PLAYER: Media Player is VLC");

	}

	@Override
	public void playMP4() {
		System.out.println("MP4-PLAYER: Media Player is MP4");

	}

}

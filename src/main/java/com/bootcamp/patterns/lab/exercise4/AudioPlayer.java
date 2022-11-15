package com.bootcamp.patterns.lab.exercise4;

import com.bootcamp.patterns.lab.exercise4.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;

	@Override
	public void play(MediaType type) {
		mediaAdapter.play(type);
	}

	public AudioPlayer(MediaAdapter mediaAdapter) {

		this.mediaAdapter = mediaAdapter;
	}

}

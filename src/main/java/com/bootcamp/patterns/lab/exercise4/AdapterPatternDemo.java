package com.bootcamp.patterns.lab.exercise4;

import com.bootcamp.patterns.lab.exercise4.interfaces.AdvancedMediaPlayer;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		AdvancedMediaPlayer mp4 = new MP4Player();
		AdvancedMediaPlayer vlc = new VLCPlayer();

		System.out.println("MP4 PLAYER");

		MediaAdapter adapter = new MediaAdapter();
		adapter.setMediaAdapter(mp4);
		adapter.play(MediaType.MP3);
		adapter.play(MediaType.MP4);
		adapter.play(MediaType.VLC);

		System.out.println();

		System.out.println("AUDIO PLAYER");
		AudioPlayer audioPlayer = new AudioPlayer(adapter);
		audioPlayer.play(MediaType.MP3);
		audioPlayer.play(MediaType.MP4);
		audioPlayer.play(MediaType.VLC);

		System.out.println();

		System.out.println("VLC PLAYER");

		adapter.setMediaAdapter(vlc);
		adapter.play(MediaType.MP3);
		adapter.play(MediaType.MP4);
		adapter.play(MediaType.VLC);

		System.out.println();

		System.out.println("AUDIO PLAYER");
		audioPlayer.play(MediaType.MP3);
		audioPlayer.play(MediaType.MP4);
		audioPlayer.play(MediaType.VLC);
	}

}

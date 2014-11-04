package com.br.italogas.testproject.designpatterns.adapter;

public class AdapterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Back In Black.mp3");
		audioPlayer.play("mp4", "Riders on the storm.mp4");
		audioPlayer.play("vlc", "Maldito hippie sujo.vlc");
		audioPlayer.play("avi", "Dois coracoes.avi");

	}

}

package com.br.italogas.testproject.designpatterns.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} 
		else {
			System.out.println("invalid media. " + audioType + " format not supported");
		}

	}

}

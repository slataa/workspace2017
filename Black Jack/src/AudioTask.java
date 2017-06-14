

import java.io.*;

public class AudioTask implements Runnable
{

	public void run()
	{
		String audioFilePath = "src/Recording_2_.wav";
		AudioPlayerExample1 player = new AudioPlayerExample1();
		player.play(audioFilePath);
	}
}

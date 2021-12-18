import java.util.Random;

import se.lth.cs.window.SimpleWindow;

public class TurtleRace {

	public static void main(String[] args) {

		SimpleWindow w = new SimpleWindow(1000, 900, "turtle race");//fönstret
		//turtel start and finish lines
		RaceTrack R= new RaceTrack(600, 200);
		R.draw(w);
		//second turtle
		Turtle t2= new Turtle(w, 200,R.yStart);

		//first turtle
		Turtle t1= new Turtle (w, 600,R.yStart);

		//n to connect the racingeevent with the race
		RacingEvent n= new RacingEvent(R, t1, t2);

	//run the program
		while (true) {
			w.waitForMouseClick();
			n.race();
		}


	}


}

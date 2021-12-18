import java.util.Random;
import se.lth.cs.window.SimpleWindow;

public class RacingEvent {
	
	private Turtle t1;
	private Turtle t2;
	private RaceTrack track;
	private int step = 2;
	
//the race has these elements
	public RacingEvent(RaceTrack track, Turtle t1, Turtle t2){
		this.track= track;
		this.t1= t1;
		this.t2= t2;
	}
	
	public void race() {
		Random rand = new Random();
//		set the pen down
		t2.penDown();
		t1.penDown();

//		how to win
		while(! (t1.getY() < track.yFinish || t2.getY() < track.yFinish )) {
			SimpleWindow.delay(5);
			t1.forward(rand.nextInt(step));
			t2.forward(rand.nextInt(step));
		}
			
		}
	
	}


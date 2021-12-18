import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
	
	public int yStart;
	public int yFinish;

	// cord for start and finish
	public RaceTrack (int yStart, int yFinish){
		this.yStart= yStart;

		this.yFinish= yFinish;
	}
//the two lines start and finish
	public void draw(SimpleWindow w) {
		Turtle t= new Turtle(w, 200, 300);
		
		t.penDown();
		t.jumpTo(700, 600);
		t.left(90);
		t.forward(600);
		
		t.jumpTo(700, 200);
		t.forward(600);

					
	}
}

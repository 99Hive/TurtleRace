import se.lth.cs.window.SimpleWindow;

public class Turtle {

	/** skapar en sköldpadda som ritar i ritfönstret w. 
      Från början befinner sig sköldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt uppåt i fönstret, dvs i negativ y-riktning  
	 */

	private double xHome;
	private double yHome;
	private boolean pen;
	private SimpleWindow w;
	private double a=(Math.PI/2) ;

	Turtle(SimpleWindow w, int xHome, int yHome) {
		this.xHome= xHome;
		this.yHome= yHome;
		this.w= w;
	}

	/** sänker pennan */
	void penDown() {
		pen = true;
	}

	/** lyfter pennan */
	void penUp() {
		pen = false;
	}

	/** går rakt framåt n pixlar i huvudets riktning */
	void forward(int n) {
		w.moveTo((int) Math.round(xHome), (int) Math.round(yHome));
		xHome = (int) (xHome +(n*Math.cos(a))) ;
		yHome=  (int) (yHome -(n*Math.sin(a))) ;
		if(pen) {
			w.lineTo((int) Math.round(xHome), (int) Math.round(yHome));
		}
	}

	/** vrider huvudet beta grader åt vänster */
	void left(int beta) {
		a= a+ beta* (Math.PI/180) ;
	}

	/** vrider hvudet beta grader åt höger */
	void right(int beta) {
		a= a- beta* (Math.PI/180) ;
	}

	/** går till punkten newX,newY utan att rita. 
      Pennans läge och huvudets riktning påverkas inte */
	void jumpTo(int newX, int newY) {
		this.xHome= newX;
		this.yHome= newY;
		//w.moveTo(newX, newY);
	}

	/** återställer huvudets riktning till den ursprungliga */
	void turnNorth() {
		a= Math.PI/2;
	}

	/** tar reda på sköldpaddans aktuella x-koordinat */
	int getX() {
		return (int) xHome;
	}

	/** tar reda på sköldpaddans aktuella y-koordinat */
	int getY() {
		return (int) yHome;
	}


}
	


import se.lth.cs.window.SimpleWindow;

public class Turtle {

	/** skapar en sk�ldpadda som ritar i ritf�nstret w. 
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
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

	/** s�nker pennan */
	void penDown() {
		pen = true;
	}

	/** lyfter pennan */
	void penUp() {
		pen = false;
	}

	/** g�r rakt fram�t n pixlar i huvudets riktning */
	void forward(int n) {
		w.moveTo((int) Math.round(xHome), (int) Math.round(yHome));
		xHome = (int) (xHome +(n*Math.cos(a))) ;
		yHome=  (int) (yHome -(n*Math.sin(a))) ;
		if(pen) {
			w.lineTo((int) Math.round(xHome), (int) Math.round(yHome));
		}
	}

	/** vrider huvudet beta grader �t v�nster */
	void left(int beta) {
		a= a+ beta* (Math.PI/180) ;
	}

	/** vrider hvudet beta grader �t h�ger */
	void right(int beta) {
		a= a- beta* (Math.PI/180) ;
	}

	/** g�r till punkten newX,newY utan att rita. 
      Pennans l�ge och huvudets riktning p�verkas inte */
	void jumpTo(int newX, int newY) {
		this.xHome= newX;
		this.yHome= newY;
		//w.moveTo(newX, newY);
	}

	/** �terst�ller huvudets riktning till den ursprungliga */
	void turnNorth() {
		a= Math.PI/2;
	}

	/** tar reda p� sk�ldpaddans aktuella x-koordinat */
	int getX() {
		return (int) xHome;
	}

	/** tar reda p� sk�ldpaddans aktuella y-koordinat */
	int getY() {
		return (int) yHome;
	}


}
	


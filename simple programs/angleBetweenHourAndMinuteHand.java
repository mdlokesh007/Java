package justJava;

public class angleBetweenHourAndMinuteHand {

	public static void main(String[] args) {
		cal(1,15);
		cal(12,30);
		cal(3,15);
		cal(12,60);
		cal(6,45);
		cal(9,20);
	}

	private static void cal(int h, int m) {
		//min angle wrt 12 .. 360/60 = 6 *m
		//hour angle wrt 12 .. 360/12 = 30 * h
		if(h==12){h=0;}
		if(m==60){h=0;}
		int angle =Math.abs((30*h)-(6*m));
		System.out.println(angle +" :: "+(360-angle));
	}

}

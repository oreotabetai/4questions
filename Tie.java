package question;

import java.util.Random;

//ランダムに問題を並べる
public  class Tie {

	public void tie( int[] rad ) {
		Random rand = new Random();
		int a = -1 , b = -1 , c = -1 , d = -1;
		a = rand.nextInt(4);
		b = c = d = a;
		//System.out.println("a" + a);
		while( b == a ) {
			b = rand.nextInt(4);
			//System.out.println("b" + b);
		}
		while( c == b || c == a ){
			c = rand.nextInt(4);
		//	System.out.println("c" + c);
		}
		while( d == c || d == b || d == a ) {
			d = rand.nextInt(4);
			//System.out.println("d" + d);
		}
		rad[0] = a;
		rad[1] = b;
		rad[2] = c;
		rad[3] = d;


	}
}

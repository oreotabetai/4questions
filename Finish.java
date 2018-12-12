package question;

import java.util.Scanner;

public class Finish {

	public int finish (){
		Scanner scanner = new Scanner(System.in);
		System.out.println("終わりますか？\n");
		System.out.print("はい：１ いいえ：２ >");
		int fin = scanner.nextInt();
		return fin;
	}

}

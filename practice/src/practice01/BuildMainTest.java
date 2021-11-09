package practice01;

import java.util.Scanner;

public class BuildMainTest {

	public static void main(String[] args) {
		
		BuildToss[]  gateway = new BuildToss[3];
		Scanner sc = new Scanner(System.in);
		int[] id = new int[3];
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			id[i] = sc.nextInt();
			name[i] = sc.next();
			gateway[i] = new BuildToss(id[i],name[i]);
			
		}		
		for (int i = 0; i < name.length; i++) {
			gateway[i].showInfo();
		}
		for(BuildToss b : gateway) {
			b.showInfo();
		}
	}

}

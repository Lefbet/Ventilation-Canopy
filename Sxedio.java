package fouskes;

import java.lang.Math;

public class Sxedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char answer = 'y';
		double a; // megalytero mhkos
		double b; // megalytero platos
		double x; // mikrotero mhkos
		double y; // mikrotero platos
		double h; // ypsos
		
		System.out.println("Parakalw eisagete tis diastaseis ths vashs ths fouskas.");
		do {
			System.out.print("Mhkos (mm): ");
			a = My.readDouble();
			if (a <= 0) System.out.println("Ektos oriwn.");
		} while (a <= 0);
		double amax = a;
		do {
			System.out.print("Platos (mm): ");
			b = My.readDouble();
			if (b <= 0) System.out.println("Ektos oriwn.");
		} while (b <= 0);
		double bmax = b;
		
		System.out.println("Parakalw eisagete tis diastaseis ths apolhkshs ths fouskas.");
		do {
			System.out.print("Mhkos (mm): ");
			x = My.readDouble();
			if (x <= 0) System.out.println("Ektos oriwn.");
		} while (x <= 0);
		if (x > amax) {
			a = x;
			x = amax;
		}
		do {
			System.out.print("Platos (mm): ");
			y = My.readDouble();
			if (y <= 0) System.out.println("Ektos oriwn.");
		} while (y <= 0);
		if (y > bmax) {
			b = y;
			y = bmax;
		}
		
		do {
			System.out.print("Parakalw eisagete to ypsos ths fouskas (mm): ");
			h = My.readDouble();
			if (h <= 0) System.out.println("Ektos oriwn.");
		} while (h <= 0);
		
		do {
			System.out.print("H apolhksh vrisketai sthn mesh (y/n)? ");
			answer = Character.toLowerCase(My.readChar());
			if (answer != 'y' && answer != 'n')
				System.out.println("Lanthasmenh apanthsh.");
		} while (answer != 'y' && answer != 'n');
		
		// Enarksh algorithmou ypologismou kopwn
		
		if (answer == 'y') { // H apolhksh vrisketai sthn mesh
			double hypotenuse1 = Math.sqrt( Math.pow((b-y)/2, 2) + Math.pow(h, 2) );
			double hypotenuse2 = Math.sqrt( Math.pow((a-x)/2, 2) + Math.pow(h, 2) );
			long height1 = Math.round(hypotenuse1);
			long height2 = Math.round(hypotenuse2);
			
			double hypot1 = Math.sqrt( Math.pow((a-x)/2, 2) + Math.pow(height1, 2) );
			double hypot2 = Math.sqrt( Math.pow((b-y)/2, 2) + Math.pow(height2, 2) );
			long h1 = Math.round(hypot1);
			long h2 = Math.round(hypot2);
			
			double rad1 = Math.atan( (2*h)/(b-y) );
			double rad2 = Math.atan( (2*h)/(a-x) );
			long deg1 = Math.round(Math.toDegrees(rad1));
			long deg2 = Math.round(Math.toDegrees(rad2));
			
			System.out.println();
			System.out.println("       "+(int)x);
			System.out.println("      _____");
			System.out.println("     /     \\");
			System.out.println("    /       \\ "+h1);
			System.out.println("   /   "+height1+"   \\       x2");
			System.out.println("  /           \\");
			System.out.println(" /_____________\\");
			System.out.println("       "+(int)a);
			System.out.println();
			System.out.println("Gwnia katakoryfh: "+(90+deg1));
			System.out.println("Gwnia orizontia: "+(180-deg1));
			System.out.println();
			System.out.println("       "+(int)y);
			System.out.println("      _____");
			System.out.println("     /     \\");
			System.out.println("    /       \\ "+h2);
			System.out.println("   /   "+height2+"   \\       x2");
			System.out.println("  /           \\");
			System.out.println(" /_____________\\");
			System.out.println("       "+(int)b);
			System.out.println();
			System.out.println("Gwnia katakoryfh: "+(90+deg2));
			System.out.println("Gwnia orizontia: "+(180-deg2));
		} // Vrisketai sthn mesh
		
		else { // H apolhksh den vrisketai sthn mesh
			char ans1 = 'y', ans2 = 'y';
			double d1, d2, d3, d4;
			
			do {
				do {
					System.out.print("Katopsh: apostash apo thn mia meria ston aksona twn mhkwn (mm) ["+a+"-"+x+" mm]: ");
					d1 = My.readDouble();
					d3 = a-x-d1;
					if (d1 < 0 || d3 < 0) System.out.println("Ektos oriwn.");
				} while (d1 < 0 || d3 < 0);
				do {
					System.out.print("Ara h apostash apo thn allh meria einai " + d3 + " mm. Swsto (y/n)? ");
					ans1 = Character.toLowerCase(My.readChar());
					if (ans1 != 'y' && ans1 != 'n')
						System.out.println("Lanthasmenh apanthsh.");
				} while (ans1 != 'y' && ans1 != 'n');
			} while (ans1 == 'n');
			
			do {
				do {
					System.out.print("Katopsh: apostash apo thn mia meria ston aksona twn platwn (mm) ["+b+"-"+y+" mm]: ");
					d2 = My.readDouble();
					d4 = b-y-d2;
					if (d2 < 0 || d4 < 0) System.out.println("Ektos oriwn.");
				} while (d2 < 0 || d4 < 0);
				do {
					System.out.print("Ara h apostash apo thn allh meria einai " + d4 + " mm. Swsto (y/n)? ");
					ans2 = Character.toLowerCase(My.readChar());
					if (ans2 != 'y' && ans2 != 'n')
						System.out.println("Lanthasmenh apanthsh.");
				} while (ans2 != 'y' && ans2 != 'n');
			} while (ans2 == 'n');
			
			double hypotenuse1 = Math.sqrt( Math.pow(d1, 2) + Math.pow(h, 2) );
			long height1 = Math.round(hypotenuse1);
			double hypot1a = Math.sqrt( Math.pow(d4, 2) + Math.pow(height1, 2) );
			double hypot1b = Math.sqrt( Math.pow(d2, 2) + Math.pow(height1, 2) );
			long h1a = Math.round(hypot1a);
			long h1b = Math.round(hypot1b);
			double rad1 = Math.atan(h/d1);
			long deg1 = Math.round(Math.toDegrees(rad1));
			System.out.println();
			System.out.println("          "+(int)y);
			System.out.println("         _____");
			System.out.println("        /     \\");
			System.out.println("   "+h1a+" /       \\ "+h1b);
			System.out.print("      /   "+height1+"   \\");
			if (d1 == d3) System.out.print("        x2");
			System.out.println("\n     /           \\");
			System.out.println("    /_____________\\");
			System.out.println("          "+(int)b);
			System.out.println();
			System.out.println("Gwnia katakoryfh: " + (90+deg1));
			System.out.println("Gwnia orizontia: " + (180-deg1));
			
			double hypotenuse2 = Math.sqrt( Math.pow(d2, 2) + Math.pow(h, 2) );
			long height2 = Math.round(hypotenuse2);
			double hypot2a = Math.sqrt( Math.pow(d1, 2) + Math.pow(height2, 2) );
			double hypot2b = Math.sqrt( Math.pow(d3, 2) + Math.pow(height2, 2) );
			long h2a = Math.round(hypot2a);
			long h2b = Math.round(hypot2b);
			double rad2 = Math.atan(h/d2);
			long deg2 = Math.round(Math.toDegrees(rad2));
			System.out.println();
			System.out.println("          "+(int)x);
			System.out.println("         _____");
			System.out.println("        /     \\");
			System.out.println("   "+h2a+" /       \\ "+h2b);
			System.out.print("      /   "+height2+"   \\");
			if (d2 == d4) System.out.print("        x2");
			System.out.println("\n     /           \\");
			System.out.println("    /_____________\\");
			System.out.println("          "+(int)a);
			System.out.println();
			System.out.println("Gwnia katakoryfh: " + (90+deg2));
			System.out.println("Gwnia orizontia: " + (180-deg2));
			
			if (d1 != d3) {
				double hypotenuse3 = Math.sqrt( Math.pow(d3, 2) + Math.pow(h, 2) );
				long height3 = Math.round(hypotenuse3);
				double hypot3a = Math.sqrt( Math.pow(d2, 2) + Math.pow(height3, 2) );
				double hypot3b = Math.sqrt( Math.pow(d4, 2) + Math.pow(height3, 2) );
				long h3a = Math.round(hypot3a);
				long h3b = Math.round(hypot3b);
				double rad3 = Math.atan(h/d3);
				long deg3 = Math.round(Math.toDegrees(rad3));
				System.out.println();
				System.out.println("          "+(int)y);
				System.out.println("         _____");
				System.out.println("        /     \\");
				System.out.println("   "+h3a+" /       \\ "+h3b);
				System.out.print("      /   "+height3+"   \\");
				System.out.println("\n     /           \\");
				System.out.println("    /_____________\\");
				System.out.println("          "+(int)b);
				System.out.println();
				System.out.println("Gwnia katakoryfh: " + (90+deg3));
				System.out.println("Gwnia orizontia: " + (180-deg3));
			}
			
			if (d2 != d4) {
				double hypotenuse4 = Math.sqrt( Math.pow(d4, 2) + Math.pow(h, 2) );
				long height4 = Math.round(hypotenuse4);
				double hypot4a = Math.sqrt( Math.pow(d3, 2) + Math.pow(height4, 2) );
				double hypot4b = Math.sqrt( Math.pow(d1, 2) + Math.pow(height4, 2) );
				long h4a = Math.round(hypot4a);
				long h4b = Math.round(hypot4b);
				double rad4 = Math.atan(h/d4);
				long deg4 = Math.round(Math.toDegrees(rad4));
				System.out.println();
				System.out.println("          "+(int)x);
				System.out.println("         _____");
				System.out.println("        /     \\");
				System.out.println("   "+h4a+" /       \\ "+h4b);
				System.out.print("      /   "+height4+"   \\");
				System.out.println("\n     /           \\");
				System.out.println("    /_____________\\");
				System.out.println("          "+(int)a);
				System.out.println();
				System.out.println("Gwnia katakoryfh: " + (90+deg4));
				System.out.println("Gwnia orizontia: " + (180-deg4));
			}
		} // Den vrisketai sthn mesh
		
	}// main

}// Sxedio

import java.util.Scanner;
public class Exercises03_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1X = input.nextDouble(), r1Y = input.nextDouble(), r1Height = input.nextDouble(), 
				r1Width = input.nextDouble();
		double r1Top = r1Y + r1Height/2, r1Bottom = r1Y - r1Height/2, r1Left = r1X - r1Width/2, 
				r1Right = r1X + r1Width/2;
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2X = input.nextDouble(), r2Y = input.nextDouble(), r2Height = input.nextDouble(), 
				r2Width = input.nextDouble();
		double r2Top = r2Y + r2Height/2, r2Bottom = r2Y - r2Height/2, r2Left = r2X - r2Width/2, 
				r2Right = r2X + r2Width/2;
		if((r2Right <= r1Right && r2Left >= r1Left) && (r2Top <= r1Top && r2Bottom >= r1Bottom))
			System.out.println("r2 is inside r1");
		else if((r2Right >= r1Left && ((r2Top <= r1Top && r2Top >= r1Bottom) 
						|| (r2Bottom >= r1Bottom && r2Bottom <= r1Top))) 
				&& (r2Left <= r1Right && ((r2Top <= r1Top && r2Top >= r1Bottom) 
						|| (r2Bottom >= r1Bottom && r2Bottom <= r1Top)))
				&& (r2Bottom <= r1Top && ((r2Left <= r1Right && r2Right >= r1Left) 
						|| (r2Left >= r1Left && r2Left <= r1Right)))
				&& (r2Left <= r1Right && ((r2Left <= r1Right && r2Right >= r1Left) 
						|| (r2Left >= r1Left && r2Left <= r1Right))))
			System.out.println("r2 overlaps r1");
		else System.out.println("r2 does not overlap r1");
	}

}

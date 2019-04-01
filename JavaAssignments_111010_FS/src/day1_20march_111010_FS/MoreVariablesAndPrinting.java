package day1_20march_111010_FS;

public class MoreVariablesAndPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name, Eyes, Teeth, Hair;
		int Age, Height, Weight;
		double height, weight;
		double floatingNumber = 4.555;
		// rounding off a floating point number and then multiplying it by 10.
		int amt = (int) floatingNumber * 10;
		System.out.println("amt = " + amt);
		// rounding off the result of multiplying a floating point number by 10.
		amt = (int) (floatingNumber * 10);
		System.out.println("amt = " + amt);

		Name = "Zed A. Shaw";
		Age = 35; // not a lie
		Height = 74; // inches
		height = Height * 2.54; // centimeter
		Weight = 180; // lbs
		weight = Weight / 2.205; // kilos
		Eyes = "Blue";
		Teeth = "White";
		Hair = "Brown";

		System.out.println("Let's talk about " + Name + ".");
		System.out.println("He's " + Height + " inches " + " (or " + height + " cm)" + " tall.");
		System.out.println("He's " + Weight + " pounds " + "(or " + weight + " kg)" + " heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
		System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

		// This line is tricky; try to get it exactly right.
		System.out.println("If I add " + Age + ", " + Height + ", and " + Weight + 
							" I get " + (Age + Height + Weight) + ".");
	}

}

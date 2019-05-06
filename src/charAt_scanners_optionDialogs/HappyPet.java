package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int hl = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String a = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
for(int i=0; i<10; i++) {
	int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Action", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Give it a bath.", "Give it 10 treats.",
						"Play with it.", "Kill it, then eat it, then make it's fur into toilet paper." },
				null);
		if (task == 0) {
			if (a.equals("A cat.")) {
				bath();
				 hl -=2;
				 JOptionPane.showMessageDialog(null, "Happiness Level = " + hl);
			} else {
				JOptionPane.showMessageDialog(null, "Good job! You shall be rewarded!");
				hl +=1;
				JOptionPane.showMessageDialog(null, "Happiness level = " + hl);
			}
		}
		if (task == 1) {
			if(i>2) {
			feed();
			hl -=10;
			JOptionPane.showMessageDialog(null, "Happiness level = " + hl);
		}else {
			feed();
			hl +=5;
			JOptionPane.showMessageDialog(null, "Happiness level = " + hl);
		}
		}
		if (task == 2) {
			play();
			hl +=2;
			JOptionPane.showMessageDialog(null, "Happiness level = " + hl);
		}
		if (task == 3) {
			kill();
			JOptionPane.showMessageDialog(null, "Congratulations, you saved $3 on toilet paper!");
			System.exit(0);
		}
		}
	}

	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void bath() {
		JOptionPane.showMessageDialog(null, "Cats hate baths!");
	}

	static void feed() {
		JOptionPane.showMessageDialog(null, "If you keep that up your pet will weigh 300lbs.");
	}

	static void play() {
		JOptionPane.showMessageDialog(null, "Yay! Fun! Ow, no biting!");
	}

	static void kill() {
		JOptionPane.showMessageDialog(null, "You are a horrible person. 3 days later: This toilet paper sucks! ");
	}
}

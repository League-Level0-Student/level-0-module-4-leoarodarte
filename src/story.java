import javax.swing.JOptionPane;

public class story {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Once upon a time, there was a game called fortnite. It was made by"
			+ " Epic Games and was very popular."
			+ " One day, tons of fans walked up to the main facility."
			+ " We don't want planes anymore! They suck!"
			+ " Bring back drum guns and burst assualt rifles!");
	String a = JOptionPane.showInputDialog("What would you like to do? Bring back drum guns and burst assault rifles."
			+ " Or do you want to keep planes and make a new broken item called a Baller.");
if(a.equals("Bring back drum guns and burst assault rifles.")) {
	JOptionPane.showMessageDialog(null, "Yay! All the noobs are happy but the tryhards are sad because now they just get lazered with drum guns."
			+ " Are you okay with the game being broken?");
	String b= JOptionPane.showInputDialog("Do you want to change nothing or remove drum guns.");
if(b.equals("Change nothing.")) {
	JOptionPane.showMessageDialog(null, "Yay! You've gone bankrupt! The end.");
}
if(b.equals("Remove drum guns.")) {
	JOptionPane.showMessageDialog(null, "The majority of Fortnite players hate Epic Games. You are bankrupt. The End. ");
}
}
if(a.equals("Keep planes and make a new broken item called a Baller.")) {
	JOptionPane.showMessageDialog(null, "You've gone bankrupt. The end.");
}
}

}
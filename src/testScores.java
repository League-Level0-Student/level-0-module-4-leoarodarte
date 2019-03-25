import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	String s=JOptionPane.showInputDialog("What did you score on your last test?");
	double score=Double.parseDouble(s);
	double total=0.0;
	total+=score;
	if(total<60) {
		JOptionPane.showMessageDialog(null, "yo dum");
	}
	if(total>60 && total<80) {
		JOptionPane.showMessageDialog(null, "You did OK.");
	}
	if(total>80 && total<95) {
		JOptionPane.showMessageDialog(null, "Wow, you did very good. You must have worked hard.");
	}
	if(total>95 && total<101) {
		JOptionPane.showMessageDialog(null, "WOW!!");
	}
	if(total>100 && total<106) {
		JOptionPane.showMessageDialog(null, "WOOOOOWWW!!!!!");
	}
	if(total>105) {
		JOptionPane.showMessageDialog(null, "Liar!");
	}
	}
	}



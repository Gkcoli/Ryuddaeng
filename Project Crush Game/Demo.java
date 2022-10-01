import javax.swing.JOptionPane;

public class Demo {
    
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        String gender = JOptionPane.showInputDialog("Enter your gender");
        JOptionPane.showMessageDialog(null, "You're " +gender);

        String hobby = JOptionPane.showInputDialog("Input your hobby");
        JOptionPane.showMessageDialog(null, "My hobby is " +hobby);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm");

        String crush = JOptionPane.showInputDialog("Who's your crush?");
        JOptionPane.showMessageDialog(null, "Your Crush is "+ crush);

        
    }
}

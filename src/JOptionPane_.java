import javax.swing.*;

public class JOptionPane_ {
    public static void main(String[] args){

        //JOptionPane class' static method showInputDialog
        //ask for user's input
        //receive a string parameter as user prompt
        //return a string (users' input)
        String s1 = JOptionPane.showInputDialog("Enter 1st num");
        String s2 = JOptionPane.showInputDialog("Enter 2nd num");

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;

        //static method showMessageDialog()
        //1st para -> position of the dialog box. "null" means screen center
        //2nd para -> content to display in the box
        //3rd para -> title of dialog box
        //4th para -> which type msg dialog is to display
            // the constant can be :
            // ERROR_MESSAGE
            // INFORMATION_MESSAGE
            // WARNING_MESSAGE
            // QUESTION_MESSAGE
            // PLAIN_MESSAGE
        JOptionPane.showMessageDialog(null,
                "sum = " + sum, "Sum Of Two",
                JOptionPane.INFORMATION_MESSAGE);

    }
}

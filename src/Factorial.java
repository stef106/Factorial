import javax.swing.*;

/**
 * Created by Capta on 3/29/2017.
 */

public class Factorial {
    public static void main(String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "input factorial"));
        int count = n;
        if(n>0){
            while(count>1) {
                n=n*(count-1);
                count--;
            } JOptionPane.showMessageDialog(null, n);
        } else {
            if(n==0) {
                n=1;
                JOptionPane.showMessageDialog(null, n);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
}

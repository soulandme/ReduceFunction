/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reducefunction;

import javax.swing.JOptionPane;

/**
 *
 * @author wewan5525
 */
public class ReduceFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String number, secondnumber;
        int num, secnum,ans,sans;
        
        
        number = JOptionPane.showInputDialog("Pleace enter the numrtator of your fraction");
        num = Integer.parseInt(number);
        secondnumber = JOptionPane.showInputDialog("Pleace enter the denominatpr fro your fraction");
        secnum = Integer.parseInt(secondnumber);
        
        ans = gcd(num, secnum);
        sans = secnum/ans;
        
        //System.out.println("The Fraction" + num + "/" + secnum + "Can be reduced to:" + ans);
        System.out.println("The Fraction"+num+"/"+secnum+"Can be reduced to:"+ans+"/"+sans);
        
        
    }

    private static int gcd(int num, int secnum) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        
        if(secnum == 0) {
                return num;
        }
        else {
             //% is modulus, also known as the remainder function
            return gcd(secnum, num%secnum);
        }
        
        //if(num == 0){
                //return secnum;
        //}
        //else{
            
            //return gcd(num, secnum%num);
        //}
    }
    
    
}

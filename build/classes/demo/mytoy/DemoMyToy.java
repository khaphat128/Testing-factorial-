package demo.mytoy;

import util.MyToy;

/**
 *
 * @author Administrator
 */
public class DemoMyToy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //expected: 120 if n = 5
        System.out.println("5! = " + MyToy.computeFactorial(5));
        
        //expected: 720 if n = 6
        System.out.println("6! = " + MyToy.computeFactorial(6));
        
        //expected: 1 if n = 0
        System.out.println("0! = " + MyToy.computeFactorial(1));
        
        //expected: Throw IllegalArgumentException
        System.out.println("-5! = " + MyToy.computeFactorial(-5));
    }

}

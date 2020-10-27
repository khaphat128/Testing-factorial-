/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.util;

import org.junit.Test;
import static org.junit.Assert.*;
import util.MyToy;

/**
 *
 * @author Administrator
 */
public class MyToyTest {

    @Test
    public void testSuccessFulCases() {
        assertEquals(120, MyToy.computeFactorial(5));
        assertEquals(720, MyToy.computeFactorial(6));
        assertEquals(24, MyToy.computeFactorial(4));
        assertEquals(1, MyToy.computeFactorial(0));
    }
    
    @Test(expected = NullPointerException.class) 
    public void testExceptionCases(){
        util.MyToy.computeFactorial(-5);
                
    }
    //Exception là thứ không thể so sánh
    //chỉ hỏi là nó có xuất hiện bất thường hay không
    //so sánh nghĩa là: assertEquals (cần 2 giá trị)
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import util.MyToy;

/**
 *
 * @author Administrator
 */
@RunWith(value = Parameterized.class)
public class AdvancedMyToysTest {

    @Parameter(value = 1)
    public long expected; //120, 720, 24, ... giá trị kỳ vọng trả về

    @Parameter(value = 0)
    public int input; //0! ,1!, 2!, 7!,.. 

    //chuẩn bị 1 hàm khởi động bộ data set (data giả) sau đó dùng vào việc nhồi vào expected và input
    //hàm data phải là static vì bộ data này sẽ dùng cho test khác nhau nên phải dùng static
    @Parameters
    public static Integer[][] initData() {
        return new Integer[][]{{0, 1},
        {1, 1}, //input = 1, out = 1
        {2, 4}, //input = 2 , out =4
        {5, 120},
        {6, 720}};
    }
    //có thể tách file txt riêng dưới dạng CSV
    //dùng Excel rồi save as chọn CSV

    @Test
    public void testSuccessFulCases() {
        assertEquals(expected, MyToy.computeFactorial(input));
//        assertEquals(720, MyToy.computeFactorial(6));
//        assertEquals(24, MyToy.computeFactorial(4));
//        assertEquals(1, MyToy.computeFactorial(0));
    }

}

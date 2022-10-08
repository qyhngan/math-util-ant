/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.qn.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    
    //Hàm getF() đc thiết kế trả về con long nếu n đưa vafo 0..20
    //hàm getF() đc thiết kế NÉM RA EXCEPTION NẾU TA ĐƯA VÀO N < 0 || N > 2
    //tức là nếu gọi getF(-5) thì CHỖ GỌI SẼ NHẬN VỀ EXCEPTION TÊN LÀ
    //IllegalArguementException
    //đưa cà chớn, nhận ngoại lệ!!!
    //bắt xem hàm mình có đúng ném ngoại lệ hay ko nếu data cà chớn
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = Exception.class)
    //vietsub: khi chạy hàm này, kiểm tra giùm xem có 1
    //ngoại lệ thuộc nhóm/class IllegalArgumentException ở đâu đó
    //nếu có xh, mừng quá, đúng như thiết kế, MÀU XANH
    //KÌ VỌNG MÀY XH, DÙ MÀY LÀ EXCEPTION, VÀ MÀY XH THẬT, MÀU XANH
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    
    @Test
     public void testFactorialGivenRightArgumentReturnsWell2() {
        
        //Test case #4: n = 3; 3! expected = 6?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 4; 4! expected = 24?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n = 5; 5! expected = 120?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        //Test case #7: n = 6; 6! expected = 720?
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
    }
    
    
    @Test   //tên hàm test bao hàm luôn ý nghĩa test cái gì
            //quy ước dân kiểm thử
            //hàm này tui mún test hàm giai thừa khi đưa tham số đúng
            //mày phải trả về đúng
            //viết code phải theo quy tắc - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: Kiểm thử tình huống 0! coi có đúng hem?
        //n = 0, hy vọng hàm ói về expected = 1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        
        long expected = 1;
        long actual = MathUtil.getFactorial(0);    //gọi hàm để xem actual là mấy 
        //so sánh 2 giá trị coi tương đồng hok? có đúng, ko BUG
        //so sánh = sout() và dùng mắt để luận kết quả, XƯA RỒI
        //chơi màu mới ngầu
        Assert.assertEquals(expected, actual);
        
        //Test case #2: Kiểm thử tình huống 1! coi có đúng hem?
        //n = 1, hy vọng hàm ói về expected = 1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: n = 2; 2! expected = 2?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
    }
    
    @Test
    public void tryJUnitFirst() {
        Assert.assertEquals(69, 69);
    }
    
    
}

//CLASS NÀY TA VIẾT CÁC ĐOẠN CODE NHƯ BÌNH THƯỜNG
//NHƯNG CODE NÀY DÙNG DỂ YEST CODE CHÍNH BÊN MATHUTIL
//VIẾT CODE ĐỂ TEST CODE CHÍNH< THÌ CÁI ĐOẠN CODE TEST NÀY ĐƯỢC GỌI
//TÊN LÀ TEST SCRIPT
//TEST SCRIPT LÀ NHỮNG ĐOẠN CODE ĐC VIẾT RA ĐỂ TEST CODE KHÁC, CODE CHÍNH
//Những đoạn code này sẽ gọi các hàm bên code chính, so sánh giá trị
//trả về của hàm chính cần test với giá trị kì vọng
//Những đoạn code này/ test script này sẽ PHẢI BAO GỒM CÁC TEST CASE 
//BÊN TRONG
//TEST SCRIPT CHỨA CÁC TEST CASE
//TRONG TEST SCRIPT/CLASS NÀY SẼ CÓ TEST 5! 6! 7! -5! -> TEST CASE

//@Test @ được gọi ANNOTATION, kí hiệu, flag để đánh dấu đoạn code
//mang 1 ý nghĩa nào đó. Và khi biên dịch/compile code thì
//thư viện đi kèm nó sẽ tự động generate thêm code cho mình tùy theo\
//@
//ví dụ @Test thì thư viện JUnit nãy import nó sẽ ngầm ngầm tự generate
//hàm này thành public static void main() và gửi main() này cho JVM
//Kĩ thuật dùng thư viện, bị ép phải theo cú pháp của nó qua những
//@, thư viện này gọi là FRAMEWORK
//FW: là thư viện, những file .jar .dll chứa 1 đống class bên trong
//ép ta phải xài theo cách của nó, theo dàn khung code mà nó quy ước
//dàn khung, template, ta điền nốt code vào chỗ trống

//Thư viện - library, những file .jar .dll chứa 1 đống class bên trong
//ta thoải mái dùng hàm của nó theo cách của ta

//QUY TẮC CHƠI XANH ĐỎ
//XANH: KHI TẤT CẢ CÁC TEST CASE ĐỀU XANH, TỨC LÀ TẤT CẢ
//          EXPECTED PHẢI == ACTUAL

//ĐỎ: CHỈ CẦN CÓ 1 TEST CASE MÀU ĐỎ, XEM NHƯ HÀM TOANG/TOẠCH
//    CHỈ CẦN CÓ 1 EXPECTED != ACTUAL, XEM NHƯ BỎ ĐI HẾT CÁC TEST CASE
//1 THẰNG GÂY SAI CHO TẤT CẢ
//LÝ DO: hàm đã đúng thì phải đúng hết cho các case đã được nêu ra
//       chỉ cần 1 sự ko == nhau của actual với expected, hàm ko
//       ổn định về kết quả trả về -> SAI

//KO THỂ TEST HẾT CÁC CASE (NL2) NHƯNG ĐÃ TEST CASE NÀO THÌ PHẢI NGON 
//XANH CASE ĐÓ!!!

//NÓI THÊM VỀ MÀU ĐỎ
//ĐỎ XẢY RA KHI: CÓ 1 SỰ KO BẰNG NHAU CỦA EXPECTED VÀ ACTUAL
//LÝ DO GÌ EXPECTED != ACTUAL
//CÓ 2 LÝ DO
//LD1: EXPECTED ĐÚNG, MÌNH TÍNH BÊN NGOÀI, = TAY KHI CHƯA CÓ HÀM
//     ACTUAL    SAI, TÌNH HUỐNG NÀY HÀM CÙI BẮP, BUG BUG

//LD2: EXPECTED SAI, VỨT LUÔN TEST CASE NÀY ĐI, ANH CHÀNG QC/DEV BỊ NGÁO
//KÌ VỌNG MÀ SAI, HY VỌNG GÌ Ở ACTUAL

//DDT - Data Driven Testing
//Tách bộ data kiểm thử ra 1 chỗ
//Lát hồi nhồ/nạp/fill/điền/feed data này tuần tự vào chỗ kiểm thử
//Ví dụ tách data đã kiểm thử ở trên thành
//1   0
//1   1
//2   2
//6   3
//24  4
//120 5
//720 6
//[7][2]




//Assert.assertEquals(2, MathUtil.getFactorial(2));
//Thay vì lệnh so sánh gọi viết cho từng case, ta biến lệnh này
//trở thành tổng quát, ko điền data cụ thể, mà sẽ lấy từ đâu đó

//Assert.assertEquals(???, MathUtil.getFactorial(???));

//??? này sẽ lấy từ tập data ở trên!!!
//code gọn hơn, đẹp hơn, dễ bảo trì hơn, kiểm soát được đủ thiếu các case
//kí thuật tách code test ra khỏi data của nps, lát hồi fill lại sau
//đc GỌI LÀ KĨ THUẬT VIẾT TEST CASE THEO KIỂU THAM SỐ HÓA
//                                            PARAMETERIZED
//HOẶC CÒN GỌI LÀ               DDT - DATA DRIVEN TESTING
//VIẾT KIỂM THỬ HƯỚNG VỀ TÁCH DATA RIÊNG RA!!!



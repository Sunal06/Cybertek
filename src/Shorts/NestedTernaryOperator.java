package Shorts;

public class NestedTernaryOperator {
    public static void main(String[] args) {


//        int bill = 2000;
//        int discount;
//        int  quantity = 11;
//        if(bill > 1000){
//            if(quantity > 11){
//                discount = 10;
//            }else{
//                discount = 9;
//            }
//        }else{
//            discount = 5;
//        }

          int bill = 2000;
          int  quantity = 11;
          int discount = (bill > 1000) ? (quantity > 11) ? 10 : 9 : 5;
          System.out.println(discount);
    }
}
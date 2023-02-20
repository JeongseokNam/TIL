
import programmers.lv_0.최댓값_만들기_1;


public class Main {
    public static void main(String[] args) {
        double price = 150000;
        double discountPercent = 0;
        if (price>=500000){
            discountPercent= 20;
        } else if (price>=300000) {
            discountPercent= 10;
        } else if (price>=100000) {
            discountPercent= 5;
        }
        System.out.println((int) (price-(price*discountPercent)/100)); 
    }
}

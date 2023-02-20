package programmers.lv_0;

public class 옷가게_할인_받기 {
    public int solution(int price) {
        return discount(price);
    }
    public int discount(double price) {
        double discountPercent=0;
        if (price>=500000){
            discountPercent= 20;
        } else if (price>=300000) {
            discountPercent= 10;
        } else if (price>=100000) {
            discountPercent= 5;
        }
        return (int) (price-price*discountPercent/100);
    }
}

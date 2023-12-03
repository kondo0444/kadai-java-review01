
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        double taxRate = 0.1;
        int taxPrice = tax(num1,taxRate);
        int result = num1 + taxPrice;
        System.out.println(num1 + "円の商品の税込価格は" + result + "円" + "(消費税は" + taxPrice + "円)"+"です。");

    }

    public static int tax(int num1,double taxRate) {
        int result = (int) (num1 * taxRate);
        return result;
    }
}

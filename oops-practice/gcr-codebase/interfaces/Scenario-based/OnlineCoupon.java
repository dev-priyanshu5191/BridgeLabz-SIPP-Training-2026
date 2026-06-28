
interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return code.matches("[A-Za-z0-9@#$%&*]+");
    }
}

public class OnlineCoupon {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10","OFF50","AB12","WELCOME2025","DISCOUNT1","SALE@20"};

        ShoppingCart cart = new ShoppingCart();
        for(String c:coupons){
            if(cart.validateCoupon(c)){
                System.out.println(c+" Valid Coupon");
            }
            else{
                System.err.println(c+" Invalid Coupon");
            }
        }
    }
}

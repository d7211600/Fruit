import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    /*
        买啥
         */
    //苹果总价格
    Map<String, Object> applePrice = new  HashMap<String, Object>(){{
        put("name", "apples");
        put("amount", 5);
    }};
    //草莓总价格
    Map<String, Object> strawberriePrice = new HashMap<String, Object>(){{
        put("name", "strawberries");
        put("amount", 5);
    }};
    //芒果总价格
    Map<String, Object> mangoePrice = new  HashMap<String, Object>(){{
        put("name", "mangoes");
        put("amount", 5);
    }};



    // 顾客A在超市购买了5斤苹果和草莓的总价格
    double customerAPrice = new Fruit(applePrice).priceMethod() + new Fruit(strawberriePrice).priceMethod();
        System.out.println("顾客 A 购买总价: " + customerAPrice);

    //顾客 B 在超市购买了5斤苹果和草莓和芒果
    double customerBPrice = new Fruit(applePrice).priceMethod() + new Fruit(strawberriePrice).priceMethod() + new Fruit(mangoePrice).priceMethod();
        System.out.println("顾客 B 购买总价: " + customerBPrice);

    //顾客 C 在超市购买了5斤苹果和草莓和芒果 草莓限时打 8 折
        strawberriePrice.put("discount", 0.8);
    double customerCPrice = new Fruit(applePrice).priceMethod() + new Fruit(strawberriePrice).priceMethod() + new Fruit(mangoePrice).priceMethod();
        System.out.println("顾客 C 购买总价（打折后）: " + customerCPrice);

        //顾客 D 在超市购买了5斤苹果和草莓和芒果 购物满 100 减 10 块
    double customerDPrice = new Fruit(applePrice).priceMethod() + new Fruit(strawberriePrice).priceMethod() + new Fruit(mangoePrice).priceMethod();
        if (customerDPrice >= 100) {
            customerDPrice -= 10;
        }
        System.out.println("顾客 D 购买总价（满减后）: " + customerDPrice);

}
}
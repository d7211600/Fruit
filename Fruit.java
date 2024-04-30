import java.util.HashMap;
import java.util.Map;

public class Fruit {

    // 水果名称
    String name;
    // 水果数量
    int amount;
    // 折扣
    double discount;
    // 水果价格
    double price;

    //     苹果价格map
    Map<String, Double> applesMap = new HashMap<String, Double>(){{
        put("apples",8.0);
    }};
    // 草莓面价格map
    Map<String, Double> strawberriesMap = new HashMap<String, Double>(){{
        put("strawberries",13.0);
    }};
    //芒果价格
    Map<String, Double> mangoesMap = new HashMap<String, Double>(){{
        put("mangoes",20.0);
    }};

    // 类的构造方法
    public Fruit(Map<String, Object> obj) {
        if (obj instanceof Map) {
            fruitComplex(obj);
        } else {
            throw new Error("构造失败!");
        }
    }

    // 构造方法
    private void fruitComplex(Map<String, Object> data) {
        this.name = (String) data.get("name");
        this.amount = data.get("amount") instanceof Integer ? (int) data.get("amount") : 1;
        this.discount = data.get("discount") instanceof Double ? (double) data.get("discount") : 1.0;
    }

    // 计算顾客购买水果价格
    double priceMethod() {
        switch (this.name) {
            case "apples":
                this.price = this.applesMap.get(this.name) * this.amount * this.discount;
                break;
            case "strawberries":
                this.price = this.strawberriesMap.get(this.name) * this.amount * this.discount;
                break;
            case "mangoes":
                this.price = this.mangoesMap.get(this.name) * this.amount * this.discount;
                break;
            default:
                throw new Error("没有水果传过来 !");
        }
        this.discount = 1.0;
        return this.price;
    }
}
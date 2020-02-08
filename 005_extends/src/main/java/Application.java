public class Application {

    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {
        Eagle eagle = new Eagle(4,5,30,"兔子");
        int age = eagle.age;
        int weight = eagle.weight;
        int speed = eagle.speed;
        String food = eagle.eatObject;
        System.out.println(String.format("一只%d岁的老鹰，体重%dKg，这只老鹰生活在%s窝所以它只捕食%s。"
                ,age,weight,food,food));
        eagle.howFly();
        eagle.eatWay();
        eagle.eat(food);
        eagle.sleep();
    }
}

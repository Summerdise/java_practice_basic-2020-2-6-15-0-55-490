public class Bird extends Animal {
    int speed;

    public Bird() {
        super();
    }

    public Bird(int age, int weight, int speed) {
        super(age, weight);
        this.speed = speed;
    }

    public void howFly(){
        System.out.println("怎么飞");
    }
}

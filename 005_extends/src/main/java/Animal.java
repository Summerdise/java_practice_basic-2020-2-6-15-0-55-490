public class Animal {
    int age;
    int weight;

    public Animal() {
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eat(String food){
        System.out.println("吃了"+food);
    }
    public void sleep(){
        System.out.println("睡觉了");
    }
}

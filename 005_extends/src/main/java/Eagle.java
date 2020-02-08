public class Eagle extends Bird {
    String eatObject;

    public Eagle() {
        super();
    }

    public Eagle(int age, int weight, int speed, String eatObject) {
        super(age, weight, speed);
        this.eatObject = eatObject;
    }

    public void eatWay(){
        System.out.println("以"+this.speed+"km/h的速度飞行捕食");
    }

    @Override
    public void eat(String food){
        System.out.println("吃了"+this.eatObject);
    }
    @Override
    public void howFly(){
        System.out.println("在兔子窝里飞");
    }
}

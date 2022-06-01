package nhiemVuDuocGiao.animalMachine.animal;

import nhiemVuDuocGiao.animalMachine.interfacee.BarkAble;

public class Bolt extends Animal implements BarkAble, Runnable {
    public Bolt(){}
    public Bolt(String name){
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run() {
        System.out.println(getName() + " chạy bốn chân thoang thoắt!");
    }

    @Override
    public void barkAble() {
        System.out.println(getName() + " sủa: gây gây");
    }
}

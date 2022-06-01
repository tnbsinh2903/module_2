package nhiemVuDuocGiao.animalMachine.animal;

import nhiemVuDuocGiao.animalMachine.interfacee.SwimAble;

public class Nemo extends Animal implements SwimAble {
    public Nemo(){}
    public Nemo(String  name){
        super(name);
    }

    @Override
    public void swimAble() {
        System.out.println(getName() + " bơi gần mặt nước!");
    }
}

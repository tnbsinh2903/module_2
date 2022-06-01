package nhiemVuDuocGiao.animalMachine.animal;

import nhiemVuDuocGiao.animalMachine.interfacee.FlyAble;

public class AngryBird extends Animal implements FlyAble {
    public AngryBird(){}
    public AngryBird(String name){
        super(name);
    }

    @Override
    public void flyAble() {
        System.out.println(getName() + " bay thang");
    }
}

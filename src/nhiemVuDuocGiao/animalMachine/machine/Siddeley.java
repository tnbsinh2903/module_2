package nhiemVuDuocGiao.animalMachine.machine;

import nhiemVuDuocGiao.animalMachine.interfacee.FlyAble;

public class Siddeley extends Machine implements FlyAble {
    public Siddeley(){}
    public Siddeley(String name){
        super(name);
    }

    @Override
    public void flyAble() {
        System.out.println(getName() + " bay trên bầu trời");
    }
}

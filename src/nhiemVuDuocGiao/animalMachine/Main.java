package nhiemVuDuocGiao.animalMachine;

import nhiemVuDuocGiao.animalMachine.animal.AngryBird;
import nhiemVuDuocGiao.animalMachine.animal.Animal;
import nhiemVuDuocGiao.animalMachine.animal.Bolt;
import nhiemVuDuocGiao.animalMachine.animal.Nemo;
import nhiemVuDuocGiao.animalMachine.machine.Machine;
import nhiemVuDuocGiao.animalMachine.machine.McQueen;
import nhiemVuDuocGiao.animalMachine.machine.Siddeley;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new AngryBird("đại pàng");
        animals[1] = new Bolt("CHOA'");
        animals[2] = new Nemo("Cas chép");
        for (Animal animal : animals) {
            if (animal instanceof AngryBird)
                ((AngryBird) animal).flyAble();
            if (animal instanceof Bolt) {
                ((Bolt) animal).barkAble();
                ((Bolt) animal).run();
            }
            if (animal instanceof Nemo) {
                ((Nemo) animal).swimAble();
            }
        }
        Machine[] machines = new Machine[2];
        machines[0] = new McQueen(" Kia");
        machines[1] = new Siddeley("Huda");
        for (Machine machine : machines) {
            if (machine instanceof McQueen) {
                ((McQueen) machine).run();
            }
            if (machine instanceof Siddeley) {
                ((Siddeley) machine).flyAble();
            }
        }
    }
}
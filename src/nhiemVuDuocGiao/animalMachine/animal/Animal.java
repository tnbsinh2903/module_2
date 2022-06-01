package nhiemVuDuocGiao.animalMachine.animal;

public abstract class Animal {
    private String name;
    public Animal(){}
    public Animal(String name){
        this.name  = name;
    }

    public String getName() {
        return name;
    }
}

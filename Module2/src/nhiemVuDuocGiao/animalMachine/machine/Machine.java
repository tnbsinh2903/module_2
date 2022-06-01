package nhiemVuDuocGiao.animalMachine.machine;

public abstract class Machine {
    private String name;
    private String color;
    public Machine(){}
    public Machine(String name){
          this.name = name;
    }

    public String getName() {
        return name;
    }

}

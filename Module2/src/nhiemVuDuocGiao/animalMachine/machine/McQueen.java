package nhiemVuDuocGiao.animalMachine.machine;

public class McQueen extends Machine implements Runnable{
    public McQueen(){}
    public  McQueen(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " chạy bốn bánh");
    }

}

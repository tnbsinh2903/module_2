package accessModifier;

public class StaticKey {
    public static String str = " sinh"; //property static
    public static String getVersion(){
        return "bao";
    }
    public static void main(String[] args) {
        System.out.println("name is : " + StaticKey.str);  //property static
        System.out.println("firstName is: " + StaticKey.getVersion());
    }
}

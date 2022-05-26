package accessModifier;

public class ReferenceDataType {
    public String name;
    public ReferenceDataType(String name){
        this.name = name;
    }
    public static void swap (ReferenceDataType first ,ReferenceDataType second){
        String temp = first.name;
        first.name = second.name;
        second.name = temp;
    }
    public static void main(String[] args) {
        ReferenceDataType reference = new ReferenceDataType("Bao");
        ReferenceDataType reference1 = new ReferenceDataType("Sinh");
        swap(reference,reference1);
        System.out.println("reference: " + reference.name);
        System.out.println("reference1: " + reference1.name);
    }
}

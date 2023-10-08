package demo;

public class JavaStringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuffer sbf1= new StringBuffer("Hello My!!! name is String Buffer");
        StringBuilder sb1= new StringBuilder("Hello My name is String Builder");


        System.out.println(sbf1);
        System.out.println(sb1);

        // This function appends two strings
        System.out.println(sb1.append(" And This is Exciting !!"));

        // This function inserts new charSequence on an existing String at a specified index
        System.out.println(sbf1.insert(5, " Everyone"));

        // This function deletes charSequence on an existing String at a specified index
        System.out.println(sbf1.delete(16,18));

        // Reversing a Value
        System.out.println(sbf1.reverse());

        //ToString Converting String Builder and String Buffer To String
        StringBuilder sb2=new StringBuilder("Everyone is Bored");
        String newStr=sb2.toString();

        System.out.println(newStr);

        // Converting String to String Builder and String Buffer
        String newStr2="New String";
        StringBuffer sbf2=new StringBuffer(newStr2);

        System.out.println(sbf2);

    }
}

package demo;

public class JavaStrings {
    public static void main(String[] args) {
        // Creating Strings
        String str1= "Today is Sunday";
        String str2= new String("Today is Sunday");

        String firstName="Monsur";
        String lastName="Ahmed";
        //Adding Multiple Strings to Create a New Strings
        String fullName=firstName+" "+lastName ;
        System.out.println(fullName);

        String abc="OuR clAsS";
        String bcd="Our Class";

        //Compare to String Values whether or not they are the same
        System.out.println(abc == bcd);
        System.out.println(abc.equalsIgnoreCase(bcd));

        //length of a String
        String randomStr=" A String object is an immutable sequence of characters. " +
                "This means that once a String object is created, its value cannot be modified." +
                " Any operation that modifies the value of a String object will create a new String object with the modified value. " +
                "This makes String objects safe for use in multi-threaded environments.";
       int strLength=randomStr.length();
        System.out.println("The Number of Char at randomSTR is : "+ strLength);

        //CharAt finds character in terms of index number
        // NumberOfIndex=NumberOfLength-1
        String charString= "Khanjada";
        System.out.println("The character at fifth place is : " +charString.charAt(5));

        //SubString Method: Create a new String by breaking up an existing String
        String nameOfAnimals="Cow, Goat, Deer, Tiger, Lion, Cat, Dog";
        System.out.println("Length of this String is : "+ nameOfAnimals.length());

        String animalsILike= nameOfAnimals.substring(0,9);
        System.out.println("Newly formed SubString value :"+ animalsILike);

        String animalNadjlaLikes=nameOfAnimals.substring(0,4) + " " + nameOfAnimals.substring(35,38);
        String animalMonsurLikes=nameOfAnimals.substring(0,4) + " " + nameOfAnimals.substring(0,4);
        System.out.println(animalNadjlaLikes);
        System.out.println(animalMonsurLikes);

        //ToUpperCase and ToLowerCase
        String str3= "cats are cute";
        System.out.println(str3.toUpperCase());
        String str4="DOGS ARE LOYAL";
        System.out.println(str4.toLowerCase());

        //IndexOF Method
        String daysName="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday";
        int findingIndexAsChar=daysName.indexOf("M");
        System.out.println("The Occurrence of letter M is at :" +findingIndexAsChar);
        int findingIndexAsString=daysName.indexOf("Friday");
        System.out.println("The Occurrence of Word Friday is at :" +findingIndexAsString);

        //Replace the char
        String newSTR= "Hallo World";
        String newlyFormdSTR=newSTR.replace('a','e');
        System.out.println(newlyFormdSTR);


        // Trim Function removes unnecessary trailing spaces
        String fr1="Hello                                             ";
        String fr2="World";
        String fr=fr1.trim()+fr2;

        System.out.println(fr);



    }
}

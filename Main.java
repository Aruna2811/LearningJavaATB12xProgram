//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String input_string = args[2];
        //System.out.println(input_string);
       // System.out.println(input_string instanceof String);
        int age = Integer.parseInt(input_string);
        System.out.println(age);
        //System.out.println(age instanceOf String);


        String Result = (age%2==0) ? "even" : "odd";
        System.out.println(Result);
    }
}
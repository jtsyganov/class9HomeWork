package class9HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
       // 5) Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int sum=0;
        int [] numbers={10,220,4,45,60};
        for (int i = 0; i < numbers.length; i++) {
sum=sum+numbers[i];

        }
        System.out.println("Sum of the numbers is "+sum);


    }
}

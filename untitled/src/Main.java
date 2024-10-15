import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input Angka :");
//        int angka = scanner.nextInt();
//        int counter =0;
//
//        for (int i = 1; i <= angka; i++) {
//            if(angka % i == 0){
//                counter += 1;
//                System.out.println(angka);
//            }
//        }
//        if(counter == 2){
//            System.out.println("Prima :"+ angka);
//        }
//        else {
//            System.out.println("bukan Prima :"+ angka);
//        }

//        //1
//        System.out.print("Name :");
//        String name = scanner.nextLine();
//        System.out.print("Age :");
//        String age = scanner.nextLine();
//        System.out.print("Fave Food :");
//        String food = scanner.nextLine();
//        System.out.printf("Hi, im %s %s years old \n My fav food is %s" , name, age, food);

//        //2
//        double distance =0;
//        System.out.print("Departure city :");
//        String city = scanner.nextLine();
//        System.out.print("Destination city :");
//        String destination = scanner.nextLine();
//        System.out.print("Velocity (Km/Hr) :");
//        double velocity = scanner.nextDouble();
//        System.out.print("Time :");
//        double time = scanner.nextDouble();
//
//        distance = velocity * time;
//        System.out.println("Travel Summary");
//        System.out.println("-------------------------");
//        System.out.println("Departure City: " + city);
//        System.out.println("Destination City: " + destination);
//        System.out.println("Distance : " + distance );
//        System.out.println("Trip fare : Rp" + distance * 3000);

        //3
        System.out.print("Product :");
        String product = scanner.nextLine();
        System.out.print("Quantity :");
        int quantity = scanner.nextInt();
        System.out.print("Price :");
        double price = scanner.nextDouble();
        System.out.print("Profit Margin (%) :");
        double profitMargin = scanner.nextDouble();

        double persen = profitMargin /100;
        double profit = price * persen  * quantity;
        double sell = price + (persen * price);

        System.out.println("Product :" + product);
        System.out.println("Selling Price :" + sell);
        System.out.println("Total Profit :" + profit);

    }
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.






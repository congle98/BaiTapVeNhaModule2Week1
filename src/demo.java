import java.util.Scanner;

public class demo {
    //bai1
    private static void checksonguyen  (int number){
        if (number >= 0){
            System.out.println(number+" là số nguyên dương");
        }
        else{
            System.out.println(number+" là số nguyên âm");
        }
    }
    //bai2
    private static boolean kiemtracanhtamgiacvuong (double a,double b,double c){
        if(a == Math.sqrt(b*b+c*c)){
            return true;
        }
        else if(b == Math.sqrt(a*a+c*c)){
            return true;
        }
        else if(c == Math.sqrt(a*a+b*b)){
            return true;
        }
        else {
            return false;
        }
    }
    //bai3
    private static void fizzbuzz(int number){
        if((number%3==0) && (number%5==0)){
            System.out.println("FIZZBUZZ");
        }
        else if(number%3==0){
            System.out.println("FIZZ");
        }
        else if(number%5==0){
            System.out.println("BUZZ");
        }
    }
    //bai4
    private static boolean checknguyento(int number){
        boolean check = true;
        if(number <= 2){
            check = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if(number%i==0){
                    check = false;
                }
            }
        }
        return check;
    }

    //bai5
    private static void giaiphuongtrinhbac2(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2 aX^2+bX+c=0");
            System.out.println("Mời nhập a :");
            double a = sc.nextDouble();
            System.out.println("Mời nhập b :");
            double b = sc.nextDouble();
            System.out.println("Mời nhập c :");
            double c = sc.nextDouble();
            double delta = (Math.pow(b,2))-(4*a*c);
            if(delta<0){
                System.out.println("Phương trình vô nhiệm");
            }
            else if(delta==0){
                double x = (-b)/(2*a);
                System.out.println("Phương trình có 2 nghiệm kép là: "+x);
            }
            else {
                double x1 = ((-b)+(Math.sqrt(delta)))/(a*2);
                double x2 = ((-b)-(Math.sqrt(delta)))/(a*2);
                System.out.println("Phương trình có 2 nghiệm x1 là: "+x1+" và x2: "+x2);
            }
            System.out.println("Bạn muốn nhập lại?? (c/k)");
            String check =new Scanner(System.in).nextLine();
            if (check.equalsIgnoreCase("k")){
                System.out.println("cảm ơn đã sử dụng phần mềm");
                break;
            }
        }
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        //demo ktrasonguyen
//        System.out.println("Mời nhập 1 số nguyên");
//        int number = scanner.nextInt();
//        checksonguyen(number);


        //demo 3 canh tam giac
//        System.out.println("mời nhập lần lượt 3 cạnh:");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        System.out.println(kiemtracanhtamgiacvuong(a,b,c));

        //demo fizzbuzz
//        System.out.println("Mời nhập 1 số nguyên");
//        int number = scanner.nextInt();
//        fizzbuzz(number);


        //demo checknguyento
//        System.out.println("Mời nhập 1 số nguyên");
//        int number = scanner.nextInt();
//        System.out.println(checknguyento(number));

        //demo giaiphuongtrinhbac2
         giaiphuongtrinhbac2();

    }
}

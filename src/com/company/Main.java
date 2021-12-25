package com.company;
import javax.xml.namespace.QName;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        /*Câu 1*/
//                int num;
//                System.out.print("Số dòng hình tam giác: ");
//                Scanner input = new Scanner(System.in);
//                num = input.nextInt();
//                for (int r = 1; r <= num; r++) {
//                    for (int sp = num - r; sp > 0; sp--) {
//                        System.out.print(" ");
//                    }
//                    for (int c = 1; c <= r; c++) {
//                        System.out.print(r);
//                    }
//                    for (int k = 2; k <= r; k++) {
//                        System.out.print(r);
//                    }
//                    System.out.println();
//                }

        /*Câu 2*/

//        String s = "You only live once, but if you do it right, once is enough";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'o') {
//                System.out.println("Index của chữ  o: " + i);
//                count++;
//            }
//        }
//        System.out.println("Số lần ký tự o xuất hiện là: " + count);

        /*Câu 3*/
//        int temp;
//        boolean isPrime=true;
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Nhập vào số cần kiểm tra:");
//        int num=scan.nextInt();
//        scan.close();
//        for(int i=2;i<=num/2;i++)
//        {
//            temp=num%i;
//            if(temp==0)
//            {
//                isPrime=false;
//                break;
//            }
//        }
//        if(isPrime)
//            System.out.println(num + " Là số nguyên tố!");
//        else
//            System.out.println(num + " Không phải là số nguyên tố!");
        /*Câu 4*/
//        System.out.println("10 số nguyên tố đầu tiên là: ");
//        int MAX =10;
//        int count = 0;
//        for(int i = 0; count < MAX; i++){
//
//                System.out.print( + i + "\t");
//                count++;
//        }
//        System.out.println();
//
//        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
//        for (int i = 0; i < 10; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    public static boolean isPrimeNumber(int n) {
//        if (n < 2) {
//            return false;
//        }
//        int squareRoot = (int) Math.sqrt(n);
//        for (int i = 2; i <= squareRoot; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;

        /*Câu 6*/
//        int soDong, soCot;
//
//        Scanner scanner = new Scanner(System.in);
//        int n;  // bậc của ma trận vuông
//        int sum = 0;
//
//
//
//        System.out.println("Nhập vào bậc của ma trận: ");
//        n = scanner.nextInt();
//        System.out.println("Nhập vào số dòng của mảng: ");
//        soDong = scanner.nextInt();
//        System.out.println("Nhập vào số cột của mảng: ");
//        soCot = scanner.nextInt();
//
//        int[][] A = new int[soDong][soCot];
//
//        for (int i = 0; i < soDong; i++) {
//            for (int j = 0; j < soCot; j++) {
//                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
//                A[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println("Mảng vừa nhập: ");
//        for (int i = 0; i < soDong; i++) {
//            for (int j = 0; j < soCot; j++) {
//                System.out.print(A[i][j] + "\t");
//            }
//
//            System.out.println("\n");
//
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // kiểm tra nếu i == j thì mới tính tổng
//                if (i == j) {
//                    sum += A[i][j];
//                }
//            }
//            System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
//        }


        /*Câu 5*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name = sc.nextLine();
        String[] arr = name.split(" ");
        String name1 = "";
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        for (String x : arr) {
            name1 = name1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
            name1 = name1 + " ";
        }
        System.out.println("Biến các chữ đầu thành hoa: " + name1);


        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);


            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }

    }

}



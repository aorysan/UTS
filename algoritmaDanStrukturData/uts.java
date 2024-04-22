import java.util.Scanner;

class uts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int data[] = {10, 10, 29, 38, 35, 10, 28, 47, 18, 31, 33, 39, 40, 49, 1, 43, 7};

        pengurutan merge = new pengurutan();

        System.out.println("Data sebelum pengurutan : ");

        merge.display(data);

        merge.sort(data, 0, data.length-1);
        System.out.println("\nData setelah pengurutan : ");
        merge.display(data);
        
        System.out.println("Pencarian data");
        System.out.print("Silahkan mencari data : ");
        int cari = sc.nextInt();

        merge.search(cari, data);
    }
}
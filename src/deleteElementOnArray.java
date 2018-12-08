import java.util.Scanner;

public class deleteElementOnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] =  new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3]  = 7;
        array [4] = 8;

        // In ra cac gia tri trong mang
        System.out.println("Elements on Array:");
        for(int i: array){
            System.out.print(i + "\t");
        }

        // Nhap gia tri muon xoa
        System.out.println("\nEnter Value that you want to delete: ");
        int deletedElement = input.nextInt();

        boolean isValueOnArray = false;
        for (int i=0; i< array.length; i++){
            if (array[i] == deletedElement){
                isValueOnArray = true;
                for (int j = i; j< array.length-1;j++){
                    array[j]=array[j+1];
                }
            }
        }

        if (!isValueOnArray) {
            System.out.println("the Value is not found on Array");
        }

        //In ra mang moi
        System.out.println("Current Array:");
        for(int i: array){
            System.out.print(i + "\t");
        }
    }
}

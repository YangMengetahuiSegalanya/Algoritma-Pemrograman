import java.util.Scanner; 

public class SegitigaSiku  {
    public static void main(String[] args) {
        int i, j, n, s;
        System.out.print ("Masukan jumlah baris : ");
        Scanner sc = new Scanner(System.in);
        n = (int) sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            s = n - i;
            for(j = 1; j <= s; j++)
            {
                System.out.print(" ");  
            }
            for (j = 1; j <= i; j++)
            {
                System.out.print("*" );  
            }
        System.out.println();
        }
    }    
} 
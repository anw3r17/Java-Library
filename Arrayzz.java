import java.util.*;
public class Arrayzz {
    public static void main(String arg[]){
    Scanner s = new Scanner(System.in);
    int n, i, j;
    System.out.println("Enter the size of Array:\n");
    n = s.nextInt();
    int a[] = new int[n];
    int b[][]= new int[15][15];
    System.out.println("Enter the elements into the array:\n");
    for(i = 0; i < n; i++){
        a[i] = s.nextInt();
    }
    System.out.println("The Elements of the array are:\n");
    for(i = 0; i < n; i++){
        System.out.println(a[i]);
    }
    int c[] = {1, 61, 251, 164, 33}; //  direct initialization 1d
    int d[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // direct intialization 2d
    for(i = 0; i < 3; i++){ ///print 2d elements
           for(j = 0; j < 3; j++){
            System.out.println(d[i][j]);
           }
           System.out.println("");
    }
    /// copy elements from 1 array to another
    int e[] = {10, 20, 30, 40, 50};
    int f[] = new int[e.length];
    for(i = 0; i < e.length; i++){
        f[i] = e[i];
    }
    System.out.println("Original Array:\n");
    for(i = 0; i < e.length; i++){
        System.out.println(e[i]);
    }
    System.out.println("Copied Array:\n");
    for(i = 0; i < f.length; i++){
        System.out.println(f[i]);
    }
    // largest element in array e
    int max= e[0];
    for(i = 0; i < e.length; i++){
        max = e[i];
    }
    System.out.println("Largest element in array is:\n");
    System.out.println(max);
    //even posi print
    System.out.println("even posi:\n");
    for(i = 0; i < e.length; i = i+2){
    
        System.out.println(e[i]);
    }
    //odd posi print
    System.out.println("odd posi:\n");
    for(i = 1; i < e.length; i = i+1){
        
        System.out.println(e[i]);
    }
    //addition between 2 matrix 
    int p[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int z[][] = {{9, 2, 0}, {5, 57, 1}, {6, 1, 4}};
    int matrixsize = 3;
    System.out.println("First matrix is defnied as:\n");
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            System.out.println(p[i][j] + " ");
        }
        System.out.println("");
    }
    System.out.println("Second matrix is defnied as:\n");
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){ 
            System.out.println(z[i][j] + " ");
        }
        System.out.println("");
    }
    int m[][] = new int[3][3];
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            m[i][j] = p[i][j] + z[i][j];
        }
    }
    System.out.println("Addition matrix is defnied as:\n");
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            System.out.println(m[i][j] + " ");
        }
        System.out.println("");
    }
}
}


package oraimunka_0227;

public class OraiMunka_0227 {

    public static void main(String[] args) {
        for (int i = 3; i >= -3; i--){
            int abs = i;
            if (i < 0){
                abs *= -1;
            }
            System.out.printf("|%3d| = %2d\n", i, Math.abs(i));
        }
        System.out.println("");
        
        final int M = 10;
        int[] tomb = new int[M];
        for (int i = 0; i < M; i++){
            tomb[i] = (int)(Math.random()*45)*2+11;
        }
        tomb[M/2]++;
        
        for (int i = 0; i < M; i++){
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
        
        int i = 0;
        while (!(tomb[i] % 2 == 0)){
            i++;
        }
        System.out.println("Az első páros szám: " + tomb[i]);
    }
    
}

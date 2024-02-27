
package oraimunka_0227;

public class GyakorlasTombre {
    public static void main(String[] args) {
        final int M = 9;
        //String[] szo = "abc"; //3 elemű char tömb
        //String[] betuk = {"a", "\n", " ", " "};
        char[] betuk = {'a', '\n', ' '}; //üres nem lehet
        
        //betuk = {'a','a','a','a','a'};//csak inicializálásnál
        betuk = new char[M];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        betuk[4] = 'x';
        betuk[5] = 'x';
        
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
        
        System.out.println("betűk 3x3-as mátrixban, sorban: ");
        /* feltöltés */
        for (int i = 0; i < M; i++) {
            betuk[i] = (char)(i+97);
        }
        
        /* megjelenítés: */
        for (int i = 0; i < M; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print((char)(i+97) + " ");
        }
        System.out.println("");
        
        System.out.println("betűk 3x3-as mátrixban, keverve: ");
        /* keverés: */
        //kézzel:
        //int[] sorrend = {2,4,6,7,8,3,5,0,1};
        //algoritmussal:
        int[] sorrend = {0,1,2,3,4,5,6,7,8};
        for (int i = 0; i < M; i++) {
            int t = (int)(Math.random()*M);
            int temp = sorrend[i];
            sorrend[i] = sorrend[t];
            sorrend[t] = temp;
        }
            
        /* megjelenítés: */ 
        for (int i = 0; i < M; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            int index = sorrend[i];
            char betu = betuk[index];
            System.out.print(betu + " ");
            /* egy sorban: */
            //System.out.print(betuk[sorrend[i] + " ");                    
        }
        System.out.println("");        
    }
}

package oraimunka_0227;

public class GyakorlasCiklusra {
    public static void main(String[] args) {
        final int M = 9;
        /* ASCII a=97, b=98, A=65 */
        for (int i = 0; i < M; i++) {
            //System.out.print((char)(i+97)+ " ");
        }
        System.out.println("");
        
        for (char c = 'a'; c <= 'i'; c++) {
            System.out.print(c + "(" + (int)c + ") ");
        }
        System.out.println("");
        
        System.out.println("3x3-as mátrixban: ");
        /* a b c
           d e f
           g h i */
        /* az if-be elég az i ! 3 == 0 */
        ///for (int i = 97; i <= 105; i++) {
        for (int i = 0; i < M; i++) {
           //if(i % 3 == 0){
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
             System.out.print((char)(i+97) + " ");
        }
        System.out.println("");
    }
}
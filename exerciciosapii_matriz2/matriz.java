package exerciciosapii_matriz2;
import java.util.Random;
public class matriz {
    
    /**
     * Inserir valores na matriz
     * @param m float[][]
     */
    public static void inserir(float [][] m){
        Random rd = new Random();
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = rd.nextFloat()*10;
            }
        }
    }
    /**
     * Soma os valores da diagonal secundaria
     * @param m float [][]
     * @return 
     */
    public static float somar(float [][] m){
        
        float soma=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(i+j==m.length-1){
                    soma+= m[i][j];
                }
            }
        }
        return soma;
    }
    
    
    public static void exibir(float[][]m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
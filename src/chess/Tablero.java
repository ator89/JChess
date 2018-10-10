
package chess;


public class Tablero {
    
    public String[][] tablero;
    
    public Tablero(){
        tablero= new String[8][8];
        
        tablero[0][0]="TN";
        tablero[0][1]="CN";
        tablero[0][2]="AN";
        tablero[0][3]="QN";
        tablero[0][4]="KN";
        tablero[0][5]="AN";
        tablero[0][6]="CN";
        tablero[0][7]="TN";
        
        tablero[1][0]="PN";
        tablero[1][1]="PN";
        tablero[1][2]="PN";
        tablero[1][3]="PN";
        tablero[1][4]="PN";
        tablero[1][5]="PN";
        tablero[1][6]="PN";
        tablero[1][7]="PN";
        
        tablero[6][0]="TB";
        tablero[6][1]="CB";
        tablero[6][2]="AB";
        tablero[6][3]="QB";
        tablero[6][4]="KB";
        tablero[6][5]="AB";
        tablero[6][6]="CB";
        tablero[6][7]="TB";
        
        tablero[7][0]="PB";
        tablero[7][1]="PB";
        tablero[7][2]="PB";
        tablero[7][3]="PB";
        tablero[7][4]="PB";
        tablero[7][5]="PB";
        tablero[7][6]="PB";
        tablero[7][7]="PB";
        
        
    }
    
    public void imprimir(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==null){
                    tablero[i][j]="__";
                }
                System.out.print(tablero[i][j]+" ");                
            }
            System.out.println("");            
        }
    }

}

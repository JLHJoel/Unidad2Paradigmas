package ejer20;

public class estatica {

    public static boolean bisiesto(int num){
        if(num % 4==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int aleatorio(int min, int max){
        return (int)(Math.random() * (max-min+1) + min);
    }

    public static int suma5(int valor){
        int incremento=5;
        valor += incremento;
        return valor; 
    }

    
}

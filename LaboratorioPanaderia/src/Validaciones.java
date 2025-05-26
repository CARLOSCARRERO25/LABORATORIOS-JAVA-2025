import java.util.ArrayList;
import java.util.List;



public class Validaciones {
    
    
     public static boolean esNumeroEntre1y9(String s) {
           if (s.length() != 1) {
               return false; // Asegúrate de que solo hay un carácter
           }
           char c = s.charAt(0);
           return Character.isDigit(c) && c != '0';
       }
     

    public static boolean EsNumero(String numeroString){
        if(numeroString.isEmpty()){
            return false;
        }else{
            try
            {   
                Integer.valueOf(numeroString);
                return true;
                /* code */
            } 
            catch(NumberFormatException e){
            //        std::cerr << e.what() << '\n';
                return false;
            }
        }
    }
    
    
    
    public static boolean listaVaciaPedidos(List<Pedido> listaPedidos){
    
    
    if(listaPedidos.isEmpty())
                    {return true;}
    
    
    return falseS;
    }
    
    
}
    


    




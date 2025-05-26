



public class Validaciones {
    
    
     public static boolean esNumeroEntre1y9(String s) {
           if (s.length() != 1) {
               return false; // Asegúrate de que solo hay un carácter
           }
           char c = s.charAt(0);
           return Character.isDigit(c) && c != '0';
       }
     
    /**
     *
     * @param numeroString
     * @return
     */
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
}
    


    




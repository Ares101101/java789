package function;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public  class FunctionImplement implements Function {



    @Override
    public String reverce(String texto ) {
        if (texto.length()> 1){
            String textoReverse = "";
            for (int i = 0; i < texto.length(); i++) {
                textoReverse = texto.charAt(i) + textoReverse;
            }
            System.out.println(textoReverse);
            return textoReverse;
        }
        return texto;
    }

}


package function;

import javax.imageio.IIOException;
import java.io.*;
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

    @Override
    public int DividePorCero(int arg) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = arg/0;
        } catch (ArithmeticException e){
           throw new ArithmeticException();
        }
        return resultado;
    }

    @Override
    public void copyFile(InputStream fileIn, OutputStream fileOut) {
            try {
                byte[] datos = fileIn.readAllBytes();
                fileOut.write(datos);
            }catch (IOException e){
                System.out.println("Archivo a copiar no existe" + e.getMessage());
            }
    }

    @Override
    public InputStream newImputStream(String archivo) {

        try {
            InputStream nuewInput = new FileInputStream(archivo);

            try {
                byte[] datos = nuewInput.readAllBytes();
                for (byte dato :datos){
                    System.out.println((char)dato);
                    return nuewInput;
                }
            }
            catch (IOException e ){
                System.out.println("no puedo leer este fichero" + e.getMessage());
            }

        }catch (FileNotFoundException e ){
            System.out.println("da error" + e.getMessage());

        }
        return null;
    }
}


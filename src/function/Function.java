package function;


import java.io.InputStream;
import java.io.OutputStream;

public interface Function {

    public String reverce ( String texto  );
    public int DividePorCero (int arg);
    public void copyFile( InputStream fileIn , OutputStream fileOut );
    public InputStream newImputStream(String archivo);
}

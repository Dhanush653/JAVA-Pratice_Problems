import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try{
            instream = new FileInputStream("D:\\Fincare\\DemoPratice\\JAVA_Pratice\\ByteDemo.txt");
            outstream = new FileOutputStream("D:\\Fincare\\DemoPratice\\JAVA_Pratice\\Bytewrite.txt");
            int content;
            while((content=instream.read()) != -1){
                outstream.write ((byte) content);
            }
        }
        finally {
            if(instream != null){
                instream.close();
            }
            if(outstream != null){
                outstream.close();
            }
        }
    }
}

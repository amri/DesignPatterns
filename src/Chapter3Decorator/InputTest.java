package Chapter3Decorator;

import sun.tools.java.SyntaxError;

import java.io.*;

/**
 * Created by amri on 8/8/14.
 */
class LowercaseInputStream extends FilterInputStream {
    public LowercaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException
    {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));

    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}

public class InputTest
{
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c=in.read())>=0)
            {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
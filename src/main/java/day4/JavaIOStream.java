package day4;

import java.io.*;

public class JavaIOStream {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try{
            in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\io\\HelloWorld.txt");
            out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\io\\123.txt");
            int c = in.read();
            while((c = in.read()) != -1)
            {
                System.out.println((char)c);
                out.write(c);
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                // process the line.
//            }
//        }


        String dirName  = "";
        File d = new File(dirName);
        for (String path : d.list())
        {
            System.out.println(d);
        }
    }
}

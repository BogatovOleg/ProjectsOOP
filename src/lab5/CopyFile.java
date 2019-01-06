package lab5;

import java.io.*;
import java.nio.file.Files;

public class CopyFile {

    public static void copyFileJava(File oldFile, File newFile)throws IOException {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(oldFile);
            os = new FileOutputStream(newFile);
            byte[] buffer = new byte[4*1024*1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }

    }

}

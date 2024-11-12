import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex3 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("main/lab12/input.txt");
             FileOutputStream out = new FileOutputStream("main/lab12/output/txt")) {
            byte[] buffer = new byte[in.available()];
            in.read()
        }
    }
}

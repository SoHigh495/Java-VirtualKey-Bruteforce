import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] a) throws FileNotFoundException {
        File file = new File("keys.txt");
        PrintStream stream = new PrintStream(file);
        for (int i = 0; i < 1000000; ++i) {
            String text = java.awt.event.KeyEvent.getKeyText(i);
            if (!text.contains("Unbekannt keyCode: ") && !text.contains("Unknown keyCode: ")) {
                System.setOut(stream);
                System.out.println("" + i + " -- " + text);
            }
        }
    }
}
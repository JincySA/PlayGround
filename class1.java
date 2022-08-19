import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;

class GFG {
    static String censor(String text,
            String word) throws IOException {
        String stars = ;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != ' ') {
                stars += '#';
            } else {
                stars += ' ';
            }
        text = text.replaceAll(word, stars);

        File path = new File(E:
ewtextfile.txt);
        FileWriter wr = new FileWriter(path);
        wr.write(text);
        wr.flush();
        wr.close();
        return text;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(E:	extfile.txt);
        String extract = Files.readString(fileName);
        String cen = consectetur adipiscing elit;
        System.out.println(censor(extract, cen));
    }
}

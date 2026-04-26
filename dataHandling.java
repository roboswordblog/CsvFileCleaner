import java.io.IOException;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
public class dataHandling{
    String file;
    HashMap<String, String[]> fileData;

    HashMap<String,String[]> load(String files) throws IOException {
        file = files;
        String content = Files.readString(Path.of(files));
        String[] lines = content.split("\n");

        return fileData;
    }

}

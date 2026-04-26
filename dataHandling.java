import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
public class dataHandling{
    String file;
    HashMap<String, ArrayList<String>> fileData;

    HashMap<String, ArrayList<String>> load(String files) throws IOException {
        file = files;
        String content = Files.readString(Path.of(files));
        return fileData;
    }

}

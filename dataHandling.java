import java.io.IOException;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class dataHandling{
    String file;
    ArrayList<ArrayList<ArrayList<String>>> fileData = new ArrayList<>();

    ArrayList<ArrayList<ArrayList<String>>> load(String files) throws IOException {

        fileData.clear();
        file = files;
        String content = Files.readString(Path.of(files));
        String[] lines = content.split("\\r?\\n");
        for (int i=0;i<lines[0].split(",").length;i++){

        }
        return fileData;
    }

}

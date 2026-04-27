import java.io.IOException;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class dataHandling{
    String file;
    ArrayList<String[]> fileData = new ArrayList<>();

    String[][][] load(String files) throws IOException {

        fileData.clear();
        file = files;
        String content = Files.readString(Path.of(files));
        if (content.isEmpty()) return new String[0][0][0];
        String[] lines = content.split("\\r?\\n");
        String[] titles = lines[0].split(",");
        // fileData.add(titles);
        for (int i=1;i<lines.length;i++){
            fileData.add(lines[i].split(","));
        }
        return new String[][][]{new String[][]{titles},fileData.toArray(new String[0][])};

    }
    void dropNa(){

    }

}

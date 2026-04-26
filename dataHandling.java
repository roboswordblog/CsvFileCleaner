import java.io.IOException;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class dataHandling{
    String file;
    HashMap<String, ArrayList<String>> fileData;

    HashMap<String,ArrayList<String>> load(String files) throws IOException {
        file = files;
        String content = Files.readString(Path.of(files));
        String[] lines = content.split("\n");
        for (int i=0;i<lines[0].split(",").length;i++){
            ArrayList<String> thingies = new ArrayList<>();
            for (int j=1;j<lines.length;j++){
                String[] stuff = lines[j].split(",");
                thingies.add(stuff[0]);
            }
            fileData.put(lines[0].split(",")[0], thingies);
        }
        return fileData;
    }

}

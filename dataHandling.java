import java.io.IOException;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class dataHandling{
    String file;
    HashMap<String, ArrayList<String>> fileData = new HashMap<>();

    HashMap<String,ArrayList<String>> load(String files) throws IOException {

        fileData.clear();
        file = files;
        String content = Files.readString(Path.of(files));
        String[] lines = content.split("\\r?\\n");
        for (int i=0;i<lines[0].split(",").length;i++){
            ArrayList<String> thingies = new ArrayList<>();
            for (int j=1;j<lines.length;j++){
                String[] stuff = lines[j].split(",");
                if (i < stuff.length) {
                    thingies.add(stuff[i]);
                } else {
                    thingies.add("");
                }
            }
            fileData.put(lines[0].split(",")[i], thingies);
        }
        return fileData;
    }

}

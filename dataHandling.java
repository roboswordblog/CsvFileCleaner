import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class dataHandling{
    String file;
    static ArrayList<String[]> fileData = new ArrayList<>();
    static String[] title;
    String[][][] load(String files) throws IOException {

        fileData.clear();
        file = files;
        String content = Files.readString(Path.of(files));
        if (content.isEmpty()) return new String[0][0][0];
        String[] lines = content.split("\\r?\\n");
        String[] titles = lines[0].split(",");
        title = titles;
        // fileData.add(titles);
        for (int i=1;i<lines.length;i++){
            fileData.add(lines[i].split(","));
        }
        return new String[][][]{new String[][]{titles},fileData.toArray(new String[0][])};

    }
    void dropNa(){
        fileData.removeIf(row -> Arrays.asList(row).contains("NaN"));
    }
    void save() throws IOException {
        StringBuilder totalData = new StringBuilder();

        for (int i = 0; i < title.length; i++) {
            totalData.append(title[i]);
            if (i < title.length - 1) totalData.append(",");
        }
        totalData.append("\n");

        for (String[] row : fileData) {
            for (int i = 0; i < row.length; i++) {
                totalData.append(row[i]);
                if (i < row.length - 1) totalData.append(",");
            }
            totalData.append("\n");
        }

        Files.writeString(Path.of(file), totalData.toString());
    }
    void replaceStuff(String a, String b){
        for (int i = 0; i < dataHandling.fileData.size(); i++) {
            String[] row = dataHandling.fileData.get(i);
            for (int j = 0; j < row.length; j++) {

            }
        }
    }
}

import java.util.HashMap;
import java.util.ArrayList;
public class dataHandling{
    String file;
    HashMap<String, ArrayList<String>> fileData;

    HashMap<String, ArrayList<String>> load(String files){
        file = files;
        return fileData;
    }

}

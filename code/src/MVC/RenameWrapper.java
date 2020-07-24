package MVC;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class RenameWrapper {
    private String filename;

    private String revisedFilename;

    public RenameWrapper(String filename) {
        this.filename = filename;
        revisedFilename = "";
    }

    public void getInformation() throws IOException {
        JSONObject showInformation = ShowInfoFromAPI.getShowInformation("s");

        
    }
}

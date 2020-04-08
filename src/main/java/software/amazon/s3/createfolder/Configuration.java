package software.amazon.s3.createfolder;

import java.util.Map;
import org.json.JSONObject;
import org.json.JSONTokener;

class Configuration extends BaseConfiguration {

    public Configuration() {
        super("aws-s3-createfolder.json");
    }
}

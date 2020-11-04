package pojo;

import java.util.HashMap;
import java.util.Map;

public class Usuario {

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String username;
    public String password;

    public Map<String, Object> getUser() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("username", "testuser");
        jsonAsMap.put("password", "testpass");
        return jsonAsMap;
    }



}

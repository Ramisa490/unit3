package framework.models;

import lombok.Getter;

@Getter
public class Env {
    private String env;

    public Object getEnv() {
        return env;
    }
}

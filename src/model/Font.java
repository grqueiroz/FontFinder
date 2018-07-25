package model;

import java.util.List;

public class Font {

    private String name;
    private String type;
    private List<Feature> features;

    public Font(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    void setFeatures(List<Feature> features) {
        this.features = features;
    }
}

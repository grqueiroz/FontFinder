package feature;

import model.Feature;

import java.util.List;

public class FeatureManager {

    private static final FeatureManager INSTANCE = new FeatureManager();

    public static FeatureManager getInstance() {
        return INSTANCE;
    }

    public List<Feature> getAllFeatures() {
        return FeatureManagerImpl.getAllFeatures();
    }

    public List<Feature> getFeaturesByFont(String font) {
        return FeatureManagerImpl.getFeaturesByFont(font);
    }

}

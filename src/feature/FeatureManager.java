package feature;

import model.Feature;

import java.util.List;

public class FeatureManager {

    private static final FeatureManager INSTANCE = new FeatureManager();

    public static FeatureManager getInstance() {
        return INSTANCE;
    }

    private FeatureManagerImpl featureManagerImpl = FeatureManagerImpl.getInstance();

    public List<Feature> getAllFeatures() {
        return featureManagerImpl.getAllFeatures();
    }

    public List<Feature> getFeaturesByFont(String font) {
        return featureManagerImpl.getFeaturesByFont(font);
    }

}

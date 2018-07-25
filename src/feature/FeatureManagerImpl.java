package feature;

import model.Feature;

import java.util.List;

class FeatureManagerImpl {

    private static final FeatureManagerImpl INSTANCE = new FeatureManagerImpl();

    public static FeatureManagerImpl getInstance() {
        return INSTANCE;
    }

    private FeatureDAO featureDAO = FeatureDAO.getInstance();

    List<Feature> getAllFeatures() {
        return featureDAO.getAllFeatures();
    }

    List<Feature> getFeaturesByFont(String font) {
        return featureDAO.getFeaturesByFont(font);
    }

}

package feature;

import model.Feature;

import java.util.List;

class FeatureManagerImpl {

    static List<Feature> getAllFeatures() {
        return FeatureDAO.getAllFeatures();
    }

    static List<Feature> getFeaturesByFont(String font) {
        return FeatureDAO.getFeaturesByFont(font);
    }

}

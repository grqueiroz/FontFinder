import model.Feature;
import feature.FeatureManager;
import model.Font;
import font.FontManager;
import jdbc.JDBCHandler;

import java.util.List;


public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBCHandler jdbcHandler = new JDBCHandler();
        FontManager fontManager = FontManager.getInstance();
        FeatureManager featureManager = FeatureManager.getInstance();

        List<Font> fontList = fontManager.getAllFonts();
        List<Feature> featureList = featureManager.getAllFeatures();
        List<Feature> verdanaFeatureList = featureManager.getFeaturesByFont("Verdana");

        System.out.println("font:");
        for (Font font : fontList) {
            System.out.println("Name: " + font.getName() + "; type: " + font.getType());
        }
        System.out.println("--------------------------");

        System.out.println("feature:");
        for (Feature feature : featureList) {
            System.out.println(feature.getDescription());
        }
        System.out.println("--------------------------");


        System.out.println("Verdana feature:");
        for (Feature feature : verdanaFeatureList) {
            System.out.println("Feature: " + feature.getDescription());
        }

        jdbcHandler.closeConnection();
    }
}

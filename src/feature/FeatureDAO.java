package feature;

import jdbc.JDBCHandler;
import model.Feature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class FeatureDAO {

    private static final String SELECT_ALL = "SELECT" +
            " * FROM features ";

    private static final String SELECT_FEATURES_BY_FONT = " SELECT" +
            " * FROM features " +
            " WHERE description in (" +
            " SELECT feature from rel_fonts_features " +
            " WHERE font = ? " +
            " COLLATE NOCASE )";

    static List<Feature> getAllFeatures() {

        String sql = SELECT_ALL;
        List<Feature> featureList = new ArrayList<>();

        try {
            Connection connection = JDBCHandler.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Feature feature = new Feature(
                        rs.getString("DESCRIPTION")
                );

                featureList.add(feature);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return featureList;
    }

    static List<Feature> getFeaturesByFont(String font) {

        String sql = SELECT_FEATURES_BY_FONT;
        List<Feature> featureList = new ArrayList<>();

        try {
            Connection connection = JDBCHandler.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, font);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Feature feature = new Feature(
                        rs.getString("DESCRIPTION")
                );

                featureList.add(feature);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return featureList;
    }
    
}

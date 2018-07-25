package font;

import jdbc.JDBCHandler;
import model.Font;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class FontDAO {

    private static final String SELECT_ALL = "SELECT" +
            " * FROM fonts ";

    static List<Font> getAllFonts() {

        String sql = SELECT_ALL;
        List<Font> fontList = new ArrayList<>();

        try {
            Connection connection = JDBCHandler.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Font font = new Font(
                        rs.getString("NAME"),
                        rs.getString("TYPE")
                );

                fontList.add(font);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fontList;
    }

}

package font;

import model.Font;

import java.util.List;

class FontManagerImpl {

    static List<Font> getAllFonts() {
        return FontDAO.getAllFonts();
    }

}

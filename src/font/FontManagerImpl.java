package font;

import model.Font;

import java.util.List;

class FontManagerImpl {

    private static final FontManagerImpl INSTANCE = new FontManagerImpl();

    public static FontManagerImpl getInstance() {
        return INSTANCE;
    }
    
    private FontDAO fontDAO = FontDAO.getInstance();
    
    List<Font> getAllFonts() {
        return fontDAO.getAllFonts();
    }

}

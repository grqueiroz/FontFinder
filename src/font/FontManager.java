package font;

import model.Font;

import java.util.List;

public class FontManager {

    private static final FontManager INSTANCE = new FontManager();

    public static FontManager getInstance() {
        return INSTANCE;
    }

    private FontManagerImpl fontManagerImpl = FontManagerImpl.getInstance();

    public List<Font> getAllFonts() {
        return fontManagerImpl.getAllFonts();
    }

}

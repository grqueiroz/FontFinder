package command;

import feature.FeatureManager;
import font.FontManager;
import model.Font;

import java.util.Arrays;
import java.util.List;

class CommandExecutor {

    private static final CommandExecutor INSTANCE = new CommandExecutor();

    public static CommandExecutor getInstance() {
        return INSTANCE;
    }

    private FontManager fontManager = FontManager.getInstance();
    private FeatureManager featureManager = FeatureManager.getInstance();

    void listAllFonts() {
        List<Font> fontList = fontManager.getAllFonts();

        for (Font font : fontList) {
            System.out.println(font.getName());
        }
    }

    void listAllCommands() {
        System.out.println("Available commands:");
        Command[] commandArray = Command.values();

        for (Command command : commandArray) {
            System.out.println(command.getFriendlyCommand());
        }

        System.out.println();
    }

}

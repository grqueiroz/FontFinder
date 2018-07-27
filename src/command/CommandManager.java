package command;

import feature.FeatureManager;
import font.FontManager;
import model.Font;

import java.util.List;
import java.util.Scanner;

public class CommandManager {

    private static final CommandManager INSTANCE = new CommandManager();

    public static CommandManager getInstance() {
        return INSTANCE;
    }

    private CommandExecutor commandExecutor = CommandExecutor.getInstance();
    private Command command = Command.NO_COMAND;

    public void start() {

        while (!command.equals(Command.QUIT)) {

            System.out.println("Enter command:");
            String commandString = readCommandString();

            decode(commandString);
        }
    }

    private void decode(String commandString) {

        command = Command.getCommand(commandString);
        if (Command.LIST_ALL_FONTS.equals(command)) {
            commandExecutor.listAllFonts();
        } else if (Command.HELP.equals(command)) {
            commandExecutor.listAllCommands();
        } else if (Command.QUIT.equals(command)) {
            return;
        } else {
            commandExecutor.listAllCommands();
        }
    }

    private String readCommandString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine().trim().toLowerCase();
    }

}

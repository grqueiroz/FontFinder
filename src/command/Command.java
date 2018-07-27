package command;

enum Command {
    NO_COMAND(""),
    HELP("help"),
    LIST_ALL_FONTS("list fonts"),
    QUIT("quit");

    private String friendlyCommand;

    Command(String friendlyCommand) {
        this.friendlyCommand = friendlyCommand;
    }

    String getFriendlyCommand() {
        return friendlyCommand;
    }

    static Command getCommand(String friendlyCommand) {
        for (Command command : Command.values()) {
            if (command.friendlyCommand.equals(friendlyCommand)) {
                return command;
            }
        }

        return HELP;
    }
}

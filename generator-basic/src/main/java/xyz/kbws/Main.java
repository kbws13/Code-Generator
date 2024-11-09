package xyz.kbws;

import xyz.kbws.cli.CommandExecutor;

/**
 * @author kbws
 * @date 2023/11/9
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        //args = new String[]{"generate", "-l", "-a", "-o"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
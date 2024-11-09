package xyz.kbws.cli;

import picocli.CommandLine;
import picocli.CommandLine.*;
import xyz.kbws.cli.command.ConfigCommand;
import xyz.kbws.cli.command.GenerateCommand;
import xyz.kbws.cli.command.ListCommand;

/**
 * @author kbws
 * @date 2024/11/8
 * @description:
 */
@Command(name = "kcode", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());

    }

    @Override
    public void run() {
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    public void doExecute(String[] args) {
        commandLine.execute(args);
    }
}

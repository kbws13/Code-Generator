package xyz.kbws.maker.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 * @author kbws
 * @date 2024/11/8
 * @description:
 */
// 使用 @Command 注解标记一个类并为其命名，mixinStandardHelpOptions 设置为 true 可以自动添加 --help 和 --version 命令
@Command(name = "ASCIIArt", version = "ASCIIArt 1.0", mixinStandardHelpOptions = true)
// 创建一个实现 Runnable 或者 Callable 接口的类，这就是一个命令
public class ASCIIArt implements Runnable {

    // 使用 @Option 注解将字段设置为命令行选项，可以设置名称和描述
    @Option(names = {"-s", "--font-size"}, description = "Font Size")
    int fontSize = 19;

    // 使用 @Parameters 注解将字段设置为命令行参数，可以设置默认值、描述等
    @Parameters(paramLabel = "<word>", defaultValue = "Hello, Picocli", description = "Words to the translated into ASCII art.")
    private String[] words = {"Hello,", "Picocli"};

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ASCIIArt()).execute(args);
        System.exit(exitCode);
    }

    // 在 run 或者 call 方法中写业务逻辑，用户敲回车后（命令被解析后）被调用
    @Override
    public void run() {
        System.out.println("fontSize=" + fontSize);
        System.out.println("words=" + String.join(",", words));
    }
}

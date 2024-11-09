package xyz.kbws.cli.command;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import picocli.CommandLine.*;
import xyz.kbws.generator.MainGenerator;
import xyz.kbws.model.MainTemplateConfig;

import java.util.concurrent.Callable;

/**
 * @author kbws
 * @date 2024/11/8
 * @description:
 */
@Data
@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
public class GenerateCommand implements Callable<Integer> {

    @Option(names = {"-l", "-loop"}, arity = "0..1", description = "是否循环", interactive = true, echo = true)
    private boolean loop;

    @Option(names = {"-a", "-author"}, arity = "0..1", description = "作者", interactive = true, echo = true)
    private String author = "空白无上";

    @Option(names = {"-o", "-outputText"}, arity = "0..1", description = "输出文本", interactive = true, echo = true)
    private String outputText = "sum=";

    @Override
    public Integer call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        System.out.println("配置信息: " + mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}

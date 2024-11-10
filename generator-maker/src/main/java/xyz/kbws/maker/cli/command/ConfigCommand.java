package xyz.kbws.maker.cli.command;

import cn.hutool.core.util.ReflectUtil;
import picocli.CommandLine.Command;
import xyz.kbws.maker.model.DataModel;

import java.lang.reflect.Field;

/**
 * @author kbws
 * @date 2024/11/8
 * @description:
 */
@Command(name = "config", description = "查看参数信息", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("查看参数信息");

        Field[] fields = ReflectUtil.getFields(DataModel.class);

        // 遍历并打印每个字段的信息
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName());
            System.out.println("字段类型：" + field.getType());
            System.out.println("---------------------------");
        }
    }
}

package xyz.kbws.maker;

import freemarker.template.TemplateException;
import xyz.kbws.maker.generator.main.GenerateTemplate;
import xyz.kbws.maker.generator.main.MainGenerator;
import xyz.kbws.maker.generator.main.ZipGenerator;

import java.io.IOException;

/**
 * @author kbws
 * @date 2023/11/9
 * @description:
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        //MainGenerator mainGenerator = new MainGenerator();
        GenerateTemplate generateTemplate = new ZipGenerator();
        generateTemplate.doGenerate();
    }
}
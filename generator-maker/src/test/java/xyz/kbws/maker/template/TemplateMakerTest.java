package xyz.kbws.maker.template;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import org.junit.Test;
import xyz.kbws.maker.meta.Meta;
import xyz.kbws.maker.template.model.TemplateMakerConfig;
import xyz.kbws.maker.template.model.TemplateMakerFileConfig;
import xyz.kbws.maker.template.model.TemplateMakerModelConfig;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kbws
 * @date 2024/11/11
 * @description:
 */
public class TemplateMakerTest {

    /**
     * 使用 JSON 制作模板
     */
    @Test
    public void testMakeTemplateWithJSON() {
        String configStr = ResourceUtil.readUtf8Str("templateMaker.json");
        TemplateMakerConfig templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        long id = TemplateMaker.makeTemplate(templateMakerConfig);
        System.out.println(id);
    }

    /**
     * 制作 SpringBoot 模板
     */
    @Test
    public void makeSpringBootTemplate() {
        String rootPath = "examples/Spring-Template/";
        String configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker8.json");
        TemplateMakerConfig templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        long id = TemplateMaker.makeTemplate(templateMakerConfig);
        System.out.println(id);
    }


}
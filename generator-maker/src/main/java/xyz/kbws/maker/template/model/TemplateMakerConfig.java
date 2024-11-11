package xyz.kbws.maker.template.model;

import lombok.Data;
import xyz.kbws.maker.meta.Meta;

/**
 * @author kbws
 * @date 2024/11/11
 * @description: 模板制作配置
 */
@Data
public class TemplateMakerConfig {

    private Long id;

    private Meta meta = new Meta();

    private String originProjectPath;

    TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();

    TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();

    TemplateMakerOutputConfig outputConfig = new TemplateMakerOutputConfig();
}

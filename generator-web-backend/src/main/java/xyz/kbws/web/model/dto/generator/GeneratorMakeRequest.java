package xyz.kbws.web.model.dto.generator;

import lombok.Data;
import xyz.kbws.maker.meta.Meta;

import java.io.Serializable;

/**
 * @author kbws
 * @date 2024/11/16
 * @description: 制作代码生成器请求
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 压缩文件路径
     */
    private String zipFilePath;

    /**
     * 元信息
     */
    private Meta meta;

    private static final long serialVersionUID = -1749563427413773536L;
}

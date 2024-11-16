package xyz.kbws.web.model.dto.generator;

import lombok.Data;
import xyz.kbws.web.meta.Meta;

import java.io.Serializable;
import java.util.List;

/**
 * @author kbws
 * @date 2024/11/12
 * @description:
 */
@Data
public class GeneratorAddRequest implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 基础包
     */
    private String basePackage;

    /**
     * 版本
     */
    private String version;

    /**
     * 作者
     */
    private String author;

    /**
     * 标签列表（JSON 数组）
     */
    private List<String> tags;

    /**
     * 图片
     */
    private String picture;

    /**
     * 文件配置（JSON 字符串）
     */
    private Meta.FileConfig fileConfig;

    /**
     * 模型配置（JSON 字符串）
     */
    private Meta.ModelConfig modelConfig;

    /**
     * 代码生成器产物路径
     */
    private String distPath;

    /**
     * 状态
     */
    private Integer status;

    private static final long serialVersionUID = -7347064183312230466L;
}

package xyz.kbws.maker.model;

import lombok.Data;

/**
 * @author kbws
 * @date 2023/11/9
 * @description: 动态模板配置
 */
@Data
public class DataModel {
    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author;

    /**
     * 输出信息
     */
    private String outputText;
}

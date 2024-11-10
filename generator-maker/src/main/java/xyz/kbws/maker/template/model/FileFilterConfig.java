package xyz.kbws.maker.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author kbws
 * @date 2024/11/10
 * @description: 文件过滤配置
 */
@Data
@Builder
public class FileFilterConfig {
    /**
     * 过滤范围
     */
    private String range;

    /**
     * 过滤规则
     */
    private String rule;

    /**
     * 过滤值
     */
    private String value;
}

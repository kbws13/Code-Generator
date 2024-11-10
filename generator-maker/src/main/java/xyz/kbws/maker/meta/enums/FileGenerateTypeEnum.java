package xyz.kbws.maker.meta.enums;

/**
 * @author kbws
 * @date 2024/11/10
 * @description: 文件生成类型枚举
 */
public enum FileGenerateTypeEnum {

    DYNAMIC("动态", "dynamic"),
    STATIC("静态", "static");

    private final String text;

    private final String value;

    FileGenerateTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}



package xyz.kbws.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * @author kbws
 * @date 2023/11/9
 * @description: 静态文件生成
 */
public class StaticFileGenerator {

    /**
     * 拷贝文件（使用 Hutool 实现，会将输入目录完整的拷贝到输出目录下）
     *
     * @param inputPath  输入目录
     * @param outputPath 输出目录
     */
    public static void copyFileByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

}

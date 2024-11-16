package xyz.kbws.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.kbws.web.model.dto.generator.GeneratorQueryRequest;
import xyz.kbws.web.model.entity.Generator;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.kbws.web.model.vo.GeneratorVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author fangyuan
* @description 针对表【generator(代码生成器表)】的数据库操作Service
* @createDate 2024-11-12 21:45:52
*/
public interface GeneratorService extends IService<Generator> {

    void validGenerator(Generator generator, boolean add);

    QueryWrapper<Generator> getQueryWrapper(GeneratorQueryRequest generatorQueryRequest);

    GeneratorVO getGeneratorVO(Generator generator, HttpServletRequest request);

    Page<GeneratorVO> getGeneratorVOPage(Page<Generator> generatorPage, HttpServletRequest request);
}

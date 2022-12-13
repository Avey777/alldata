package cn.datax.service.data.standard.dao;

import cn.datax.common.base.BaseDao;
import cn.datax.service.data.standard.api.entity.ContrastEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * <p>
 * 对照表信息表 Mapper 接口
 * </p>
 *
 * @author AllDataDC
 * @date 2022-11-27
 */
@Mapper
public interface ContrastDao extends BaseDao<ContrastEntity> {

    @Override
    ContrastEntity selectById(Serializable id);

    IPage<ContrastEntity> statistic(IPage<ContrastEntity> page, @Param(Constants.WRAPPER) Wrapper<ContrastEntity> queryWrapper);
}

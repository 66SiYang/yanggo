package com.yanggo.goods.dao;

import com.yanggo.goods.pojo.Brand;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 描述
 *
 * @author 三国的包子
 * @version 1.0
 * @package com.yanggo.dao *
 * @since 1.0
 */

/**
 * Mapper<Brand>  指定通用的mapper的父接口:封装了所有的CRUD的操作
 * T  指定操作的表对应的POJO
 */
@Repository
public interface BrandMapper extends Mapper<Brand> {
}

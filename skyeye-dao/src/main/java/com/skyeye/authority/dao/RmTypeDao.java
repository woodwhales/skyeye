package com.skyeye.authority.dao;

import java.util.List;
import java.util.Map;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface RmTypeDao {

	public List<Map<String, Object>> queryRmTypeList(Map<String, Object> map, PageBounds pageBounds) throws Exception;

}
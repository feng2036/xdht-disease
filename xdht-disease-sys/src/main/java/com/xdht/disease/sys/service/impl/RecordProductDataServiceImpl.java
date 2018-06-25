package com.xdht.disease.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.xdht.disease.common.core.AbstractService;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.sys.dao.RecordProductDataMapper;
import com.xdht.disease.sys.model.RecordProductData;
import com.xdht.disease.sys.service.RecordProductDataService;
import com.xdht.disease.sys.vo.request.RecordProductDataRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;
import java.util.Map;


/**
 * Created by lzf on 2018/06/05.
 */
@Service
@Transactional
public class RecordProductDataServiceImpl extends AbstractService<RecordProductData> implements RecordProductDataService{

    @Autowired
    private RecordProductDataMapper recordProductDataMapper;


    @Override
    public List<Map<String, Object>> queryRecordDataByProduct(Long id) {
        return this.recordProductDataMapper.selectRecordDataByProduct(id);
    }
}

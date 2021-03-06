package com.xdht.disease.sys.service.impl;

import com.xdht.disease.common.core.AbstractService;
import com.xdht.disease.sys.dao.RecordVddEquipmentDataMapper;
import com.xdht.disease.sys.model.RecordVddEquipmentData;
import com.xdht.disease.sys.service.RecordVddEquipmentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * Created by lzf on 2018/06/06.
 */
@Service
@Transactional
public class RecordVddEquipmentDataServiceImpl extends AbstractService<RecordVddEquipmentData> implements RecordVddEquipmentDataService{

    @Autowired
    private RecordVddEquipmentDataMapper recordVddEquipmentDataMapper;


    @Override
    public List<Map<String, Object>> queryRecordDataByVddEquipment(Long id) {
        return this.recordVddEquipmentDataMapper.selectRecordDataByVddEquipment(id);
    }
}

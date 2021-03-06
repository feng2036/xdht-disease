package com.xdht.disease.sys.service;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.sys.model.RecordIndividualProtectiveEquipment;
import com.xdht.disease.common.core.Service;
import com.xdht.disease.sys.vo.request.RecordIndividualProtectiveEquipmentRequest;
import com.xdht.disease.sys.vo.request.RecordIndividualProtectiveInputRequest;
import com.xdht.disease.sys.vo.response.RecordIndividualProtectiveDetailResponse;

import java.util.List;


/**
 * Created by lzf on 2018/06/05.
 */
public interface RecordIndividualProtectiveEquipmentService extends Service<RecordIndividualProtectiveEquipment> {


    /**
     * 分页查询
     * @param recordRequest 查询条件
     * @return 返回结果
     */
    public PageResult<RecordIndividualProtectiveEquipment> queryListPage(RecordIndividualProtectiveEquipmentRequest recordRequest);

    /**
     * 添加
     * @param recordIndividualProtectiveInputRequest 实体
     */
    public  void add(RecordIndividualProtectiveInputRequest recordIndividualProtectiveInputRequest);

    /**
     * 删除
     * @param id 主键id
     */
    public  void delete(Long id);

    /**
     * 修改
     * @param recordIndividualProtectiveInputRequest 实体
     */
    public  void update(RecordIndividualProtectiveInputRequest recordIndividualProtectiveInputRequest);

    /**
     *  获取 个体防护用品调查表 信息
     * @param id 主键id
     * @return 返回结果
     */
    RecordIndividualProtectiveDetailResponse queryIndividualProtetiveDetail(Long id);
}

package com.xdht.disease.sys.service;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.sys.model.SysDictionary;
import com.xdht.disease.common.core.Service;
import com.xdht.disease.sys.vo.request.SysDictionaryRequest;


/**
 * Created by lzf on 2018/06/21.
 */
public interface SysDictionaryService extends Service<SysDictionary> {

    /**
     * 查询字典列表
     * @param sysDictionaryRequest 查询条件
     * @return 返回结果
     */
    PageResult<SysDictionary> querySysDictionaryPage(SysDictionaryRequest sysDictionaryRequest);

    /**
     * 添加字典
     * @param sysDictionary 字典实体
     */
    void addRole(SysDictionary sysDictionary);

    /**
     * 删除字典
     * @param id 字典主键id
     */
    void deleteRole(Long id);

    /**
     * 修改字典
     * @param sysDictionary 字典实体
     */
    void updateRole(SysDictionary sysDictionary);

}
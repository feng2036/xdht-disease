package com.xdht.disease.sys.controller;

import com.xdht.disease.common.authorization.annotation.CurrentUser;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.common.core.Result;
import com.xdht.disease.common.model.User;
import com.xdht.disease.sys.model.RecordBuildingAerationData;
import com.xdht.disease.sys.service.RecordBuildingAerationDataService;
import com.xdht.disease.sys.vo.request.RecordBuildingAerationDataRequest;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by L on 2018/5/30.
 */
@Log4j
@RestController
@RequestMapping(value = "/api/v1/recordBuildingAerationData")
public class RecordBuildingAerationDataController {

    @Autowired
    private RecordBuildingAerationDataService recordBuildingAerationDataService;

    @RequestMapping(value = "/recordList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "查询列表")
    public  ResponseEntity<Result<List<RecordBuildingAerationData>>> recordList(@CurrentUser User user, @RequestBody RecordBuildingAerationDataRequest recordBuildingAerationDataRequest) {
        return new ResponseEntity<>(Result.ok(recordBuildingAerationDataService.queryList(recordBuildingAerationDataRequest)), HttpStatus.OK);
    }
    @RequestMapping(value = "/recordPage", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "分页查询")
    public ResponseEntity<Result<PageResult<RecordBuildingAerationData>>> recordPage(@CurrentUser User user, @RequestBody RecordBuildingAerationDataRequest recordBuildingAerationDataRequest, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return new ResponseEntity<>(Result.ok(recordBuildingAerationDataService.queryListPage(recordBuildingAerationDataRequest,pageNum,pageSize)), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "添加")
    public ResponseEntity<Result<RecordBuildingAerationData>> add(@CurrentUser User user, @RequestBody RecordBuildingAerationData recordBuildingAerationData) {
        return new ResponseEntity<>(Result.ok(recordBuildingAerationDataService.add(recordBuildingAerationData)), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "删除")
    public ResponseEntity<Result<RecordBuildingAerationData>> delete(@CurrentUser User user, @RequestParam Long id) {
        return new ResponseEntity<>(Result.ok(recordBuildingAerationDataService.delete(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改")
    public ResponseEntity<Result<RecordBuildingAerationData>> update(@CurrentUser User user, @RequestBody RecordBuildingAerationData recordBuildingAerationData) {
        return new ResponseEntity<>(Result.ok(recordBuildingAerationDataService.update(recordBuildingAerationData)), HttpStatus.OK);
    }



}

package com.xdht.disease.sys.controller;

import com.xdht.disease.common.authorization.annotation.Authorization;
import com.xdht.disease.common.authorization.annotation.CurrentUser;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.common.core.Result;
import com.xdht.disease.common.model.User;
import com.xdht.disease.sys.model.RecordIndividualProtectiveEquipment;
import com.xdht.disease.sys.service.RecordIndividualProtectiveEquipmentService;
import com.xdht.disease.sys.vo.request.RecordIndividualProtectiveEquipmentRequest;
import com.xdht.disease.sys.vo.request.RecordIndividualProtectiveInputRequest;
import com.xdht.disease.sys.vo.response.RecordIndividualProtectiveDetailResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
@RequestMapping(value = "/api/v1/recordIndividualProtectiveEquipment")
public class RecordIndividualProtectiveEquipmentController {

    @Autowired
    private RecordIndividualProtectiveEquipmentService recordService;

    @RequestMapping(value = "/recordList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "查询列表")
    public  ResponseEntity<Result<List<RecordIndividualProtectiveEquipment>>> recordList(@RequestBody RecordIndividualProtectiveEquipmentRequest recordRequest) {
        return new ResponseEntity<>(Result.ok(recordService.queryList(recordRequest)), HttpStatus.OK);
    }
    @RequestMapping(value = "/pageList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "分页查询")
    public ResponseEntity<Result<PageResult<RecordIndividualProtectiveEquipment>>> recordPage(@RequestBody RecordIndividualProtectiveEquipmentRequest recordRequest) {
        return new ResponseEntity<>(Result.ok(recordService.queryListPage(recordRequest)), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "添加")
    @Authorization
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "authorization", required = true, dataType = "string", paramType = "header"),
    })
    public ResponseEntity<Result<RecordIndividualProtectiveEquipment>> add(@RequestBody RecordIndividualProtectiveInputRequest recordIndividualProtectiveInputRequest) {
        return new ResponseEntity<>(Result.ok(recordService.add(recordIndividualProtectiveInputRequest)), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "删除")
    @Authorization
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "authorization", required = true, dataType = "string", paramType = "header"),
    })
    public ResponseEntity<Result<RecordIndividualProtectiveEquipment>> delete(@PathVariable Long id) {
        return new ResponseEntity<>(Result.ok(recordService.delete(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "修改")
    @Authorization
    @ApiImplicitParams({
            @ApiImplicitParam(name = "authorization", value = "authorization", required = true, dataType = "string", paramType = "header"),
    })
    public ResponseEntity<Result<RecordIndividualProtectiveEquipment>> update(@RequestBody RecordIndividualProtectiveInputRequest recordIndividualProtectiveInputRequest) {
        return new ResponseEntity<>(Result.ok(recordService.update(recordIndividualProtectiveInputRequest)), HttpStatus.OK);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "获取 --详细内容")
    public ResponseEntity<Result<RecordIndividualProtectiveDetailResponse>> getRecordIndividualProtectiveDetail(@PathVariable Long id) {
        RecordIndividualProtectiveDetailResponse recordIndividualProtectiveDetailResponse = this.recordService.queryIndividualProtetiveDetail(id);
        return new ResponseEntity<>(Result.ok(recordIndividualProtectiveDetailResponse), HttpStatus.OK);
    }

}

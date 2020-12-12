package com.teenyda.controller.upload.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.upload.dto.Upload;
import com.teenyda.controller.upload.service.UploadService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Upload)表控制层
 *
 * @author makejava
 * @since 2020-12-12 14:13:29
 */
@RestController
@RequestMapping("card")
public class UploadController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private UploadService uploadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("list")
    public ResultBody<List<Upload>> selectOne() {
        return responseSuccessJson(this.uploadService.queryAllByLimit(0, 100));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("id/{id}")
    public ResultBody<Upload> byId(@PathVariable("id") Integer id) {
        return responseSuccessJson(this.uploadService.queryById(id));
    }

    @PostMapping("add")
    public ResultBody<Upload> insert(@RequestBody Upload upload) {
        upload.setUploadDate(new Date());
        return responseSuccessJson(this.uploadService.insert(upload));
    }

    @GetMapping("last")
    public ResultBody<Upload> last() {
        return responseSuccessJson(this.uploadService.queryByLast());
    }

}
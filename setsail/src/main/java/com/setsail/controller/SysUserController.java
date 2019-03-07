package com.setsail.controller;


import com.setsail.common.JsonData;
import com.setsail.param.DeptParam;
import com.setsail.param.UserParam;
import com.setsail.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/sys/user")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 新增接口
     * @param param
     * @return
     */
    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(UserParam param) {
        sysUserService.save(param);
        return JsonData.success();
    }

    /**
     * 更新接口
     * @param param
     * @return
     */
    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(UserParam param) {
        sysUserService.update(param);
        return JsonData.success();
    }


}

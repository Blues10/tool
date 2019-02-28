package com.setsail.controller;

import com.setsail.common.ApplicationContextHelper;
import com.setsail.common.JsonData;
import com.setsail.dao.SysAclModuleMapper;
import com.setsail.exception.PermissionException;
import com.setsail.model.SysAclModule;
import com.setsail.param.TestVo;
import com.setsail.util.BeanValidator;
import com.setsail.util.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

   @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello(){
       log.info("hello");
       throw new RuntimeException("test exception");
       //return JsonData.success("hello yyyyy");
    }

   /* @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo vo){
        log.info("validate");
        try {
            Map<String,String> map = BeanValidator.validateObject(vo);
            if (MapUtils.isNotEmpty(map)){
                for (Map.Entry<String,String> entry: map.entrySet()){
                    log.info("{}->{}",entry.getKey(),entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonData.success("hello validate");
    }*/

   @RequestMapping("/validate.json")
   @ResponseBody
   public JsonData validate(TestVo vo)throws Exception{
       log.info("validate");
       SysAclModuleMapper moduleMapper = ApplicationContextHelper.popBean(SysAclModuleMapper.class);
       SysAclModule module = moduleMapper.selectByPrimaryKey(1);
       log.info(JsonMapper.obj2String(module));
       BeanValidator.check(vo);
       return JsonData.success("hello validate");
   }


}

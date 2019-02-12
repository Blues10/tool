package com.export.exportTool.controller;

import com.export.exportTool.model.ExObject;
import com.export.exportTool.model.ExcelData;
import com.export.exportTool.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import com.export.exportTool.until.ExportExcelUtils;

@RestController
public class ExcelController {

    @Autowired
    private ExService exService;


    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    public void excel(HttpServletResponse response) throws Exception {
        ExcelData data = new ExcelData();
        List<ExObject> exObjectList = new ArrayList<>();
        exObjectList = exService.selectObj();

        data.setName("test");
        List<String> titles = new ArrayList();
        titles.add("序号");
        titles.add("类型");
        titles.add("主题");
        titles.add("产生原因");
        titles.add("分析描述");
        titles.add("知识阐述");
        data.setTitles(titles);

        List<List<Object>> rows = new ArrayList();
        for (int i = 0;i < exObjectList.size();i++){
            List<Object> row = new ArrayList();
            ExObject ex = new ExObject();
            ExObject exObject = new ExObject();
            exObject = exObjectList.set(i,ex);
            if (exObject.getKbmSouc()==1){
                exObject.setKbmType("巡检发现");
            }
            if (exObject.getKbmSouc()==2){
                exObject.setKbmType("故障分析");
            }
            if (exObject.getKbmSouc()==3){
                exObject.setKbmType("日常积累");
            }
            if (exObject.getKbmSouc()==4){
                exObject.setKbmType("产品文档");
            }
            if (exObject.getKbmSouc()==100){
                exObject.setKbmType("事件管理");
            }
            if (exObject.getKbmSouc()==200){
                exObject.setKbmType("问题管理");
            }
            if (exObject.getKbmSouc()==5){
                exObject.setKbmType("其他");
            }
            row.add(exObject.getnId());
            row.add(exObject.getKbmType());
            row.add(exObject.getKbmSbj());
            row.add(exObject.getKbmCont());
            row.add(exObject.getKbmAndes());
            row.add(exObject.getKbmSolu());
            rows.add(row);
        }

        data.setRows(rows);

        //生成本地
        /*File f = new File("c:/test.xlsx");
        FileOutputStream out = new FileOutputStream(f);
        ExportExcelUtils.exportExcel(data, out);
        out.close();*/
        ExportExcelUtils.exportExcel(response,"test.xlsx",data);
    }

}

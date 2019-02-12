package com.export.exportTool.service.impl;

import com.export.exportTool.mapper.ExMapper;
import com.export.exportTool.model.ExObject;
import com.export.exportTool.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExServiceImpl implements ExService {

    @Autowired
    private ExMapper exMapper;

    @Override
    public List<ExObject> selectObj() {
        return exMapper.selectObj();
    }
}

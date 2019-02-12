package com.export.exportTool.mapper;

import com.export.exportTool.model.ExObject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExMapper {

    List<ExObject> selectObj();
}

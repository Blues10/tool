package com.setsail.beans;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

public class PageQuery {

    @Getter
    @Setter
    @Min(value = 1, message = "当前页码不合法")
    private int pageNo = 1;

    @Getter
    @Setter
    @Min(value = 1, message = "每页展示页码不合法")
    private int pageSize = 10;

    @Setter
    private int offset;

    private int getOffset() {
        return (pageNo - 1) * pageSize;
    }
}

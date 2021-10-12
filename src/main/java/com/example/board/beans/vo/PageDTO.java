package com.example.board.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PageDTO {
    private int startPage;
    private int endPage;
    private int realEnd;
    private boolean prev, next;
    private int total;
    private Criteria criteria;

    public PageDTO() {;}

    public PageDTO(int total, Criteria criteria){
        this.total = total;
        this.criteria = criteria;

        this.endPage = Math.ceil(criteria.getPageNum());
    }
}

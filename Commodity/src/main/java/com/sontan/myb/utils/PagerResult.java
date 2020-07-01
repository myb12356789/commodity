package com.sontan.myb.utils;

import java.util.List;

public class PagerResult<E> {
    private Long total;
    private List<E> rows;

    public PagerResult() {
    }

    public PagerResult(Long total, List<E> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }

}

package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

// 通过 FilmRequestVO 对象传递请求参数
@Data
public class FilmRequestVO {

    private Integer showType=1;
    private Integer sortId=1;
    private Integer sourceId=99;
    private Integer catId=99;
    private Integer yearId=99;
    private Integer nowPage=1;      // 当前页
    private Integer pageSize=18;    // 页的初始值

}

package com.qfedu.springboot.entity;

import lombok.Data;

@Data
public class Goods {

    private Integer goodsId;
    private String goodsName;
    private Double goodsPrice;
    private String imgPath;

}

package com.qfedu.springboot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillGoods {

    private Integer sid;
    private Goods goods;
    private Double seckillStock;
    private Date beginTime;
    private Date endTime;
    private Double seckillPrice;
    private String seckillUrl;
}

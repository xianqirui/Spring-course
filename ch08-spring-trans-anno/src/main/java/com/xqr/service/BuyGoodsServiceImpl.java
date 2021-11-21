package com.xqr.service;

import com.xqr.dao.GoodsDao;
import com.xqr.dao.SaleDao;
import com.xqr.domain.Sale;
import com.xqr.domain.Goods;
import com.xqr.excep.NotEnougEcpection;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;
    /*
    * rollbackFor：表示发生指定的异常，其中的异常不管是什么类型都一定回滚
    * */
    /*@Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    NotEnougEcpection.class
            }
    )*/
    //使用默认值
    //默认运行抛出异常，默认回滚事务
    @Transactional
    @Override
    public void buy(Integer goodsId, Integer amount) {
        System.out.println("buy方法开始");
        //记录销售信息，限销售表添加记录
        Sale sale=new Sale();
        sale.setGid(goodsId);
        sale.setNums(amount);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if(goods==null){
            throw new NullPointerException("编号是"+goodsId+"的无此商品");
        }
        if (goods.getAmount()<amount){
            throw new NotEnougEcpection("库存不足");
        }
        //修改库存
       Goods buygoods=new Goods();
        buygoods.setAmount(amount);
        buygoods.setId(goodsId);
        goodsDao.updateGoods(buygoods);
        System.out.println("buy方法结束");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}

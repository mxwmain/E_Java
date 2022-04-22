package com.kaikeba.service;

import com.kaikeba.bean.Express;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressServiceTest {

    @Test
    public void insert() {
        Express e = new Express("12311","孟祥伟","15245489220","顺丰快递","18888888888","666666");
        boolean flag = ExpressService.insert(e);
        System.out.println(flag);
    }
}
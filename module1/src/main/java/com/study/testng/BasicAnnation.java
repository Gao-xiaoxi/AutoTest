package com.study.testng;

import org.testng.annotations.*;

public class BasicAnnation {

    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");

    }
    @Test(enabled = false)
    public void testCase2(){
        System.out.println("Test这是测试用例2");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before这是beforeMethod");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After这是afterMethod");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before这是beforeClass");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("After这是afterClass");

    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before这是beforeSuite");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After这是afterSuite");

    }

}

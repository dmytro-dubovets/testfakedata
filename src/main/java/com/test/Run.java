package com.test;


public class Run {

    public static void main(String[] args)
    {
        MySQLFakeData mySQLFakeData = new MySQLFakeData();
        mySQLFakeData.addFakeDataToTheClientTable(3);
    }
}

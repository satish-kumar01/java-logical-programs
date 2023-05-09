package com.satishit.solidprinciples.isp;

public class GooglePay implements UPIPayments,CashBackManager{

    @Override
    public void getCashBackAsCreditBalance() {
        //this feature is there in g-pay
    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}

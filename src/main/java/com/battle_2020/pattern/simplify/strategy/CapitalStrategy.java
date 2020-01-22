package com.battle_2020.pattern.simplify.strategy;

import com.battle_2020.pattern.createmethod.construction.Loan;

/**
 * 参考regular、splitor
 */
public class CapitalStrategy {

    public double capital(Loan loan){
        //根绝loan来计算出需要的capital

        if (loan.getExpiry() == null && loan.getMaturity() !=null){
            return Double.parseDouble(loan.getCommit() ) * Double.parseDouble( loan.getRiskRating()) ;
        }
        else  if(loan.getExpiry() != null && loan.getMaturity() ==null){
            return Double.parseDouble(loan.getCommit() ) * Double.parseDouble( loan.getRiskRating()) * 20;
        }
        else if (loan.getExpiry() == null && loan.getMaturity() ==null){
            return Double.parseDouble(loan.getCommit() ) * Double.parseDouble( loan.getRiskRating()) * 0.20;
        }else {
            return Double.parseDouble(loan.getCommit() ) * Double.parseDouble( loan.getRiskRating()) * 2;
        }

    }
}

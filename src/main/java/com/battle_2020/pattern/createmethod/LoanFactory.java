package com.battle_2020.pattern.createmethod;

public class LoanFactory {

    public Loan createTermLoan(String commit, String riskRating, String maturity,String expiry){
        return  new Loan(commit,riskRating,maturity,expiry);
    }
    public Loan createTermLoan(String commit, String riskRating, String maturity,String expiry,CapitalStartegy capitalStartegy){
        return  new Loan(commit,null, riskRating,maturity,expiry, capitalStartegy);
    }

    /**
     * 创建信用卡类型的贷款：expiry == null
     * @param commit
     * @param riskRating
     * @param maturity
     * @return
     */
    public Loan createRevlover(String commit, String riskRating, String maturity){
        return  new Loan(commit,riskRating,maturity);
    }
    public Loan createRevlover(String commit, String riskRating, String maturity,CapitalStartegy capitalStartegy){
        return  new Loan(commit,null, riskRating,maturity,capitalStartegy);
    }

    public Loan createRCL(String commit, String riskRating, String maturity){
        return  new Loan(commit,riskRating,maturity);
    }
    public Loan createRCL(String commit, String riskRating, String maturity,CapitalStartegy capitalStartegy){
        return  new Loan(commit,null, riskRating,maturity,capitalStartegy);
    }

}

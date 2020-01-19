package com.battle_2020.pattern.createmethod.construction;

/** 这是一个银行贷款的风险评估程序
 * 重构构造方案，
 * 构造方案的传入什么参数，表达创建出了不同的含义，这里需要去明确
 */
public class Loan {

    /*委托机构*/
    private String commit;
    /*未偿贷款*/
    private String outStanding;
    /*风险系数*/
    private String riskRating;
    /*失效时间*/
    private String expiry;
    /*满期时间*/
    private String maturity;
    /*资产策略*/
    private CapitalStartegy capitalStrategy;



    /**
     * 模式1：expiry == null
     * @param commit
     * @param riskRating
     * @param maturity
     */
    public Loan(String commit, String riskRating, String maturity) {
        this(commit,riskRating,null,maturity);
    }

    /**
     * 模式2：expiry ！= null
     * @param commit
     * @param riskRating
     * @param expiry
     * @param maturity
     */
    public Loan(String commit, String riskRating, String expiry, String maturity) {
        this(commit,expiry,riskRating,maturity,null);
    }

    public Loan(String commit, String expiry,String riskRating,  String maturity, CapitalStartegy capitalStrategy) {
        this("0.00",null, riskRating,expiry,maturity,capitalStrategy);
    }

    public Loan(String commit, String outStanding, String riskRating, String expiry, String maturity, CapitalStartegy capitalStrategy) {
        this.commit = commit;
        this.outStanding = outStanding;
        this.riskRating = riskRating;
        this.expiry = expiry;
        this.maturity = maturity;

        /*根据业务要求构造不同的贷款类型*/
        if (capitalStrategy != null){
            //定期贷款
            if (expiry != null){
                this.capitalStrategy = new StrategyTermLoan();
            }
            //信用卡的贷款
            else if (maturity != null){
                this.capitalStrategy = new StrategyRevolver();
            }
            //循环信用贷款
            else {
                this.capitalStrategy = new StrategyRCL();
            }

        }

    }

    /**
     * 说明：这里需要支持7中贷款模式：但是构造方法是模棱两可的，没有具体的含义，因此拆分不同的构造方法
     * 并不需要 吧Loan设计成一个抽象类，然后用子类来标识每个不同的类，原因是：
     * 1、区分不同的Loan不是有不同的字段，有子类的属性，而是字段类型不同，这样会显得非常冗余
     *
     * 2、Loan的类型的转换，这样会轻松很多。
     */

    /**
     * 重构实践1: 创建定期贷款类型
     */
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

    /**
     * =========重构二=========
     * 使用工厂方法：重构1解决了的构造方法含有特殊业务知识导致的模棱两可，但是增加了很多方法，对于Loan类的主要职责有点混淆不清了。
     *
     * createMethod分散了Loan的职责，所以使用工厂方法剥离出构造方法
     */






}

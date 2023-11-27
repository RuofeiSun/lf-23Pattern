/**
 * @Author: srf
 * @Date: 2023/11/27 10:37
 * @description:贷款实现类
 */

//家庭贷款
class HomeLoan extends Loan {

    @Override
    public void getInterestRate(double r){
        rate=r;
    }

}

//商业贷款
class BussinessLoan extends Loan{

    @Override
    public void getInterestRate(double r){
        rate=r;
    }

}

//教育贷款
class EducationLoan extends Loan{

    @Override
    public void getInterestRate(double r){
        rate=r;
    }

}
/**
 * @Author: srf
 * @Date: 2023/11/27 10:32
 * @description:银行接口实现
 */
class HDFC implements Bank{

    private final String BNAME;

    public HDFC(){
        BNAME="HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}

class ICICI implements Bank{

    private final String BNAME;

    ICICI(){
        BNAME="ICICI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}

class SBI implements Bank{

    private final String BNAME;

    public SBI(){
        BNAME="SBI BANK";
    }

    @Override
    public String getBankName(){
        return BNAME;
    }
}
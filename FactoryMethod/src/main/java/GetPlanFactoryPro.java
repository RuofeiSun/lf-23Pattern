/**
 * @Author: srf
 * @Date: 2023/11/24 10:53
 * @description:方法工厂模式，根据传入的计划类型生成相应的计划对象。
 */
public abstract class GetPlanFactoryPro {
    abstract Plan getPlan();
}

class DomesticPlanFactory extends GetPlanFactoryPro {
    @Override
    Plan getPlan() {
        return new DomesticPlan();
    }
}

class CommercialPlanFactory extends GetPlanFactoryPro {
    @Override
    Plan getPlan() {
        return new CommercialPlan();
    }
}

class InstitutionalPlanFactory extends GetPlanFactoryPro {
    @Override
    Plan getPlan() {
        return new InstitutionalPlan();
    }
}
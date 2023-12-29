/**
 * @Author: srf
 * @Date: 2023/12/29 9:52
 * @description:足球
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("足球游戏结束了！");
    }

    @Override
    void initialize() {
        System.out.println("足球游戏初始化了！开始玩吧。");
    }

    @Override
    void startPlay() {
        System.out.println("足球游戏开始了。享受游戏！");
    }

}

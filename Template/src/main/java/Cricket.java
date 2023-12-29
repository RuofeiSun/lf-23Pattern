/**
 * @Author: srf
 * @Date: 2023/12/29 9:51
 * @description:板球
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("板球游戏结束了！");
    }

    @Override
    void initialize() {
        System.out.println("板球游戏初始化了！开始玩吧。");
    }

    @Override
    void startPlay() {
        System.out.println("板球游戏开始了。享受游戏！");
    }

}

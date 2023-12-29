/**
 * @Author: srf
 * @Date: 2023/12/29 9:53
 * @description:
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}

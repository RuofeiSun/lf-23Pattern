import java.util.Date;

/**
 * @Author: srf
 * @Date: 2023/12/27 11:11
 * @description:
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}

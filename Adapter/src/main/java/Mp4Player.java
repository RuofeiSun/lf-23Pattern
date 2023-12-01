/**
 * @Author: srf
 * @Date: 2023/12/1 10:53
 * @description:
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // 无操作
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 MP4 文件。名称: " + fileName);
    }

}

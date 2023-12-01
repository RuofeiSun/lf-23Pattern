/**
 * @Author: srf
 * @Date: 2023/12/1 10:52
 * @description:
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 VLC 文件。名称: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 无操作
    }

}

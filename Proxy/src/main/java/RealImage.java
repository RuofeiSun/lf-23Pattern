/**
 * @Author: srf
 * @Date: 2023/12/14 20:41
 * @description:
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("展示 " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("加载 " + fileName);
    }

}

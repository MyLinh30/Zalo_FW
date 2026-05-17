package utils;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ImageProcessor {
    public static int calculateDistance(String bgPath, String templatePath) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Mat bg = Imgcodecs.imread(bgPath, Imgcodecs.IMREAD_GRAYSCALE);
        Mat tpl = Imgcodecs.imread(templatePath, Imgcodecs.IMREAD_GRAYSCALE);

        // Phát hiện cạnh để tìm lỗ hổng chính xác hơn
        Imgproc.Canny(bg, bg, 100, 200);
        Imgproc.Canny(tpl, tpl, 100, 200);

        Mat result = new Mat();
        Imgproc.matchTemplate(bg, tpl, result, Imgproc.TM_CCOEFF_NORMED);

        Core.MinMaxLocResult mmr = Core.minMaxLoc(result);
        // Trả về tọa độ X của điểm khớp nhất
        return (int) mmr.maxLoc.x;
    }
}

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import edu.wpi.first.vision.VisionPipeline;

public class TestImgCapture implements VisionPipeline {
    private long lastCaptureTime = 0;

    @Override
    public void process(Mat mat) {
        lastCaptureTime += 1;
        long currentTime = System.nanoTime();
        if (currentTime - lastCaptureTime > 5 * 1000000000) {
            lastCaptureTime = currentTime;
            Imgcodecs.imwrite("/home/TestImgs/" + currentTime + ".png", mat);

            // capture

        }
    }
}
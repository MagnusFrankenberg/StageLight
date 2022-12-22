package animations;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpriteLoader {

    private static SpriteLoader instance;

    public List<BufferedImage> circleGreen = new ArrayList<>();
    public List<BufferedImage> circleBlue = new ArrayList<>();
    public List<BufferedImage> circleRed = new ArrayList<>();
    public List<BufferedImage> circleYellow = new ArrayList<>();

    public List<BufferedImage> textLabels = new ArrayList<>();

    private SpriteLoader(){
        loadSprites();
    }

    public static SpriteLoader getInstance(){
        if(instance == null){
            instance = new SpriteLoader();
        }
        return instance;
    }

    public void loadSprites(){
        try {

            circleGreen.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Green01/Green_0.png")));
            circleGreen.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Green01/Green_1.png")));
            circleGreen.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Green01/Green_2.png")));
            circleGreen.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Green01/Green_3.png")));
            circleGreen.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Green01/Green_4.png")));

            circleBlue.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Blue01/Blue_0.png")));
            circleBlue.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Blue01/Blue_1.png")));
            circleBlue.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Blue01/Blue_2.png")));
            circleBlue.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Blue01/Blue_3.png")));
            circleBlue.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Blue01/Blue_4.png")));

            circleRed.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Red01/Red_0.png")));
            circleRed.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Red01/Red_1.png")));
            circleRed.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Red01/Red_2.png")));
            circleRed.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Red01/Red_3.png")));
            circleRed.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Red01/Red_4.png")));

            circleYellow.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Yellow01/Yellow_0.png")));
            circleYellow.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Yellow01/Yellow_1.png")));
            circleYellow.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Yellow01/Yellow_2.png")));
            circleYellow.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Yellow01/Yellow_3.png")));
            circleYellow.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Yellow01/Yellow_4.png")));

            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/Config1.png")));
            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/Config2.png")));
            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/Config3.png")));
            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/StageSmall.png")));
            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/StageMedium.png")));
            textLabels.add(ImageIO.read(getClass().getClassLoader().getResourceAsStream("TextLabels/StageLarge.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

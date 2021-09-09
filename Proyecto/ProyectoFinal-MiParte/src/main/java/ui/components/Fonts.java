/*
 * Fonts
 */
package ui.components;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Bryan Andagoya
 */
public final class Fonts {

    public Font robotoBlack;
    public Font robotoBlackItalic;
    public Font robotoBold;
    public Font robotoBoldItalic;
    public Font robotoItalic;
    public Font robotoLight;
    public Font robotoLightItalic;
    public Font robotoMedium;
    public Font robotoMediumItalic;
    public Font robotoRegular;
    public Font robotoThin;
    public Font robotoThinItalic;

    private final String path = "src/main/java/ui/resources/fonts/";

    private GraphicsEnvironment ge
            = GraphicsEnvironment.getLocalGraphicsEnvironment();

    public Fonts() {
        createFonts();
    }

    public void createFonts() {
        try {
            robotoBlack = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Black.ttf"));

            robotoBlackItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-BlackItalic.ttf"));

            robotoBold = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Bold.ttf"));

            robotoBoldItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-BoldItalic.ttf"));

            robotoItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Italic.ttf"));

            robotoLight = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Light.ttf"));

            robotoLightItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-LightItalic.ttf"));

            robotoMedium = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Medium.ttf"));

            robotoMediumItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-MediumItalic.ttf"));

            robotoRegular = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Regular.ttf"));

            robotoThin = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-Thin.ttf"));

            robotoThinItalic = Font.createFont(Font.TRUETYPE_FONT,
                    new File(path + "roboto/Roboto-ThinItalic.ttf"));

            ge.registerFont(robotoBlack);
            ge.registerFont(robotoBlackItalic);
            ge.registerFont(robotoBold);
            ge.registerFont(robotoBoldItalic);
            ge.registerFont(robotoItalic);
            ge.registerFont(robotoLight);
            ge.registerFont(robotoLightItalic);
            ge.registerFont(robotoMedium);
            ge.registerFont(robotoMediumItalic);
            ge.registerFont(robotoRegular);
            ge.registerFont(robotoThin);
            ge.registerFont(robotoThinItalic);

        } catch (FontFormatException | IOException ex) {
            System.out.println("Font error");
        }
    }
}

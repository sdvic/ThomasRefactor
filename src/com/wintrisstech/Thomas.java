package com.wintrisstech;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import static javax.imageio.ImageIO.read;
public class Thomas
{
    private Image[] thomasSpriteImageArray = new Image[8];
    private Image[] reverseThomasImageArray = new Image[8];
    private AffineTransform thomasTransform = new AffineTransform();
    private Image thomasSpriteImage;
    private Image reverseThomasImage;
    private int thomasSpriteImageCounter;
    private int thomasMaxSpeed = 13;
    private int thomasYOffsetFromGround = 0;
    private Graphics2D g2;

    {
        try
        {
            getThomasSpriteImageArray()[0] = read(getClass().getResource("Thomas1.png"));
            getThomasSpriteImageArray()[1] = read(getClass().getResource("Thomas2.png"));
            getThomasSpriteImageArray()[2] = read(getClass().getResource("Thomas3.png"));
            getThomasSpriteImageArray()[3] = read(getClass().getResource("Thomas4.png"));
            getThomasSpriteImageArray()[4] = read(getClass().getResource("Thomas5.png"));
            getThomasSpriteImageArray()[5] = read(getClass().getResource("Thomas6.png"));
            getThomasSpriteImageArray()[6] = read(getClass().getResource("Thomas7.png"));
            getThomasSpriteImageArray()[7] = read(getClass().getResource("Thomas8.png"));
            getReverseThomasImageArray()[0] = read(getClass().getResource("Reversed Thomas1.png"));
            getReverseThomasImageArray()[1] = read(getClass().getResource("Reversed Thomas2.png"));
            getReverseThomasImageArray()[2] = read(getClass().getResource("Reversed Thomas3.png"));
            getReverseThomasImageArray()[3] = read(getClass().getResource("Reversed Thomas4.png"));
            getReverseThomasImageArray()[4] = read(getClass().getResource("Reversed Thomas5.png"));
            getReverseThomasImageArray()[5] = read(getClass().getResource("Reversed Thomas6.png"));
            getReverseThomasImageArray()[6] = read(getClass().getResource("Reversed Thomas7.png"));
            getReverseThomasImageArray()[7] = read(getClass().getResource("Reversed Thomas8.png"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public Image[] getReverseThomasImageArray()
    {
        return reverseThomasImageArray;
    }

    public Image[] getThomasSpriteImageArray()
    {
        return thomasSpriteImageArray;
    }
}


package pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  //Same setup for LtR
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  
	  for(int row = pixels.length -1; row >= 0; row--)
	  {
		  for (int col = width / 2 - 1; col >= 0; col --)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - col - 1];
			  leftPixel.setColor(rightPixel.getColor());
		  }
	  }
  }
  
  public void mirrorHorizontalBottomToTop()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel bottomPixel = null;
	  Pixel topPixel = null;
	  int height = pixels[0].length;
	  
	  for(int row = pixels.length -1; row >= 0; row--)
	  {
		  for (int col = height / 2 -1; col >= 0; col--)
		  {
			  bottomPixel = pixels[row][col];
			  topPixel = pixels[row][height - col - 1];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }		  
  }
  
  public void mirrorDiagonal()
  {
	  Pixel [][] pictureMatrix = this.getPixels2D();
	  Pixel topRight = null; 
	  Pixel bottomLeft = null;
	  
	  for(int row = 0; row < pictureMatrix.length; row++)
	  {
		  for (int col = 0; col < pictureMatrix.length; col++)
		  {
			  if(row != col && row < pictureMatrix[0].length && col < pictureMatrix.length)
			  {
				  topRight = pictureMatrix[row][col];
				  bottomLeft = pictureMatrix[col][row];
				  
				  bottomLeft.setColor(topRight.getColor());
			  }
		  }
	  }  
  }
  
  public void mirrorDiagonalUphill()
  {
	  Pixel topLeft = null;
	  Pixel bottomRight = null;
	  Pixel [][] pictureMatrix = this.getPixels2D();
	  int shortest = Math.min(pictureMatrix.length, pictureMatrix[0].length);
	  
	  for(int row = 0; row < shortest; row++)
	  {
		  for (int col = 0; col < shortest; col++)
		  {
			  if(row + col != shortest -1)
			  {
				  topLeft = pictureMatrix[row][col];
				  bottomRight = pictureMatrix[shortest - col - 1][shortest - row - 1];
				  topLeft.setColor(bottomRight.getColor());		  
			  }
		  }
	  }	  
  }
  
  public void mirrorArms()
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 165; row < 214; row++)
	  {
		  for (int col = 95; col < 300; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row+50][col];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  // NICE CODE BOI KEEP IT UP YEAH YOURE DOING A NICE JOB *HIGH FIVE* YEAH NICE JOB REALLY GOOD KEEP UP THE GOOD WORK AND ALWAYS STRIVE AND PROSPER.
  //SPICEE CODE BRO
  public void mirrorGull()
  {
	int mirrorPoint = 351;
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int count = 0;
	Pixel[][] pixels = this.getPixels2D();
	
	for (int row = 233; row < 318; row++)
	{
	  for (int col = 223; col < mirrorPoint; col++)
	  {
		leftPixel = pixels[row][col];
		rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
		rightPixel.setColor(leftPixel.getColor());
	  }
	}  
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row ][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void createCollageTheSequal()
  {
	  Picture Moon = new Picture("Zelda BTW moon.jpg");
	    Picture flower2 = new Picture("flower2.jpg");
	    this.copy(Moon,0,0);
	    this.copy(flower2,100,0);
	    this.copy(Moon,200,0);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,0);
	    this.copy(Moon,400,0);
	    this.copy(flower2,500,0);
	    this.mirrorVertical();
	    this.write("collage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetectionTheSequal(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-2; col++)
      {
        leftPixel = pixels[row][col+1];
        rightPixel = pixels[row][col+2];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void fullRandom() 
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  for (Pixel [] row : currentPicture)
	  {
		  for (Pixel currentPixel : row)
		  {
			  int red = (int) (Math.random() * 256);
			  int green = (int) (Math.random() * 256);
			  int blue = (int) (Math.random() * 256);
			  
			  currentPixel.setColor(new Color(red, green, blue));
		  }
	  }
  }
  
  public void encode(Picture otherPic)
  {
	  Pixel[][] source = this.getPixels2D();
	  Pixel[][] hiddenData = otherPic.getPixels2D(); 
	  
	  Pixel sourcePixel = null;
	  Pixel hiddenPicture = null;
	  
	  for (int row = 0; row < source.length; row++)
	  {
		  for(int col = 0; col < source[0].length; col++)
		  {
			  hiddenPicture = hiddenData[row][col];
			  sourcePixel = source[row][col];
			  
			  if(hiddenPicture.getRed() == 255 && hiddenPicture.getGreen() == 255 && hiddenPicture.getBlue() == 255)
			  {
				  int currentRed = sourcePixel.getRed();
				  if(currentRed % 2 == 0)
				  {
					  sourcePixel.setRed(currentRed + 1);
				  }
			  }
			  else
			  {
				  int currentRed = sourcePixel.getRed();
				  if(currentRed % 2 !=0)
				  {
					  sourcePixel.setRed(currentRed - 1);
				  }
			  }
		  }	
	  }  
  }
   
  public void decode()
  {
	  Pixel [][] decoded = this.getPixels2D();
	  Pixel currentPixel = null;
	  
	  for (int row = 0; row < decoded.length; row++)
	  {
		  for (int col = 0; col < decoded[0].length; col++)
		  {
			  //DFFF00
			  currentPixel = decoded[row][col];
			  int currentRed = currentPixel.getRed();
			  if (currentRed % 2 == 0)
			  {
				  currentPixel.setColor(new Color(127, 255, 0));
			  }
		  }	  
	  }
	  this.explore();
  }
 
  public void fullRandomGreen()
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  for (Pixel [] row : currentPicture)
	  {
		  for (Pixel currentPixel : row)
		  {
			  int green = (int) (Math.random() * 256);
			  
			  currentPixel.setColor(new Color(currentPixel.getRed(), green, currentPixel.getBlue()));
			  //or
		    //currentPixel.setGreen(green);
		  }
	  }
  }
  
  public void fullRandomRed()
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  for (Pixel [] row : currentPicture)
	  {
		  for (Pixel currentPixel : row)
		  {
			  int red = (int) (Math.random() * 256);
			  
			//currentPixel.setColor(new Color(currentPixel.getGreen(), red, currentPixel.getBlue()));
			  //or
			  currentPixel.setRed(red);
		  }
	  }
  }
	  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main (String [] args)
  {
    

  }
  
} // this } is the end of class Picture, put all new methods before this

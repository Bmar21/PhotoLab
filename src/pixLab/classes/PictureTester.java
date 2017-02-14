package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Brandon Marlor
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    //beach.zeroBlue();
    //beach.explore();

  }
  
  /** Method to test mirrorHorizontal*/
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture kitten2 = new Picture("kitten2.jpg");
	  kitten2.explore();
	  kitten2.mirrorHorizontalBottomToTop();
	  kitten2.explore();	  
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture bike = new Picture("blueMotorcycle.jpg");
	  Picture kitten2 = new Picture("kitten2.jpg");
	  kitten2.explore();
	  kitten2.mirrorVerticalRightToLeft();
	  kitten2.explore();
	  //bike.explore();
	  //bike.mirrorVerticalRightToLeft();
	  //bike.explore();
	  //bike.zeroBlue();
	  //bike.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture robot = new Picture("robot.jpg");
	  Picture bug = new Picture("butterfly1.jpg");
	  //robot.explore();
	  //bug.explore();
	  //robot.mirrorDiagonal();
	  //bug.mirrorDiagonalUphill();
	  //bug.mirrorDiagonal();
	  
	  //bug.explore();
	  //bug.write("fancyMirror.jpg");
	  //robot.explore();
	  
  }
  
  public static void testMirrorArms()
  {
	  Picture arms = new Picture("snowman.jpg");
	  arms.explore();
	  arms.mirrorArms();
	  arms.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture gull = new Picture("seagull.jpg");
	gull.explore();
	gull.mirrorHorizontalBottomToTop();
	gull.explore();
	gull.mirrorGull();
	gull.explore();
	gull.zeroBlue();
	gull.explore();
	gull.fullRandomRed();
	gull.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetectionTheSequal()
  {
    Picture door = new Picture("thruDoor.jpg");
    door.edgeDetection(40);
    door.explore();
  }
  
  public static void testValentineMeme()
  {
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetectionTheSequal();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  testValentineMeme();
  }
}
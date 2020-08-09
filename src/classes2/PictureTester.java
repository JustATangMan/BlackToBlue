package classes2;

import java.awt.Color;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
  /** Method to test zeroBlue */
  public static void testZeroBlue() {
    // Picture beach = new Picture("beach.jpg");
    Picture beach = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  // Method to test keepOnlyBlue (Activity 5)

  public static void testKeepOnlyBlue() {
    // Picture beach = new Picture("beach.jpg");
    Picture beach = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  // Method to test negate (Activity 5)

  public static void testNegate() { // Picture beach = new
    // Picture("beach.jpg");
    Picture beach = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  // Method to test grayscale (Activity 5)

  public static void testGrayscale() {
    Picture beach = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorVerticalRightToLeft (Activity 6) */

  public static void testMirrorVerticalRightToLeft() {
    Picture caterpillar = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  /** Method to test mirrorVerticalRightToLeft (Activity 6) */

  public static void testMirrorHorizontal() {
    Picture caterpillar = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  /**
   * Method to test mirrorVerticalRightToLeft (Activity 6)
   */

  public static void testMirrorHorizontalBotToTop() {
    Picture caterpillar = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorVerticalRightToLeft (Activity 6) */
  /*
   * public static void testMirrorPart() { Picture caterpillar = new
   * Picture(" Your Path Here /seagull.jpg"); caterpillar.explore();
   * caterpillar.mirrorPart(int, int, int, int, int, "R");
   * caterpillar.write("seagull2.jpg"); caterpillar.explore(); }
   */

  public static void testEncodeAndDecode() {
    Picture pic = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach.jpg");
    pic.explore();
    Picture picMsg = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\msg.jpg");
    pic.encode(picMsg);
    pic.write("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach2.jpg");
    Picture pic2 = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\beach2.jpg");
    pic2.explore();
    Picture decoded = pic.decode();
    decoded.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorPart() {
    Picture seagull = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\seagull.jpg");
    seagull.explore();
    seagull.mirrorPart((648 / 2) - 1, 0, 485, 0, 0, "R");
    seagull.explore();
    Picture seagull2 = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\seagull.jpg");
    seagull2.mirrorPart((648 / 2) - 1, 0, 485, 0, 0, "L");
    seagull2.explore();
  }

  /** Method to test the collage method */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    Picture swan = new Picture("C:\\Users\\jason\\VS projects\\ImageProcessing\\src\\images\\swan.jpg");
    swan.explore();
    swan.edgeDetection(25);
    swan.explore();
  }

  public static void blackToBlue(String filePath, String imageName) {
    Picture formToBeChanged = new Picture(filePath + imageName);
    formToBeChanged.explore();
    Picture changedForm = formToBeChanged.changeBlackToBlue(40);
    changedForm.write(filePath + "edited" + imageName);
    changedForm.explore();
  }

  /**
   * Main method for testing. Every class can have a main method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();
    // testMirrorPart();
    // testMirrorVerticalRightToLeft();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
    // testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncode();
    // testDecode();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);

    blackToBlue("C:\\Users\\Jason-g\\Downloads\\", "Epson_06172020182736.jpg");
    /*
     * Insert filepath with two slashes for first parameter, then file name for
     * second parameter image will show up in the same folder with edited added to
     * the front of the file name
     */

  }
}
package io.acari.intro;

public class Boxxy {

  /**
   *
   * Last night you partied a little too hard.
   * Now there's a black and white photo of you that's about to go viral!
   * You can't let this ruin your reputation, so you want to apply
   * the box blur algorithm to the photo to hide its content.
   *
   * The pixels in the input image are represented as integers.
   * The algorithm distorts the input image in the following way:
   * Every pixel x in the output image has a value equal to the average value
   * of the pixel values from the 3 × 3 square that has its center at x, including x itself.
   * All the pixels on the border of x are then removed.
   *
   * Return the blurred image as an integer, with the fractions rounded down.
   *
   *
   * @param image
   * @return
   */
  int[][] boxBlur(int[][] image) {
    int height = image.length;
    int width = image[0].length;
    int widthMinusOne = width - 1;
    int heightMinusOne = height - 1;
    int[][] blurredImage = new int[heightMinusOne - 1][widthMinusOne - 1];
    for (int i = 1; i < heightMinusOne; i++) {
      for (int j = 1; j < widthMinusOne; j++) {
         blurredImage[i - 1][j-1] = getPixel(i, j, image);
      }
    }
    return blurredImage;
  }

  private int getPixel(int i, int j, int[][] image) {
    int i1 = i + 1;
    int i2 = j + 1;
    int sum = 0;
    for (int k = i - 1; k <= i1; k++) {
      for (int l = j - 1; l <= i2; l++) {
        sum += image[k][l];
      }
    }

    return sum / 9;
  }

}

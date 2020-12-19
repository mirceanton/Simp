package objects.filters.grayscale;

import objects.image.Pixel;

public class WeightedGrayscaleFilter extends AbstractGrayscaleFilter {
	private static final double RED_BIAS = 0.21;
	private static final double GREEN_BIAS = 0.72;
	private static final double BLUE_BIAS = 0.07;

	/** Applies the  weighted grayscale method to turn a pixel into a grayscale pixel.
	 * 
	 * The formula used is: G = R * redBias + G * greenBias + B * blueBias
	 * where:
	 *   - red_bias = 0.21
	 *   - green_bias = 0.72
	 *   - blue_bias = 0.07
	 *   - G = the grayscale color
	 *   - R,G,B = the red, green, blue color values
	 * 
	 * @param input -> the pixel to be processed
	 * @return -> the grayscaled pixel
	 */
	@Override
	protected Pixel toGrayscale(Pixel input) {
		int grayscale = 0;
		grayscale += input.getRedChannel()   * RED_BIAS;
		grayscale += input.getGreenChannel() * GREEN_BIAS;
		grayscale += input.getBlueChannel()  * BLUE_BIAS;
		return new Pixel(grayscale);
	}	
}
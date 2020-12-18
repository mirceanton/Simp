package objects.filters.gray_level;

import objects.image.Pixel;

public class LinearGrayLevelFilter extends AbstractGrayLevelFilter {
	/** Applies the linear transformation onto a pixel. It bascally inverts the color.
	 * @see NegativeFilter, as it is basically the same
	 * 
	 * @param input -> the pixel to be transformed
	 * @return -> the transformed pixel
	 */
	@Override
	protected Pixel transform(Pixel input) {
		return new Pixel(
			255 - input.getRedChannel(),
			255 - input.getGreenChannel(),
			255 - input.getBlueChannel()
		);
	}
}

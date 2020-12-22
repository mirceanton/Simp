package objects.filters.histogram;

import java.util.Arrays;

import objects.image.Image;
import objects.image.Pixel;

public class BlueLevelHistogram extends AbstractHistogramFilter {
	private int width;
	private int height;
	private int samples;

	public BlueLevelHistogram(int width, int height, int samples) {
		super(samples, true);

		this.width = width;
		this.height = height;
		this.samples = samples;
	}

	@Override
	public Image filter(Image image) {
		generate(image.getPixels(), true);
		int maxValue = Arrays.stream(blueLevelHistogram).max().getAsInt();
		Pixel[][] histogram = new Pixel[width][height];
		double xSize = (double)(width) / samples;
		double ySize = (double)maxValue / (height);

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if ( y < blueLevelHistogram[(int)(x/xSize)] / ySize ) {
					int color = (int)Math.round(255.0 / samples * x/xSize);
					histogram[x][height-y-1] = new Pixel(0, 0, color);
				} else {
					histogram[x][height-y-1] = new Pixel(255);
				}

			}
		}

		return new Image(histogram);
	}
	
}

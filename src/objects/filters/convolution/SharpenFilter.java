package objects.filters.convolution;

public class SharpenFilter extends AbstractConvolutionFilter {
	public static final double[][] SHARPEN_KERNEL_3_LOW = {
		{ 0, -1,  0},
		{-1,  5, -1},
		{ 0, -1,  0}
	};
	public static final double[][] SHARPEN_KERNEL_3_HIGH = {
		{-1, -1, -1},
		{-1,  9, -1},
		{-1, -1, -1}
	};


	public SharpenFilter(double[][] kernel) {
		this.kernel = kernel;
	}
}

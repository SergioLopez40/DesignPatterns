public class ImageViewer {

	public static void main(String[] args) {
		
	Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
	Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
	Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");
	
	highResolutionImage1.showImage();

	Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
	Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
	Image highResolutionImageBoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");
	
	highResolutionImageNoProxy2.showImage();

	}
		
}
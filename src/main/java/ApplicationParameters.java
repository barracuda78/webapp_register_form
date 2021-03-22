import javax.servlet.ServletContext;

public class ApplicationParameters  {
    public final static String pathToImageParameter = "path_to_image";

    private static String pathToImage;

    public static String getPathToImage() {
        return pathToImage;
    }

    public static void create(ServletContext servletContext) {

        pathToImage = servletContext.getInitParameter(ApplicationParameters.pathToImageParameter);

    }
}

import java.io.*;

public class ReaderWriter {
    private static final String C = "C:\\Users\\Admin\\IdeaProjects\\[Bài tập] Copy file textAssignment\\src\\Filer";
    private static final String D = "C:\\Users\\Admin\\IdeaProjects\\[Bài tập] Copy file textAssignment\\src\\Filer1";
    static InputStream inStream = null;
    static OutputStream outStream = null;

    public static void main(String[] args) throws Exception {
        try {
            inStream = new FileInputStream(new File(C));
            outStream = new FileOutputStream(new File(D));
            int length;
            byte[] buffer = new byte[1];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Được rồi!" +
                    "ANH LỰC 04/03/2001 ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}

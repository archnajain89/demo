package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Image {
	
	
	public static void main(String[] args) {
        imageListCopy("C:/Users/Public/Pictures/Sample Pictures", "D:/dis/");
}

private static void imageListCopy(String srcFolder, String destFolder) {

        // Validate source and destination paths.
        File src = new File(srcFolder);
        if (!src.isDirectory()) {
               throw new InputMismatchException("Specified source path should be a valid directory path.");
        }
        File dst = new File(destFolder);
        if (!dst.isDirectory()) {
               throw new InputMismatchException("Specified destination path should be a valid directory path.");
        }

        List<File> images = new ArrayList<File>(Arrays.asList(src.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg"))));
        images.stream().forEach(file -> {
               try {
                     FileUtils.copyFile(file, new File(dst.getAbsolutePath() + File.separator + file.getName()));
               } catch (IOException e) {
                     System.out.println("Failed while saving '" + file.getName() + "'.");
               }
        });
        // Copy selected files.
        /*Arrays.stream(src.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg"))).forEach(file -> {
               try {
                     FileUtils.copyFile(file, new File(dst.getAbsolutePath() + File.separator + file.getName()));
               } catch (IOException e) {
                     System.out.println("Failed while saving '" + file.getName() + "'.");
               }
        });*/

        // Output summary.
        System.out.println("Copyied selected file(s) to " + dst.getAbsolutePath() + File.separator);
}




}

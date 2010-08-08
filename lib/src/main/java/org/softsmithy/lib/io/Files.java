/*
 *                  Sun Public License Notice
 *
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 *
 * The Original Code is SoftSmithy Utility Library. The Initial Developer of the
 * Original Code is Florian Brunner (Sourceforge.net user: puce). All Rights Reserved.
 *
 * Contributor(s): .
 */
package org.softsmithy.lib.io;

import java.io.*;
import java.util.*;

/**
 * A utility class for Files. <br>
 * Note: The API may change in a future version!
 *<br><br>
 * @author    Florian Brunner
 * @see java.io.File
 */
public class Files {

    /**
     * A file extension. May be removed in a future version.
     */
    public final static String JPEG = "jpeg";
    /**
     * A file extension. May be removed in a future version.
     */
    public final static String JPG = "jpg";
    /**
     * A file extension. May be removed in a future version.
     */
    public final static String GIF = "gif";
    /**
     * A file extension. May be removed in a future version.
     */
    public final static String TIFF = "tiff";
    /**
     * A file extension. May be removed in a future version.
     */
    public final static String TIF = "tif";
    /**
     * A file extension. May be removed in a future version.
     */
    public final static String TXT = "txt";

    /**
     * Gets the extension of a file
     *
     * @param f  the file whose extension should be fetched
     * @return   the extension of the specified file
     */
    public static String getExtension(File f) {
        String ext = "";
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    /**
     * Gets the first name of a file (from start to the first point).
     *
     * @param f  the file whose first name should be fetched
     * @return   the first name of the specified file
     */
    public static String getFirstName(File f) {
        String firstName = "";
        String s = f.getName();
        int i = s.indexOf('.');

        if (i > -1) {
            firstName = s.substring(0, i);
        }
        return firstName;
    }

    /**
     *  Gets the name of a file (from start to the last point).
     *
     * @param f  the file whose name should be fetched
     * @return   the name of the specified file
     *
     * Should this method be renamed?
     */
    public static String getName(File f) {
        String firstName = "";
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > -1) {
            firstName = s.substring(0, i);
        }
        return firstName;
    }

    /**
     * Reads the lines from a text file.<br>
     * <br>
     * Return type may change to List&lt;String&gt; in future!?
     * @param file the text file
     * @return the lines read from a text file
     * @throws java.io.FileNotFoundException 
     * @throws java.io.IOException 
     */
    public static String[] readLines(File file) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(file);
        String[] lines = Streams.readLines(reader);
        reader.close(); // is this ok?
        return lines;
    }

    /**
     * Deletes (optionally recursivly) the specified file or directory.
     * @param file the file or directory to be deleted
     * @param recursivly If true, deletes the directory recursivly. If false or if file is
     * not a directory, only the specified file gets deleted.
     * @return true, if all files/ directories could be deleted, else false.
     */
    public static boolean delete(File file, boolean recursivly) {
        boolean deleted = true;
        if (recursivly && file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleted = delete(files[i], recursivly) && deleted;
            }
        }
        return file.delete() && deleted;
    }

    /**
     * Gets the path names of the specified path. If the path is absolute the root is NOT inclueded!<br>
     * <br>
     * This will be always true: <br>
     * {@code path.equals(Files.getFile(Files.getRoot(path), Files.getPathNames(path))}<br>
     * <br>
     * Note: return type might change to List&lt;String&gt; with java v1.5
     * @param path the path
     * @return the path names. If the path is absolute the root is NOT inclueded!
     */
    public static String[] getPathNames(File path) {
        List<String> pathList = new ArrayList<String>();
        File currentPath = path;
        addPathName(currentPath, pathList);
        while (currentPath.getParentFile() != null) {
            currentPath = currentPath.getParentFile();
            addPathName(currentPath, pathList);
        }
        Collections.reverse(pathList);
        return pathList.toArray(new String[pathList.size()]);
    }

    /**
     * Gets a file from path names.
     * 
     * @param paths the path names
     * @return the file representing the specified path
     */
    public static File getFile(String... paths) {
            return getFile(null, paths);
    }

    /**
     * Gets a file from path names.
     * 
     * @param paths the path names
     * @return the file representing the specified path
     */
    public static File getFile(File parent, String... paths) {
        File currentFile = parent;
        for (int i = 0; i < paths.length; i++) {
            currentFile = new File(currentFile, paths[i]);
        }
        return currentFile;
    }

    /**
     * Get the root of an absolute file or directory.<br>
     * <br>
     * This will be always true: <br>
     * {@code path.equals(Files.getFile(Files.getRoot(path), Files.getPathNames(path))}<br>
     * <br>
     * @param file a file or directory
     * @return the root of the specified file or directory 
     *         or null if it is not absolute
     */
    public static File getRoot(File file) {
        if (file.isAbsolute()) {
            File currentFile = file;
            while (currentFile.getParentFile() != null) {
                currentFile = currentFile.getParentFile();
            }
            return currentFile;
        } else {
            return null;
        }
    }

    private static void addPathName(File currentPath, List<String> pathList) {
        if (!currentPath.isAbsolute() || currentPath.getParentFile() != null) {
            // avoid empty string from root
            pathList.add(currentPath.getName());
        }
    }
}

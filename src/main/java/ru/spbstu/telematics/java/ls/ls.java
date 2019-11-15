package ru.spbstu.telematics.java.ls;
import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class ls {
    public static void main(String[] args)
    {
        getFile();
    }
    static Set<String> getFile()
    {
        Set<String> testSet=new TreeSet<>();
        String p = System.getProperty("user.dir");
        File file = new File(p);
        File[] files = file.listFiles();
        if (files != null)
        {
            for (File img : files)
            {
                System.out.println(img.getName());
                testSet.add(img.getName());
            }
            return testSet;
        }
        else
        {
            System.out.println("Such path doesn't exist!");
            return null;
        }
    }
    static Set<String> getFile(String path)
    {
        Set<String> testSet=new TreeSet<>();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null)
        {
            for (File img : files)
            {
                System.out.println(img.getName());
                testSet.add(img.getName());
            }
            return testSet;
        }
        else
        {
            System.out.println("Such path doesn't exist!");
            return null;
        }
    }
}

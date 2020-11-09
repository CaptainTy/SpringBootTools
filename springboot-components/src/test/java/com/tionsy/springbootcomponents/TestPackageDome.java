package com.tionsy.springbootcomponents;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tiany
 * @version 1.0
 * @date Created in 2020年11月06日 11:17
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootComponentsApplication.class)
public class TestPackageDome {
    @Test
    public void test1() throws IOException {
        String str = "{\"status\":\"0000\",\"message\":\"success\",\"data\":{\"title\":{\"id\":\"001\",\"name\":\"白菜\"},\"content\":[{\"id\":\"001\",\"value\":\"你好 白菜\"},{\"id\":\"002\",\"value\":\"你好 萝卜\"}]}}";
        String filePath = "D:\\test\\test1.json";
        String tarFilePath = "D:\\test\\test1.tar";
        this.getTarFile(str, filePath, tarFilePath);
    }

    /**
     * 把数据打成tar包
     * @param str 数据字符串
     * @param filePath 存数据的文件 D:/test/test1.json
     * @param tarFilePath tar文件路径 D:/test/test1.tar
     * @throws IOException
     */
    private void getTarFile(String str, String filePath, String tarFilePath) throws IOException {
        //把数据写入本地json文件
        File outFile = new File(filePath);
        FileOutputStream fileOut = new FileOutputStream(outFile);
        fileOut.write(str.getBytes());
        //把json文件打成tar包
        File newFile = new File(tarFilePath);
        FileInputStream inputStream = new FileInputStream(filePath);
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(new FileOutputStream(newFile));
        tarOut.putArchiveEntry(new TarArchiveEntry(outFile,outFile.getName()));
        int len = 0;
        byte[] bytes = new byte[2048];
        while ((len = inputStream.read(bytes)) != -1){
            tarOut.write(bytes,0,len);
        }
        tarOut.closeArchiveEntry();
        tarOut.finish();
        inputStream.close();
        tarOut.close();
        fileOut.close();
    }

    @Test
    public void test2() throws IOException {
        String str = "{\"status\":\"0000\",\"message\":\"success\",\"data\":{\"title\":{\"id\":\"001\",\"name\":\"白菜\"},\"content\":[{\"id\":\"001\",\"value\":\"你好 白菜\"},{\"id\":\"002\",\"value\":\"你好 萝卜\"}]}}";
        String filePath = "D:\\test\\test1.json";
        String tarFilePath = "D:\\test\\test1.zip";
        getZipFile(str, filePath, tarFilePath);
        return;
    }

    /**
     * 把数据打成zip包
     * @param str 数据字符串
     * @param filePath 存数据的文件 D:/test/test1.json
     * @param tarFilePath tar文件路径 D:/test/test1.zip
     * @throws IOException
     */
    private void getZipFile(String str, String filePath, String tarFilePath) throws IOException {
        //把数据写入本地json文件
        File outFile = new File(filePath);
        FileOutputStream fileOut = new FileOutputStream(outFile);
        fileOut.write(str.getBytes());

        //把json文件打成zip包
        File newFile = new File(tarFilePath);
        FileInputStream inputStream = new FileInputStream(filePath);
        ZipArchiveOutputStream zipOut = new ZipArchiveOutputStream(new FileOutputStream(newFile));
        zipOut.putArchiveEntry(new ZipArchiveEntry(outFile,outFile.getName()));
        int len = 0;
        byte[] bytes = new byte[2048];
        while ((len = inputStream.read(bytes)) != -1){
            zipOut.write(bytes,0,len);
        }
        zipOut.closeArchiveEntry();
        zipOut.finish();
        inputStream.close();
        zipOut.close();
        fileOut.close();
    }

    @Test
    public void test3() throws IOException {
        String filePath = "D:/test";
        String tarFilePath = "D:/test/test1.tar";

        unTarFile(filePath, tarFilePath);
    }
    /**
     * 解压tar
     * @param unTarFilePath 要解压的路径 D:/test
     * @param tarFilePath 压缩文件路径 D:/test/test1.tar
     * @throws IOException
     */
    private void unTarFile(String unTarFilePath, String tarFilePath) throws IOException {
        File srcFile = new File(tarFilePath);
        // 判断源文件是否存在
        if (!srcFile.exists()) {
            throw new RuntimeException(srcFile.getPath() + "所指文件不存在");
        }

        TarArchiveInputStream tarInput = new TarArchiveInputStream(new FileInputStream(srcFile));
        TarArchiveEntry  entry;
        while ((entry = tarInput.getNextTarEntry()) != null) {
            String dir = unTarFilePath + File.separator + entry.getName();
            FileOutputStream fos = null;
            try {
                if (entry.isDirectory()) {
                    File file1 = new File(dir);
                    file1.mkdirs();
                } else {
                    File file2 = new File(dir);
                    fos = new FileOutputStream(file2);
                    int len;
                    byte[] bytes = new byte[2048];
                    while ((len = tarInput.read(bytes)) != -1){
                        fos.write(bytes,0,len);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }

    }

    @Test
    public void test4() throws IOException {
        String filePath = "D:/test";
        String zipFilePath = "D:/test/test1.zip";

        unZipFile(filePath, zipFilePath);
    }

    /**
     * 解压zip
     * @param unZipFilePath 要解压的路径 D:/test
     * @param zipFilePath 压缩文件路径 D:/test/test1.zip
     * @throws IOException
     */
    private void unZipFile(String unZipFilePath, String zipFilePath) throws IOException {
        File srcFile = new File(zipFilePath);
        // 判断源文件是否存在
        if (!srcFile.exists()) {
            throw new RuntimeException(srcFile.getPath() + "所指文件不存在");
        }

        ZipFile zipFile = new ZipFile(srcFile);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        while (entries.hasMoreElements()){
            ZipArchiveEntry entry = entries.nextElement();
            if (entry.isDirectory()){
                //文件夹
                String dirPath = unZipFilePath + File.separator + entry.getName();
                File dir = new File(dirPath);
                dir.mkdir();
            }else {
                // 如果是文件，就先创建一个文件，然后用io流把内容copy过去
                File targetFile = new File(unZipFilePath + File.separator + entry.getName());
                // 保证这个文件的父文件夹必须要存在
                if(!targetFile.getParentFile().exists()){
                    targetFile.getParentFile().mkdirs();
                }
                targetFile.createNewFile();

                // 将压缩文件内容写入到这个文件中
                InputStream is = zipFile.getInputStream(entry);
                FileOutputStream fos = new FileOutputStream(targetFile);
                int len;
                byte[] buf = new byte[1024];
                while ((len = is.read(buf)) != -1) {
                    fos.write(buf, 0, len);

                }
                // 关流顺序，先打开的后关闭
                fos.close();
                is.close();
            }
        }
    }

    @Test
    public void test5() throws IOException {
        String targetPath = "D:/test/test1.tar.gz";
        String filePath = "D:/test/test1.tar";
        getGzTarFile(targetPath, filePath);
    }

    /**
     * 将tar包打成tar.gz
     * @param targetPath 目标路径 D:/test/test1.tar.gz
     * @param filePath 要打包的源文件路径 D:/test/test1.tar
     * @throws IOException
     */
    private void getGzTarFile(String targetPath, String filePath) {
        try (InputStream inputStream = Files.newInputStream(Paths.get(filePath));
             GzipCompressorOutputStream gzipOut = new GzipCompressorOutputStream(new FileOutputStream(targetPath))) {
            byte[] buffer = new byte[2048];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                gzipOut.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test6() throws IOException {
        String targetPath = "D:/test/test1.tar";
        String filePath = "D:/test/test1.tar.gz";
        unGzTarFile(targetPath, filePath);
    }

    /**
     * 将tar.gz解压成tar
     * @param targetPath 目标文件路径 D:/test/test1.tar
     * @param filePath 源文件路径 D:/test/test1.tar.gz
     */
    private void unGzTarFile(String targetPath, String filePath) {
        try (GzipCompressorInputStream gcis = new GzipCompressorInputStream(new FileInputStream(filePath));
             OutputStream outputStream = new FileOutputStream(targetPath)) {
            byte[] buffer = new byte[2048];
            int len;
            while ((len = gcis.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}

package com.ecp.ecommerceproject.domain.valueobjects;

public class Image {

    private String URL;
    private int WIDTH;
    private int HEIGHT;
    private String fileType;
    private String path;
    private String fileName;



    public Image(String URL, int WIDTH, int HEIGHT, String fileType, String path, String fileName) {
        this.URL = URL;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.fileType = fileType;
        this.path = path;
        this.fileName = fileName;
    }

    private void setURL (){
        
    }


    public String getURL() {
        return this.URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getWIDTH() {
        return this.WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return this.HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}

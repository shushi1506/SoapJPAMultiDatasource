package com.soap.demo.endpoint.implemented.basic;

/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.implemented.basic
 */
public class FileSftp {
    private String encoded;
    private String fileName;
    private int type;

    public FileSftp() {
    }

    public String getEncoded() {
        return encoded;
    }

    public void setEncoded(String encoded) {
        this.encoded = encoded;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileSftp fileSftp = (FileSftp) o;

        if (type != fileSftp.type) return false;
        if (encoded != null ? !encoded.equals(fileSftp.encoded) : fileSftp.encoded != null) return false;
        return fileName != null ? fileName.equals(fileSftp.fileName) : fileSftp.fileName == null;
    }

    @Override
    public int hashCode() {
        int result = encoded != null ? encoded.hashCode() : 0;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }

    @Override
    public String toString() {
        return "FileSftp{" +
                "encoded='" + encoded + '\'' +
                ", fileName='" + fileName + '\'' +
                ", type=" + type +
                '}';
    }
}

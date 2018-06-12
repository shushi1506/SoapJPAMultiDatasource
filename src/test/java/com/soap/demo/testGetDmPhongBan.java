package com.soap.demo;

import com.google.zxing.WriterException;
import shushi.support.barcode.GeneralBarcode;

import java.io.IOException;


/**
 * @author anhbt 5/9/2018
 * com.soap.demo
 */
public class testGetDmPhongBan {
    public static void main(String[] args) throws IOException, WriterException {
//        ReadDanhMuc readDanhMuc =new ReadDanhMuc();
//        try {
//            List<DanhMucDonViQltb> example= readDanhMuc.getDmDonViQltb();
//            System.out.println("Size"+example.size());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        StateReponse t=new StateReponse();
//        System.out.println(Commons.checkString(t,"uyuyu","","3r4r34"));
//        String examp="ID;MA_DON_VI;TEN_DON_VI;DIA_CHI;SDT;MO_TA;NGUOI_TAO;NGAY_TAO;NGUOI_CAP_NHAT;NGAY_CAP_NHAT";
//        String[] temp = examp.split(";");
//        StringBuffer sb = new StringBuffer();
//        for (int i=0; i< temp.length;i++){
//            sb.append(toVariableCase(temp[i])).append(";");
//        }
//        System.out.println(sb.toString().trim());
        System.out.println(GeneralBarcode.imageBarcodeQrToBase64String("Hello girl","png",200,200));

    }
    public static String toVariableCase(String givenString) {

        String[] arr = givenString.toLowerCase().split("_");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1));
        }
        return Character.toLowerCase(sb.toString().trim().charAt(0)) + sb.toString().trim().substring(1);
    }
}

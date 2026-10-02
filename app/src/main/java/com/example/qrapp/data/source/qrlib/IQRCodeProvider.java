package com.example.qrapp.data.source.qrlib;

import android.graphics.Bitmap;

public interface IQRCodeProvider {
    Bitmap encode(String content, int width, int height) throws Exception;
    default Bitmap encode(String content, int width, int height, com.google.zxing.BarcodeFormat format) throws Exception {
        return encode(content, width, height);
    }
    default Bitmap encode(String content, int width, int height, com.google.zxing.BarcodeFormat format,
                          int foregroundColor, int backgroundColor) throws Exception {
        return encode(content, width, height, format);
    }
    com.google.zxing.Result decode(Bitmap bitmap) throws Exception;
}

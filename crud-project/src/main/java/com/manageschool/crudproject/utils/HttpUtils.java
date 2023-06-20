package com.manageschool.crudproject.utils;


import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Lớp này có chức năng thực hiện chuyển đổi dữ liệu String từ jsion - cast sang
 * dữ liệu của thực thể theo từng thuộc tính tương ứng
 */

public class HttpUtils {
    private String value;

    public HttpUtils(String value) {
        this.value = value;

    }

    public <T> T toModel(Class<T> entityClass) {
        try {
            return new ObjectMapper().readValue(value, entityClass);
        } catch (Exception e) {
            return null;
        }
    }
    // hàm này thực thi đọc dữ liệu String và a
    public static HttpUtils of(BufferedReader reader) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // trả về một đối tượng HttpUtils có giá trị khởi tạo là chuỗi string được cast
        // từ json -String
        return new HttpUtils(stringBuilder.toString());
    }

}

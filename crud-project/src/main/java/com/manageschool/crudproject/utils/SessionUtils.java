package com.manageschool.crudproject.utils;


import javax.servlet.http.HttpServletRequest;

public class SessionUtils {
    // sử dụng Singleton patern để khởi tạo và tái sử dụng sesstion.

    private static SessionUtils sessionUtils = null;

    public static SessionUtils getIntance() {
        if (sessionUtils == null) {
            sessionUtils = new SessionUtils();

        }
        return sessionUtils;
    }

    public SessionUtils() {

    }

    /*
     * putValueToSession: Client -> gửi dữ liệu đến server -> lưu vô database: ở
     * server ta dụng sesion để lưu dữ liệu của người dùng để khi yêu cầu dùng và
     * thực thi trong một số tác vụ khác
     *
     * getValueFromSession: lấy dữ liệu từ session và lưu nó vào biến key
     *
     * removeValueFromSession: thực thi xóa dữ liệu khi server tắt (người dùng thoát khỏi trang web)
     **/
    public void putValueToSession(String key, HttpServletRequest request, Object object) {
        request.getSession().setAttribute(key, object);
    }

    public Object getValueFromSession(String key, HttpServletRequest request) {
        return request.getSession().getAttribute(key);
    }

    public void removeValueFromSession(String key, HttpServletRequest request) {
        request.getSession().removeAttribute(key);
    }

}


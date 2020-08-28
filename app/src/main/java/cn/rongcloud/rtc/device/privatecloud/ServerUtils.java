package cn.rongcloud.rtc.device.privatecloud;

import static cn.rongcloud.rtc.util.UserUtils.USE_PRIVATE_CLOUD;

import android.text.TextUtils;
import cn.rongcloud.rtc.util.UserUtils;

public class ServerUtils {

    public static final String APP_KEY_KEY = "app_key_key";
    public static final String NAV_SERVER_KEY = "nav_server_key";
    public static final String APP_SECRET_KEY = "app_secret_key";
    public static final String API_SERVER_KEY = "api_server_key";
    public static final String MEDIA_SERVER_URL_KEY = "media_server_url_key";
    public static final String TOKEN_PRIVATE_CLOUD_KEY = "token_private_cloud_key";

    // 记录用户输入的私有云地址
    public static String APP_KEY = "";
    public static String NAV_SERVER = "";
    public static String APP_SECRET = "";
    public static String API_SERVER = ""; // 和secret请求token
    public static String MEDIA_SERVER = "";

    /**
     * 私有云获取token字段不为空时，执行私有云获取token开始音视频会议
     *
     * @return
     */
    public static boolean getTokenConnection() {
        if (!TextUtils.isEmpty(APP_KEY)
                && !TextUtils.isEmpty(APP_SECRET)
                && !TextUtils.isEmpty(NAV_SERVER)
                && !TextUtils.isEmpty(API_SERVER)) {
            return true;
        }
        return false;
    }


    public static String getAppKey() {
        return TextUtils.isEmpty(ServerUtils.APP_KEY) ? UserUtils.APP_KEY : ServerUtils.APP_KEY;
    }

    /** 0:公有云 1:私有云 */
    public static boolean usePrivateCloud() {
        return USE_PRIVATE_CLOUD == 1;
    }
}

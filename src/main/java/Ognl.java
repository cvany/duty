import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * 自提柜校验接口
 *  保留原因：xml数据库映射中有用到
 *
 * @author sandy
 * @version v1.0.0
 * @date 2017/7/13
 */
@Component
public class Ognl {
    private Ognl() {
    }

    public static boolean isEmpty(Object o) throws IllegalArgumentException {
        if (o == null) {
            return true;
        } else {
            if (o instanceof String) {
                if (((String) o).length() == 0) {
                    return true;
                }
            } else if (o instanceof Collection) {
                if (((Collection) o).isEmpty()) {
                    return true;
                }
            } else if (o.getClass().isArray()) {
                if (Array.getLength(o) == 0) {
                    return true;
                }
            } else {
                if (!(o instanceof Map)) {
                    return false;
                }

                if (((Map) o).isEmpty()) {
                    return true;
                }
            }

            return false;
        }
    }

    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

    public static boolean isNotBlank(Object o) {
        return !isBlank(o);
    }

    public static boolean isNumber(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Number) {
            return true;
        } else if (o instanceof String) {
            String str = (String) o;
            return str.length() == 0 ? false : (str.trim().length() == 0 ? false : StringUtils.isNumeric(str));
        } else {
            return false;
        }
    }

    public static boolean isBlank(Object o) {
        if (o == null) {
            return true;
        } else if (o instanceof String) {
            String str = (String) o;
            return isBlank(str);
        } else {
            return false;
        }
    }

    public static boolean isBlank(String str) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length(); ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean isNeedTenantId(Integer tenantId) {
        return tenantId == null ? false : tenantId.intValue() >= -1;
    }
}


package com.teenyda.utils;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 对象拷贝 - 优雅的解决方案 Mapstruct
 * https://yunlongn.github.io/2019/05/29/%E5%AF%B9%E8%B1%A1%E6%8B%B7%E8%B4%9D-%E4%BC%98%E9%9B%85%E7%9A%84%E8%A7%A3%E5%86%B3%E6%96%B9%E6%A1%88-Mapstruct/
 */

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-08 10:55
 * @description: 对象克隆
 * https://www.cnblogs.com/Johnson-lin/p/12123012.html
 **/

public class CloneBeanUtils extends BeanUtils {

    public interface CloneBeanUtilsCallBack<S, T> {
        void callBack(S t, T s);
    }

    public static <S, T> T copyProperties(S source,Class<T> clazz){
        if (source == null)
            return null;


        T t = null;

        try {

            t = clazz.getDeclaredConstructor().newInstance();
            copyProperties(source, t);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        return t;
    }

    public static <S, T> List<T> copyListProperties(List<S> source, Supplier<T> target){
        return copyListProperties(source, target, null);
    }

    /**
     * @author Johnson
     * 使用场景：Entity、Bo、Vo层数据的复制，因为BeanUtils.copyProperties只能给目标对象的属性赋值，却不能在List集合下循环赋值，因此添加该方法
     * 如：List<AdminEntity> 赋值到 List<AdminVo> ，List<AdminVo>中的 AdminVo 属性都会被赋予到值
     * S: 数据源类 ，T: 目标类::new(eg: AdminVo::new)
     */
    public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target, CloneBeanUtilsCallBack<S, T> callBack) {
        List<T> list = new ArrayList<>(sources.size());
        for (S source : sources) {
            T t = target.get();
            copyProperties(source, t);
            if (callBack != null) {
                // 回调
                callBack.callBack(source, t);
            }
            list.add(t);
        }
        return list;
    }
}

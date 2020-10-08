package com.teenyda.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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

    public static <S, T> List<T> copyListProperties(List<S> source, Supplier<T> target){
        return copyListProperties(source, target);
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

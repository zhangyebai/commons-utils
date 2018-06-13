package com.yebai.common.utils.generator;

import com.yebai.common.utils.anno.RandomInt;
import com.yebai.common.utils.anno.RandomString;

import java.lang.reflect.Field;

public class ClassUtil {
	private ClassUtil(){}

	public static <T> T build(Class<T> clazz){
		try {
			final T t =  clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			Field.setAccessible(fields, true);
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.isAnnotationPresent(RandomString.class)) {
					RandomString randomString = field.getDeclaredAnnotation(RandomString.class);
					field.set(t, RandomUtil.randomString(randomString.length()));
				} else if (field.isAnnotationPresent(RandomInt.class)) {
					RandomInt randomInt = field.getDeclaredAnnotation(RandomInt.class);
					field.set(t, RandomUtil.randomInt(randomInt.range()));
				}
			}
			return t;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
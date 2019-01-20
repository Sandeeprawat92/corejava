package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		String x = "click";

		Method method = TestReflection.class.getMethod(x, String.class);
		method.invoke(method, "Test the db");

	}

	public static void click(String x) {
		System.out.println(x);

	}
}

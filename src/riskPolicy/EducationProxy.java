package riskPolicy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;


public class EducationProxy implements InvocationHandler{
	
	private SortedMap<Integer, Class<? extends Result>> claszzMap;
	
	private EducationProxy(SortedMap<Integer, Class<? extends Result>> clazzMap){
		this.claszzMap = clazzMap;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		for (Class<? extends Result> clazz : claszzMap.values()) {
			
			Integer	result = (Integer) method.invoke(clazz.newInstance(), args);
		
			return result;
		}
		return null;
	}
	
	public static Result getFroxy(SortedMap<Integer, Class<? extends Result>> clazzMap){
		return (Result) Proxy.newProxyInstance(EducationProxy.class.getClassLoader(), new Class<?>[]{Result.class}, new EducationProxy(clazzMap));
	}

}

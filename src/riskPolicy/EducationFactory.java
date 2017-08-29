package riskPolicy;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class EducationFactory {
	
	private static final String CAL_PRICE_PACKAGE = "riskPolicy";
	
	private ClassLoader classLoader = getClass().getClassLoader();
	
	private List<Class<? extends Result>> resultList;
	
	private EducationFactory(){
		init();
	}
	
	//根据对应的熟悉来获取对应的策略
	public Result createResult(Education education){
		SortedMap<Integer, Class<? extends Result>> clazzMap = new TreeMap<>();
		//扫描注解查找正确的策略
		for (Class<? extends Result> clazz : resultList) {
			Annotation validRegion = handleAnnotation(clazz);
			if(validRegion instanceof EducationRegion){
				EducationRegion educationRegion = (EducationRegion) validRegion;
				if(education.getValue() != 7){
					clazzMap.put(educationRegion.education(),clazz);
				}else{
					clazzMap.put(7,clazz);
				}
			}
		}
		return EducationProxy.getFroxy(clazzMap);
	}
	
	private Annotation handleAnnotation(Class<? extends Result> clazz) {
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if(annotations == null || annotations.length == 0){
			return null;
		}
		for (int i = 0; i < annotations.length; i++) {
			if(annotations[i] instanceof EducationRegion){
				return (EducationRegion) annotations[i];
			}
		}
		return null;
	}

	private void init() {
		resultList = new ArrayList<>();
		File[] resoures = getResorces();
		Class<Result> resultClass = null;
		try {
			resultClass = (Class<Result>) classLoader.loadClass(Result.class.getName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("未找到策略接口");
		}
		for (int i = 0; i < resoures.length; i++) {
			try {
				Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resoures[i].getName().replace(".class", ""));
				if(Result.class.isAssignableFrom(clazz) && clazz != resultClass){
					resultList.add((Class<? extends  Result>) clazz);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}

	private File[] getResorces() {
		
		try {
			File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".","/")).toURI());
			return file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					if(pathname.getName().endsWith(".class")){
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("资源未找到");
		}
	}
	
	public static EducationFactory getInstance(){
		return EducationFactoryInstance.instance ;
	}
	
	public static class EducationFactoryInstance{
		private static EducationFactory instance = new EducationFactory();
	}

}

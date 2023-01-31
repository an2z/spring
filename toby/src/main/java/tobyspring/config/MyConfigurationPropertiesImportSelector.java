package tobyspring.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

/**
 * 임포트 할 클래스의 이름을 반환
 */
public class MyConfigurationPropertiesImportSelector implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		MultiValueMap<String, Object> attr = importingClassMetadata.getAllAnnotationAttributes(
			EnableMyConfigurationProperties.class.getName());

		Class propertyClass = (Class)attr.getFirst("value");

		return new String[] {propertyClass.getName()};
	}
}

/**
 * 
 */
package net.paoding.rose.jade.plugin.sql.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import net.paoding.rose.jade.plugin.sql.Order.Direction;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * 用于标识JavaBean属性与数据库标映射关系的Annotation。
 * @author Alan.Geng[gengzhi718@gmail.com]
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

	/**
	 * 列名，不指定则按规范自动生成。
	 * @return
	 */
	String value() default "";
	
	/**
	 * 是否为主键，默认false。
	 * @return
	 */
	boolean pk() default false;
	
	/**
	 * 默认排序
	 * @return
	 */
	Direction order() default Direction.NONE;
}




/**
 * @FileName: MyJavaTypeResolver.java
 * @Package com.ziroom.sms.generator
 * 
 * @author bushujie
 * @created 2015-9-25 下午2:37:34
 * 
 * Copyright 2011-2015 asura
 */

import java.math.BigDecimal;
import java.sql.Types;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl.JdbcTypeInformation;

/**
 * <p>TODO</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改�?		修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
public class MyJavaTypeResolver implements JavaTypeResolver{
	
	private Map<Integer, JdbcTypeInformation> typeMap;
	
	private boolean forceBigDecimals;
	
	 static final int NVARCHAR = -9;
	 static final int NCHAR = -15;
	 static final int NCLOB = 2011;
	
	public  MyJavaTypeResolver(){
		typeMap = new HashMap<Integer, JdbcTypeInformation>();

        typeMap.put(Types.ARRAY, new JdbcTypeInformation("ARRAY", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.BIGINT, new JdbcTypeInformation("BIGINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Long.class.getName())));
        typeMap.put(Types.BINARY, new JdbcTypeInformation("BINARY", //$NON-NLS-1$
                new FullyQualifiedJavaType("byte[]"))); //$NON-NLS-1$
        typeMap.put(Types.BIT, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.BLOB, new JdbcTypeInformation("BLOB", //$NON-NLS-1$
                new FullyQualifiedJavaType("byte[]"))); //$NON-NLS-1$
        typeMap.put(Types.BOOLEAN, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.CHAR, new JdbcTypeInformation("CHAR", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.CLOB, new JdbcTypeInformation("CLOB", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.DATALINK, new JdbcTypeInformation("DATALINK", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.DATE, new JdbcTypeInformation("DATE", //$NON-NLS-1$
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.DISTINCT, new JdbcTypeInformation("DISTINCT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.DOUBLE, new JdbcTypeInformation("DOUBLE", //$NON-NLS-1$
                new FullyQualifiedJavaType(Double.class.getName())));
        typeMap.put(Types.FLOAT, new JdbcTypeInformation("FLOAT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Double.class.getName())));
        typeMap.put(Types.INTEGER, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.JAVA_OBJECT, new JdbcTypeInformation("JAVA_OBJECT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.LONGVARBINARY, new JdbcTypeInformation(
                "LONGVARBINARY", //$NON-NLS-1$
                new FullyQualifiedJavaType("byte[]"))); //$NON-NLS-1$
        typeMap.put(Types.LONGVARCHAR, new JdbcTypeInformation("LONGVARCHAR", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(NCHAR, new JdbcTypeInformation("NCHAR", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(NCLOB, new JdbcTypeInformation("NCLOB", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(NVARCHAR, new JdbcTypeInformation("NVARCHAR", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
        typeMap.put(Types.NULL, new JdbcTypeInformation("NULL", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.OTHER, new JdbcTypeInformation("OTHER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.REAL, new JdbcTypeInformation("REAL", //$NON-NLS-1$
                new FullyQualifiedJavaType(Float.class.getName())));
        typeMap.put(Types.REF, new JdbcTypeInformation("REF", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Short.class.getName())));
        typeMap.put(Types.STRUCT, new JdbcTypeInformation("STRUCT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Object.class.getName())));
        typeMap.put(Types.TIME, new JdbcTypeInformation("TIME", //$NON-NLS-1$
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.TIMESTAMP, new JdbcTypeInformation("TIMESTAMP", //$NON-NLS-1$
                new FullyQualifiedJavaType(Date.class.getName())));
        typeMap.put(Types.TINYINT, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.VARBINARY, new JdbcTypeInformation("VARBINARY", //$NON-NLS-1$
                new FullyQualifiedJavaType("byte[]"))); //$NON-NLS-1$
        typeMap.put(Types.VARCHAR, new JdbcTypeInformation("VARCHAR", //$NON-NLS-1$
                new FullyQualifiedJavaType(String.class.getName())));
	}

	/* (non-Javadoc)
	 * @see org.mybatis.generator.api.JavaTypeResolver#addConfigurationProperties(java.util.Properties)
	 */
	@Override
	public void addConfigurationProperties(Properties arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.mybatis.generator.api.JavaTypeResolver#calculateJavaType(org.mybatis.generator.api.IntrospectedColumn)
	 */
	@Override
	public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
		FullyQualifiedJavaType answer;  
        JdbcTypeInformation jdbcTypeInformation = typeMap.get(introspectedColumn.getJdbcType());  
        if (jdbcTypeInformation == null) {  
            switch (introspectedColumn.getJdbcType()) {  
            case Types.DECIMAL:  
            case Types.NUMERIC:
                if(introspectedColumn.getScale() > 0)  
                {//如果包含小数点则转换成float  
                    answer = new FullyQualifiedJavaType(Double.class.getName());  
                }else{  
                    if ( introspectedColumn.getLength() > 18  
                            || forceBigDecimals) {  
                        answer = new FullyQualifiedJavaType(BigDecimal.class  
                                .getName());  
                    } else if (introspectedColumn.getLength() > 10) {  
                        answer = new FullyQualifiedJavaType(Integer.class.getName());  
                    } else if (introspectedColumn.getLength() > 4) {  
                        answer = new FullyQualifiedJavaType(Integer.class.getName());  
                    } else {  
                        answer = new FullyQualifiedJavaType(Integer.class.getName());  
                    }  
                }
                introspectedColumn.setJdbcTypeName("DECIMAL");
                break;  

            default:  
                answer = null;
                break;  
            }  
        } else {  
        	introspectedColumn.setJdbcTypeName(jdbcTypeInformation.getJdbcTypeName());
            answer = jdbcTypeInformation.getFullyQualifiedJavaType();  
        }  

        return answer;  
	}

	/* (non-Javadoc)
	 * @see org.mybatis.generator.api.JavaTypeResolver#calculateJdbcTypeName(org.mybatis.generator.api.IntrospectedColumn)
	 */
	@Override
	public String calculateJdbcTypeName(IntrospectedColumn arg0) {
		// TODO Auto-generated method stub
		return arg0.getJdbcTypeName();
	}

	/* (non-Javadoc)
	 * @see org.mybatis.generator.api.JavaTypeResolver#setContext(org.mybatis.generator.config.Context)
	 */
	@Override
	public void setContext(Context arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.mybatis.generator.api.JavaTypeResolver#setWarnings(java.util.List)
	 */
	@Override
	public void setWarnings(List<String> arg0) {
		// TODO Auto-generated method stub
		
	}
}

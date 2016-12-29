package com.wu.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class VelocityUtil {
	
	public static String fillTemplate(String templateStr,Object o){
		VelocityContext context = new VelocityContext();
		Template template = Velocity.getTemplate(templateStr, "utf-8");
		context.put("o", o);
		StringWriter stringWriter = new StringWriter();
		template.merge(context, stringWriter);
		return stringWriter.toString();
	}
}

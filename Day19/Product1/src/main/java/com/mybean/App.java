package com.mybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        //ctx.register(AppConfig.class);
        ctx.scan("com.mybean");//packagename
        ctx.refresh();
        Product product=ctx.getBean(Product.class,"tea");
        Company com=ctx.getBean(Company.class);
        
        
        System.out.println(product);
        System.out.println(com.getCompanyInfo());
        
    }
}

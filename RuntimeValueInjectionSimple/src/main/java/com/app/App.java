package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.ExpressiveConfig1;
import com.interfaces.CompactDisc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExpressiveConfig1.class);
        CompactDisc cd = ctx.getBean(CompactDisc.class);
        cd.play();
    }
}

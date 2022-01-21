package com.botidev_hibernate.hibernate_project;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// configurar o arquivo para receber os parametros de conexao com o banco
    	
    	org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Song.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
        
    	Session session = sessionFactory.openSession();
    	
    	
    	Song s3 = new Song();
    	s3.setId(3);
    	s3.setSongName("Meu Pedaço de Pecado");
    	s3.setArtista("João Gomes");
    	
    	session.beginTransaction();
    	session.save(s3);
    	session.getTransaction().commit();
    	session.close();
    	
    	System.out.println("Salvando os dados");
    	
    	
    }
}

package com.botidev_hibernate.hibernate_project;

import java.lang.module.Configuration;
import java.util.ArrayList;

import javax.persistence.Query;

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
    	
    	
    	Song s6 = new Song();
    	s6.setId(7);
    	s6.setSongName("Bla Bla");
    	s6.setArtista("Marilia");
    	
    	session.beginTransaction();
    	session.save(s6);
    	session.getTransaction().commit();
    	
    	
    	session.beginTransaction();
    	
    	Query consulta = session.createQuery("Select songname from Song songname");
    	ArrayList<Song> songs;
    	songs = (ArrayList<Song>) consulta.getResultList();
    	
    	for (Song song : songs) {
			
    		System.out.println(song.getSongName());
		}
    	
    	session.getTransaction().commit();
    	
    	System.out.println("Salvando os dados");
    	
    	
    	
    	session.close();
    	
    	
    }
}

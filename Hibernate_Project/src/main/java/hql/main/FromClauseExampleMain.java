package hql.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import entertainment.entity.annotations.Movie;

public class FromClauseExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtils.getSessionFactory();
				Session sessionRef=sf.openSession();
					){
			String hqlQuery="from Movie m";
			Class<Movie>movieType=Movie.class;
			Query<Movie>queryRef=sessionRef.createQuery(hqlQuery,movieType);
			List<Movie>movieList=queryRef.list();
			for(Movie currentMovie:movieList)
				System.out.println(currentMovie);
			System.out.println("--------------------");
			for(Movie currentMovie:movieList)
				System.out.println(currentMovie.getTitle());
			
			
			
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}

package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {


		System.out.println("Added to database with Jdbc  "+ category.getCategoryName());
		
	}

}

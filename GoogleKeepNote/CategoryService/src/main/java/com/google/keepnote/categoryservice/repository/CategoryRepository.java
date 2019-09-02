package com.google.keepnote.categoryservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.google.keepnote.categoryservice.model.Category;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */
@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

	/*
	 * Apart from the standard CRUD methods already available in Mongo Repository,
	 * based on our requirements, we might need to create few methods for getting
	 * specific data from the datasource.
	 */

	/*
	 * This method will search for all categories in data source which are created
	 * by specific user.
	 *
	 */
	List<Category> findAllCategoryByCategoryCreatedBy(String createdBy);
}

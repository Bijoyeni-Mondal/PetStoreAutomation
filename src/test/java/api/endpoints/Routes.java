package api.endpoints;

/*
 * Swagger URI --> https://petstore.swagger.io
 * 
 * Create user(post)--> https://petstore.swagger.io/v2/user
 * Get user(get)-->https://petstore.swagger.io/v2/user/{username}
 * Update user(put)--> https://petstore.swagger.io/v2/user/{username}
 * Delete user(delete)--> https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2"; //static use for directly call it by class name no need to create object
	
	//user module
	public static String post_url =base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String put_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
}

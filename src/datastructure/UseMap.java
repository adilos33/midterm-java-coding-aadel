package datastructure;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */




		public class MapExample {
			public static void main(String[] args) {
				// Create a Map with String keys and List<String> values
				Map<String, List<String>> dataMap = new HashMap<>();

				List<String> citiesInUSA = new ArrayList<>();
				citiesInUSA.add("New York");
				citiesInUSA.add("Los Angeles");
				citiesInUSA.add("Chicago");
				dataMap.put("USA", citiesInUSA);

				List<String> citiesInIndia = new ArrayList<>();
				citiesInIndia.add("Mumbai");
				citiesInIndia.add("Delhi");
				citiesInIndia.add("Bangalore");
				dataMap.put("India", citiesInIndia);

				System.out.println("Map operations:");

				System.out.println("\nRetrieving data using For Each loop:");
				for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
					String country = entry.getKey();
					List<String> cities = entry.getValue();

					System.out.println("Country: " + country);
					System.out.println("Cities: " + cities);
				}

				System.out.println("\nRetrieving data using while loop with Iterator:");
				for (String country : dataMap.keySet()) {
					List<String> cities = dataMap.get(country);

					System.out.println("Country: " + country);
					System.out.println("Cities: " + cities);
				}

				storeDataInDatabase(dataMap);
			}

			private static void storeDataInDatabase(Map<String, List<String>> dataMap) {
				String url = "jdbc:mysql://localhost:3306/your_database_name";
				String user = "your_username";
				String password = "your_password";

				try (Connection connection = DriverManager.getConnection(url, user, password)) {
					String sql = "INSERT INTO country_cities (country, city) VALUES (?, ?)";
					try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
						for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
							String country = entry.getKey();
							List<String> cities = entry.getValue();

							for (String city : cities) {
								preparedStatement.setString(1, country);
								preparedStatement.setString(2, city);
								preparedStatement.executeUpdate();
							}
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}


	}

}

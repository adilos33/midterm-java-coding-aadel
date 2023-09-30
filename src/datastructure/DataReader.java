package datastructure;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


			public static void mainfor String
		(String[]) {
				String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt"){

		}


		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
					String line;
					while ((line = reader.readLine()) != null) {
						String[] words = line.split("\\s+");

						Stack<String> stack = new Stack<>();
						LinkedList<String> linkedList = new LinkedList<>();

						for (String word : words) {
							stack.push(word);
							linkedList.add(word);
						}

						System.out.println("Stack operations:");
						while (!stack.isEmpty()) {
							System.out.println("Pop: " + stack.pop());
						}

						System.out.println("\nLinkedList operations:");
						for (String word : linkedList) {
							System.out.println("FIFO: " + word);
						}

						storeDataInDatabase(linkedList);
						retrieveDataFromDatabase();
					}
				} catch (IOException | SQLException e) {
					e.printStackTrace();
				}
			}

			private static void storeDataInDatabase(LinkedList<String> linkedList) throws SQLException {
				String url = "jdbc:mysql://localhost:3306/mydb";

				String user = "root";
				String password = "@33Jadaya";

				try (Connection connection = DriverManager.getConnection(url, user, password)) {
					String sql = "INSERT INTO words (word) VALUES (?)";
					try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
						for (String word : linkedList) {
							preparedStatement.setString(1, word);
							preparedStatement.executeUpdate();
						}
					}
				}
			}

			private static void retrieveDataFromDatabase() throws SQLException {
				String url = "jdbc:mysql://localhost:3306/your_database_name";
				String user = "your_username";
				String password = "your_password";

				try (Connection connection = DriverManager.getConnection(url, user, password)) {
					String sql = "SELECT word FROM words";
					try (Statement statement = connection.createStatement()) {
						ResultSet resultSet = statement.executeQuery(sql);

						System.out.println("\nData retrieved from the database:");
						while (resultSet.next()) {
							System.out.println("Database: " + resultSet.getString("word"));
						}
					}
				}
			}
		}




	}


 // the missing number is 9
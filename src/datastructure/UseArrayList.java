package datastructure;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * into one of the databases.Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data
		 * 
		 */




		public class ArrayListExample {
			public static void main(String[] args) {
				ArrayList<Integer> arrayList = new ArrayList<>();
				arrayList.add(5);
				arrayList.add(2);
				arrayList.add(8);
				arrayList.add(1);
				arrayList.add(7);

				System.out.println("ArrayList operations:");

				arrayList.add(6);

				int peekedElement = arrayList.get(2);
				System.out.println("Peeked element: " + peekedElement);

				arrayList.remove(3);

				System.out.println("\nRetrieving elements using For Each loop:");
				for (int num : arrayList) {
					System.out.println(num);
				}

				System.out.println("\nRetrieving elements using while loop with Iterator:");
				Iterator<Integer> iterator = arrayList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

				Collections.sort(arrayList);

				storeSortedDataInDatabase(arrayList);
			}

			private static void storeSortedDataInDatabase(ArrayList<Integer> sortedList) {
				String url = "jdbc:mysql://localhost:3306/mydb";
				String user = "root";
				String password = "@33Jadaya";

				try (Connection connection = DriverManager.getConnection(url, user, password)) {
					String sql = "INSERT INTO sorted_numbers (number) VALUES (?)";
					try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
						for (int number : sortedList) {
							preparedStatement.setInt(1, number);
							preparedStatement.executeUpdate();
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}



	}

}


public class CheckLoadJDBC {

	public static void main(String[] args) throws InstantiationException,IllegalAccessException {
		// TODO 自動生成されたメソッド・スタブ
		String msg ="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバのロードに成功したお";
		}catch (ClassNotFoundException e){
			msg = "ドライバのロードに失敗したお";
		}
		System.out.println(msg);

	}

}

package cn.com;

public class Database {
public static void main(String [] args){
	try{ 
	    Class.forName("com.mysql.jdbc.Driver");
	    }
	catch(ClassNotFoundException  e)  {}
}
}

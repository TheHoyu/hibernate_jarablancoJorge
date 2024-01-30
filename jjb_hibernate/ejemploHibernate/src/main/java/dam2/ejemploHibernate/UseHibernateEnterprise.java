package dam2.ejemploHibernate;

public class UseHibernateEnterprise {

	public static void main(String[] args) {



		HibernateEnterprise bbdd = new HibernateEnterprise(); 

		bbdd.addProduct("Monitor 32'' 120hz  ",500); 

		bbdd.deleteProductById(11);
		bbdd.showProducts(); 
		System.out.println("-------/////////---------------------------------");

		System.out.println("----------------------------------------");
		bbdd.updateProductById(5,"disco duro kingston",105); 
		bbdd.updateProductById(8,"disdo duro seagate ",155);
		bbdd.close();


	}
}

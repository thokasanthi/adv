package Jdbcproduct;

public class Product 
{
int proid;
String proname;
double proprice;
public Product(int proid, String proname, double proprice) {
	super();
	this.proid = proid;
	this.proname = proname;
	this.proprice = proprice;
	
}
public int getProid() {
	return proid;
}
public void setProid(int proid) {
	this.proid = proid;
}
public String getProname() {
	return proname;
}
public void setProname(String proname) {
	this.proname = proname;
}
public double getProprice() {
	return proprice;
}
public void setProprice(double proprice) {
	this.proprice = proprice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [proid=" + proid + ", proname=" + proname + ", proprice=" + proprice + "]";
}

	

	
}




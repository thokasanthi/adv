// function method
function greet()
{
	document.write("Good morning Sathya"+" <br>")
}
// add method
function add(num1,num2)
{
	let res;
	res=num1+num2;
	document.write("Addtion.."+res+"<br>");
}
// billcalc method
function billcalc(name,price,quantity)
{
	let totalbill;
	totalbill=price*quantity;
	return totalbill;
}
// function calling
greet();
add(10,20);
let bill=billcalc("suger",89.45,3);
document.write("your bill.."+ bill +"<br>");
let res=dummy();
document.write("dummy return value..."+res);
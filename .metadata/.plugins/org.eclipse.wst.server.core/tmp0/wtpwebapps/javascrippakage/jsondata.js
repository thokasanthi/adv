let jsonData=
{
	"rollno":1234,
	"firstname":"santhi",
	"lastname":"kumari",
	"middlename":null,
	"hobbies":["cricket","teaching"],
	"marks":[99,98,99,98],
	"single":false,
	"salary":55000.50
}
//adding the data
console.log("rollno:",jsonData.rollno);
console.log("fistname:",jsonData.firstname);
console.log("lastname:",jsonData.lastname);
console.log("middlename:",jsonData.middlename);
console.log("hobbies:",jsonData.hobbies[1]);
console.log("marks:",jsonData.marks[1]);
console.log("single:",jsonData.single);
console.log("salary:",jsonData.salary)
//jsonData
let Data=
{
	"name":"johndoe",
	"age":30,
	"isstudent":false,
	"grades":[90,85,92],
	"address":{"city":"new york","state":"Ny"},
	"isEmployed":null	
}
// adding data
console.log("name:",Data.name);
console.log("age:",Data.age);
console.log("isstudent:",Data.isstudent);
console.log("address:",Data.address[1]);
console.log("isEmployee:",Data.isEmployed);

//pepole data
let peopl=
{
	"fruits":["apple","orange","bannan"],
	"number":[1,2,3,4,5],
	"people":[{"name":"alice","age":25},{"name":"Bob","age":30}]

}
//adding data
console.log("fruits:",peopl.fruits[1]);
console.log("number:",peopl.number[3]);
console.log("people:",peopl.people[0]);
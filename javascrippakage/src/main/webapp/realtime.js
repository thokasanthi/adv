let myData=
{"rollno":1234,
"firstname":"addanni",
"lastname":"ratan",
"middlename":null,
"hobbies":["cricket","technics"],
"marks":[99,98,99,98],
"markritalstart":true,
"salary":55000.50
};
// accesing individual properties
console.log("rollno:",myData.rollno);
console.log("firstname:",myData.firstname);
console.log("lastname:",myData.lastname);
console.log("markritalstart",myData.markritalstart);
console.log("hobbies",myData.hobbies);
console.log("middlename",myData.middlename);
// accessing array elements
console.log("All hobbies:",myData.hobbies);
console.log("first hobbies:",myData.hobbies[0]);
console.log("second mark:",myData.marks[1]);
// join data
let jsonData=
{
	"stu-id":"ABC123",
	"status":true,
	"marks":[40,79,30],
	"teachers":[{"good":["ratan","anu"],"bad":["ramesh","mahesh"]}]
};
// accesing properties
console.log("stu-id:",jsonData);
console.log("status:",jsonData);
console.log("second marks:",jsonData.marks[1]);
console.log("techers:",jsonData.good[1]);
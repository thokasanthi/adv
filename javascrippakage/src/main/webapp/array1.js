//concat method
let numbers1=[1,2];
let numbers2=[3,4];
let combined=numbers1.concat(numbers2);
console.log(combined);
//joining method
let fruits=['apple','banana','orange'];
let joinedstring=fruits.join(',');
console.log(joinedstring);
// finallocation
let Location=["myapp","javaprogram","rathan.text"];
let finalLocation=Location.join("/");
console.log(finalLocation);
// indexof method
let Numbers=["apple","banana","orange"];
let res1=Numbers.indexOf("orange");
console.log(res1);
// anothe exaple
let res2=Numbers.indexOf("mango");
console.log(res2);
// foreach
let fruirts=["apple","mango","banana","orang","graphs"];
fruirts.forEach(fruirts=>console.log(fruirts))
let f=["apple","mango","banana","orang","graphs"];

// map method
let names=["chilaka","malaka","gilaka","pilaka"];
let finalnames=names.map(names=>names+"nice");
console.log(finalnames);
// map prices
let price=[10,56,36,56];
let finalprice=price.map(price=>price+100);
console.log(finalprice);
//filter method
var names1=["ranu","ravi","anu","raji","gaji","baji","rahul"];
var result=names1.filter(names1=>names1.startsWith("r"));
console.log(result);
// filter salar>10000
var salaries=[1000,5666,12000,30000];
var result1=salaries.filter(salaries=>salaries>10000);
console.log(result1);
// start with len==5 add nice
var names2=["raju","ratan","ramya","santhi","jayama"];
var filtername=names2.filter(names1=>names1.startsWith&& names1.length===5)
.map(names1=>names1+"nice");
console.log(filtername);
// reduce type
var prices=[10,46,34,34,56];
var result=prices.reduce((p1,p2)=>p1+p2);
console.log(result);
//salary<10000 add+500 all salary
var salaries=[10000,5666,20000,30000]
var result=salaries.filter(salaries=>salaries<10000)
.map(salaries=>salaries+500)
.reduce((s1,s2)=>s1+s2);
console.log(result);
